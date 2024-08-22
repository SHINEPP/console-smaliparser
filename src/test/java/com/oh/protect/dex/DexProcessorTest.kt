package com.oh.protect.dex

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class DexProcessorTest {

    @Test
    fun jarToDex() {
        val jar = File("/Users/zhouzhenliang/Desktop/zz_protector/aar/develop-daemongp-4.0.0.4/resources/classes.jar")
        DexProcessor().jarToDex(jar, File(jar.parentFile, "classes_dex.zip"))
    }
}