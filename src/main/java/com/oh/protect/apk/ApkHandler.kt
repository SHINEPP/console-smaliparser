package com.oh.protect.apk

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
    private val buildSmaliDamonDir = File(buildDir, "smali_daemon")
    private val buildOutputClassesDir = File(buildDir, "output_classes")
    private val buildOutputClassesDaemonDir = File(buildDir, "output_classes_daemon")
    private val buildOutputApkDir = File(buildDir, "output_apk")

    private val pattern = Pattern.compile("^classes(\\d*)\\.dex\$")

    init {
        buildClassesDir.deleteRecursively()
        buildSmaliDir.deleteRecursively()
        buildSmaliDamonDir.deleteRecursively()
        buildOutputClassesDir.deleteRecursively()
        buildOutputClassesDaemonDir.deleteRecursively()
        buildOutputApkDir.deleteRecursively()

        buildDir.mkdirs()
        buildClassesDir.mkdirs()
        buildSmaliDir.mkdirs()
        buildSmaliDamonDir.mkdirs()
        buildOutputClassesDir.mkdirs()
        buildOutputClassesDaemonDir.mkdirs()
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
                    if (isDaemonSmali(classPath)) {
                        println(classPath)
                        val subPath = arrayOf(dir.name, classPath.replace('.', File.separatorChar) + ".$EXTENSION_SMALI")
                            .joinToString(File.separator)
                        val newSmali = File(buildSmaliDamonDir, subPath)
                        newSmali.parentFile.mkdirs()
                        smali.inputStream().copyTo(newSmali.outputStream())
                    }
                }
        }
    }

    private fun isDaemonSmali(classPath: String): Boolean {
        return classPath.startsWith("com.oh.master.")
    }

    private fun transformClassToDex() {
        buildSmaliDir.listFiles()?.forEach { dir ->
            DexProcessor().smaliToDex(dir, File(buildOutputClassesDir, dir.name + ".$EXTENSION_DEX"))
        }
        buildSmaliDamonDir.listFiles()?.forEach { dir ->
            DexProcessor().smaliToDex(dir, File(buildOutputClassesDaemonDir, dir.name + ".$EXTENSION_DEX"))
        }
    }

    private fun serializeApk() {
        val outApk = File(buildOutputApkDir, apkFile.name)
        ZipOutputStream(outApk.outputStream()).use { outputStram ->
            ZipFile(apkFile).use {
                for (entry in it.entries()) {
                    val name = entry.name
                    val matcher = pattern.matcher(name)
                    if (matcher.find()) {
                        continue
                    }
                    outputStram.putNextEntry(ZipEntry(name))
                    it.inputStream(name).copyTo(outputStram)
                }
            }

            var index = 1
            buildOutputClassesDir.walk()
                .filter { it.isFile && it.extension == EXTENSION_DEX }
                .forEach {

                    outputStram.putNextEntry(ZipEntry(transformClassName(index++)))
                    it.inputStream().copyTo(outputStram)
                }
            buildOutputClassesDaemonDir.walk()
                .filter { it.isFile && it.extension == EXTENSION_DEX }
                .forEach {
                    outputStram.putNextEntry(ZipEntry(transformClassName(index++)))
                    it.inputStream().copyTo(outputStram)
                }
        }
    }

    private fun transformClassName(index: Int): String {
        assert(index >= 1)
        if (index == 1) {
            return "classes.dex"
        }
        return "classes$index"
    }
}