package com.oh.protect.transform

import com.oh.protect.parser.SmaliProcessor
import java.io.File

class SmaliWalker(private val smaliDir: File) {

    companion object {
        private const val SMALI_EXTENSION = "smali"
    }

    fun walk() {
        smaliDir.walk()
            .filter { it.isFile && it.extension == SMALI_EXTENSION }
            .forEach {
                processSmali(it)
            }
    }

    private fun processSmali(file: File) {
        val classPath = file.path.substringAfter(smaliDir.path).trim(File.separatorChar)
        println("handleSmali(), classPath = $classPath")
        val outFile = File(File(smaliDir.parentFile, "output"), classPath)
        SmaliProcessor.process(file, outFile)
    }
}