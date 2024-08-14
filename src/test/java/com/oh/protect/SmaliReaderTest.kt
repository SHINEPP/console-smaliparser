package com.oh.protect

import org.junit.jupiter.api.Test
import java.io.File

class SmaliReaderTest {

    @Test
    fun read() {
        val file = "/Users/zhouzhenliang/Desktop/zz_protector/temp/classes/com/mars/opt/N.smali"
        SmaliReader().read(File(file))
    }
}