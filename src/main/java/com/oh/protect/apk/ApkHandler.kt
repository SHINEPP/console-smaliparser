package com.oh.protect.apk

import com.oh.protect.apk.zip.IZipHandler
import com.oh.protect.apk.zip.ZipAlignCommand
import com.oh.protect.apk.zip.ZipHandlerFactory
import com.oh.protect.dex.DexProcessor
import com.oh.protect.model.copyToWithClose
import com.oh.protect.smali.parser.SmaliReader
import java.io.File
import java.io.InputStream
import java.util.regex.Pattern
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import java.util.zip.ZipOutputStream

class ApkHandler(apkPath: String) {

    companion object {
        private const val EXTENSION_DEX = "dex"
        private const val EXTENSION_SMALI = "smali"

        private const val AES_KEY = "aoivgnafoeanvoai"
        private const val ASSETS_DYNAMIC_DEX_ZIP_NAME = "fab924bcbaacacd28eadec7e"
    }

    private val apk = File(apkPath)
    private val buildDir = File(apk.parentFile, "build")
    private val intermediatesDir = File(buildDir, "intermediates")
    private val outputsDir = File(buildDir, "outputs")

    private val dexDir = File(intermediatesDir, "dex")
    private val smaliDir = File(intermediatesDir, "smali")
    private val smaliKeepDir = File(intermediatesDir, "smali_keep")
    private val smaliDynamicDir = File(intermediatesDir, "smali_dynamic")
    private val dexKeepDir = File(intermediatesDir, "dex_keep")
    private val dexDynamicDir = File(intermediatesDir, "dex_dynamic")
    private val outputApkDir = File(outputsDir, "apk")
    private val outputDynamicDir = File(outputsDir, "dynamic")

    private val pattern = Pattern.compile("^classes(\\d*)\\.dex\$")

    init {
        dexDir.deleteRecursively()
        smaliDir.deleteRecursively()
        smaliKeepDir.deleteRecursively()
        smaliDynamicDir.deleteRecursively()
        dexKeepDir.deleteRecursively()
        dexDynamicDir.deleteRecursively()
        outputApkDir.deleteRecursively()
        outputDynamicDir.deleteRecursively()

        buildDir.mkdirs()
        dexDir.mkdirs()
        smaliDir.mkdirs()
        smaliKeepDir.mkdirs()
        smaliDynamicDir.mkdirs()
        dexKeepDir.mkdirs()
        dexDynamicDir.mkdirs()
        outputApkDir.mkdirs()
        outputDynamicDir.mkdirs()
    }

    fun execute() {
        println("start")
        extractClassesDex()
        transformDexToSmali()
        filterSmali()
        transformSmaliToDex()
        serializeApk()
        println("finished")
    }

    private fun extractClassesDex() {
        ZipFile(apk).use {
            for (entry in it.entries()) {
                val name = entry.name
                val matcher = pattern.matcher(name)
                if (matcher.find()) {
                    println("extract dex: $name")
                    File(dexDir, name).outputStream().use { out ->
                        it.getInputStream(entry).copyTo(out)
                    }
                }
            }
        }
    }

    private fun transformDexToSmali() {
        dexDir.walk()
            .filter { it.isFile && it.extension == EXTENSION_DEX }
            .forEach {
                println("dex2smali: ${it.name}")
                DexProcessor().dexToSmali(it, File(smaliDir, it.nameWithoutExtension))
            }
    }

