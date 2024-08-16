package org.example.com.oh.protect.parser

/**
 * 使用装饰者模式
 */
object SmaliProcessor {

    fun process(path: String) {
        val reader = SmaliReader(path)
        val writer = SmaliWriter(reader.read())
        writer.write()
    }
}