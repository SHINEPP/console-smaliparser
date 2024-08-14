package com.oh.protect

import org.example.com.oh.protect.SmaliMethodReader
import org.junit.jupiter.api.Test
import java.io.File

class SmaliMethodReaderTest {

    @Test
    fun read() {
        val file = "/Users/zhouzhenliang/Desktop/zz_protector/temp/classes/com/mars/opt/N.smali"
        SmaliMethodReader().read(File(file))
    }
}