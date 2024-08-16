package com.oh.protect.parser

import com.oh.protect.parser.MethodReader
import org.junit.jupiter.api.Test

class MethodReaderTest {

    @Test
    fun read() {
        val content = ".method public static final varargs longSetOf([J)Landroidx/collection/LongSet;"
        MethodReader(content).read()
    }
}