package org.example.com.oh.protect.parser

object SmaliProcessor {

    fun process(inPath: String, outPath: String) {
        val reader = SmaliReader(inPath)
        val smali = reader.read()
        val writer = SmaliWriter(smali, outPath)
        writer.write()
    }
}