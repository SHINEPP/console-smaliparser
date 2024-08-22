package com.oh.protect.apk.zip

import java.io.File

class ZipAlignCommand(private val inFile: File, private val outFile: File) {

    fun execute() {
        val process = Runtime.getRuntime().exec(arrayOf("zipalign", "-v", "4", inFile.path, outFile.path))
        process.waitFor()
    }
}