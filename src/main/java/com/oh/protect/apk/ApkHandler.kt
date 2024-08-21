package com.oh.protect.apk

import com.oh.protect.apk.zip.ZipHandlerFactory
import com.oh.protect.dex.DexProcessor
import com.oh.protect.io.inputStream
import java.io.File
import java.util.regex.Pattern
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import java.util.zip.ZipOutputStream

class ApkHandler(apk: String) {

    companion object {
        private const val EXTENSION_DEX = "dex"
        private const val EXTENSION_SMALI = "smali"
    }

    private val apkFile = File(apk)
    private val buildDir = File(apkFile.parentFile, "build")
    private val buildClassesDir = File(buildDir, "classes")
    private val buildSmaliDir = File(buildDir, "smali")
    private val buildSmaliAppDir = File(buildDir, "smali_app")
    private val buildSmaliDynamicDir = File(buildDir, "smali_dynamic")
    private val buildOutputClassesDir = File(buildDir, "output_classes")
    private val buildOutputClassesDynamicDir = File(buildDir, "output_classes_dynamic")
    private val buildOutputApkDir = File(buildDir, "output_apk")

    private val pattern = Pattern.compile("^classes(\\d*)\\.dex\$")

    init {
        buildClassesDir.deleteRecursively()
        buildSmaliDir.deleteRecursively()
        buildSmaliAppDir.deleteRecursively()
        buildSmaliDynamicDir.deleteRecursively()
        buildOutputClassesDir.deleteRecursively()
        buildOutputClassesDynamicDir.deleteRecursively()
        buildOutputApkDir.deleteRecursively()

        buildDir.mkdirs()
        buildClassesDir.mkdirs()
        buildSmaliDir.mkdirs()
        buildSmaliAppDir.mkdirs()
        buildSmaliDynamicDir.mkdirs()
        buildOutputClassesDir.mkdirs()
        buildOutputClassesDynamicDir.mkdirs()
        buildOutputApkDir.mkdirs()
    }

    fun execute() {
        extractClassesDex()
        transformDexToSmali()
        filterDaemonSmali()
        transformClassToDex()
        serializeApk()
    }

    private fun extractClassesDex() {
        ZipFile(apkFile).use {
            for (entry in it.entries()) {
                val name = entry.name
                val matcher = pattern.matcher(name)
                if (matcher.find()) {
                    println("extract dex: $name")
                    it.inputStream(name).copyTo(File(buildClassesDir, name).outputStream())
                }
            }
        }
    }

    private fun transformDexToSmali() {
        buildClassesDir.walk()
            .filter { it.isFile && it.extension == EXTENSION_DEX }
            .forEach {
                DexProcessor().dexToSmali(it, File(buildSmaliDir, it.nameWithoutExtension))
            }
    }

    private fun filterDaemonSmali() {
        buildSmaliDir.listFiles()?.forEach { dir ->
            dir.walk()
                .filter { it.isFile && it.extension == EXTENSION_SMALI }
                .forEach { smali ->
                    val classPath = smali.path
                        .substringAfter(dir.path)
                        .trim(File.separatorChar)
                        .substringBeforeLast(".$EXTENSION_SMALI")
                        .replace(File.separatorChar, '.')

                    val subPath = arrayOf(dir.name, classPath.replace('.', File.separatorChar) + ".$EXTENSION_SMALI")
                        .joinToString(File.separator)
                    val newSmali = if (isDaemonSmali(classPath)) {
                        File(buildSmaliDynamicDir, subPath)
                    } else {
                        File(buildSmaliAppDir, subPath)
                    }
                    newSmali.parentFile.mkdirs()
                    smali.inputStream().copyTo(newSmali.outputStream())
                }
        }
    }

    private fun isDaemonSmali(classPath: String): Boolean {
        return classPath.startsWith("com.oh.master.")
                || classPath.startsWith("com.miqt.demo.")
    }

    private fun transformClassToDex() {
        buildSmaliAppDir.listFiles()?.forEach { dir ->
            DexProcessor().smaliToDex(dir, File(buildOutputClassesDir, dir.name + ".$EXTENSION_DEX"))
        }
        buildSmaliDynamicDir.listFiles()?.forEach { dir ->
            DexProcessor().smaliToDex(dir, File(buildOutputClassesDynamicDir, dir.name + ".$EXTENSION_DEX"))
        }
    }

    private fun serializeApk() {
        val outApk = File(buildOutputApkDir, apkFile.name)
        val handlers = ZipHandlerFactory.createHandlers()
        ZipOutputStream(outApk.outputStream()).use { outputStream ->
            ZipFile(apkFile).use {
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
            buildOutputClassesDir.walk()
                .filter { it.isFile && it.extension == EXTENSION_DEX }
                .forEach {
                    val entry = ZipEntry(transformClassName(index++))
                    ZipHandlerFactory.getHandler(handlers, entry)
                        .processZipEntry(entry, it.inputStream(), outputStream)
                }

            buildOutputClassesDynamicDir.walk()
                .filter { it.isFile && it.extension == EXTENSION_DEX }
                .forEach {
                    val entry = ZipEntry(transformClassName(index++))
                    ZipHandlerFactory.getHandler(handlers, entry)
                        .processZipEntry(entry, it.inputStream(), outputStream)
                }
        }
    }

    private fun transformClassName(index: Int): String {
        assert(index >= 1)
        return "classes${if (index == 1) "" else "$index"}.dex"
    }
}