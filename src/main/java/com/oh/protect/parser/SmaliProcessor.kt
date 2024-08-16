package org.example.com.oh.protect.parser

/**
 * 使用装饰者模式
 */
object SmaliProcessor {

    fun process(inPath: String, outPath: String) {
        val reader = SmaliReader(inPath)
        val writer = SmaliWriter(reader.read(), outPath)
        writer.write()
    }
}