    private fun filterSmali() {
        println("filter smali")
        smaliDir.listFiles()?.forEach { dir ->
            dir.walk()
                .filter { it.isFile && it.extension == EXTENSION_SMALI }
                .forEach { smali ->
                    val classPath = smali.path
                        .substringAfter(dir.path)
                        .trim(File.separatorChar)
                        .substringBeforeLast(".$EXTENSION_SMALI")
                        .replace(File.separatorChar, '.')

                    val subPath = dir.name + File.separatorChar + classPath.replace('.', File.separatorChar) + ".$EXTENSION_SMALI"
                    val dynamic = isDynamicSmali(classPath)
                    val keepSmali = File(smaliKeepDir, subPath)
                    if (dynamic) {
                        val newSmali = File(smaliDynamicDir, subPath)
                        newSmali.parentFile.mkdirs()
                        smali.inputStream().copyToWithClose(newSmali.outputStream())
                        handleDynamicSmali(classPath, smali, File(smaliKeepDir, subPath))
                    } else {
                        keepSmali.parentFile.mkdirs()
                        smali.inputStream().copyToWithClose(keepSmali.outputStream())
                    }
                }
        }
    }

    private fun isDynamicSmali(classPath: String): Boolean {
        return classPath.startsWith("com.oh.master.")
                || classPath.startsWith("com.mars.opt.")
                || classPath.startsWith("com.ne.up.zw.")
    }

    private fun handleDynamicSmali(classPath: String, smaliFile: File, keepSmaliFile: File) {
        val reader = SmaliReader(smaliFile)
        val smali = reader.read()
        val superClass = smali.superDef.split(" ").last()
        val implements = smali.implements.joinToString(",")
        println("class = $classPath, super = $superClass interface = {$implements}")
    }

    private fun transformSmaliToDex() {
        smaliKeepDir.listFiles()?.forEach { dir ->
            println("smali2dex: app/${dir.name}")
            DexProcessor().smaliToDex(dir, File(dexKeepDir, dir.name + ".$EXTENSION_DEX"))
        }
        smaliDynamicDir.listFiles()?.forEach { dir ->
            println("smali2dex: dynamic/${dir.name}")
            DexProcessor().smaliToDex(dir, File(dexDynamicDir, dir.name + ".$EXTENSION_DEX"))
        }
    }

    private fun serializeApk() {
        println("serialize apk")
        val outApk = File(outputApkDir, apk.name)
        val alignApk = File(outputApkDir, apk.nameWithoutExtension + "_aligned." + apk.extension)
        val handlers = ZipHandlerFactory.createHandlers()
        ZipOutputStream(outApk.outputStream()).use { outputStream ->
            ZipFile(apk).use {
                for (entry in it.entries()) {
                    val matcher = pattern.matcher(entry.name)
                    if (matcher.find()) {
                        continue
                    }
                    ZipHandlerFactory.getHandler(handlers, entry)
                        .processZipEntry(entry, it.getInputStream(entry), outputStream)
                }
            }

            var index = 1
            dexKeepDir.walk()
                .filter { it.isFile && it.extension == EXTENSION_DEX }
                .forEach {
                    val entry = ZipEntry(transformClassName(index++))
                    ZipHandlerFactory.getHandler(handlers, entry)
                        .processZipEntry(entry, it.inputStream(), outputStream)
                }

            createEncodeDynamicDexZip(handlers).use { inputStream ->
                val entry = ZipEntry("assets/$ASSETS_DYNAMIC_DEX_ZIP_NAME")
                ZipHandlerFactory.getHandler(handlers, entry)
                    .processZipEntry(entry, inputStream, outputStream)
            }
        }

        println("zipalign apk")
        ZipAlignCommand(outApk, alignApk).execute()
    }

    private fun createEncodeDynamicDexZip(handlers: List<IZipHandler>): InputStream {
        val dexZip = File(outputDynamicDir, "dynamic_dex.zip")
        ZipOutputStream(dexZip.outputStream()).use { outputStream ->
            var index = 1
            dexDynamicDir.walk()
                .filter { it.isFile && it.extension == EXTENSION_DEX }
                .forEach {
                    val entry = ZipEntry(transformClassName(index++))
                    ZipHandlerFactory.getHandler(handlers, entry)
                        .processZipEntry(entry, it.inputStream(), outputStream)
                }
        }
        return AesUtils.encode(AES_KEY, dexZip.inputStream())
    }

    private fun transformClassName(index: Int): String {
        assert(index >= 1)
        return "classes${if (index == 1) "" else "$index"}.dex"
    }
}