package com.oh.protect.transform

import org.junit.jupiter.api.Test
import java.io.File

class SmaliWalkerTest {

    @Test
    fun travelSmali() {
        SmaliWalker((File("/Users/zhouzhenliang/Desktop/zz_protector/temp/classes"))).walk()
    }
}