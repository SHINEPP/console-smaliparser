package com.oh.protect.smali.parser

import java.io.File

object SmaliProcessor {

    fun process(inFile: File, outFile: File) {
        val reader = SmaliReader(inFile)
        val smali = reader.read()
        val writer = SmaliWriter(smali)
        writer.write(outFile)
    }
}