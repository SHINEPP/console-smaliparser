package com.oh.protect.apk

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class AesUtilsTest {

    @Test
    fun decode() {
        val file = File("/Users/zhouzhenliang/source/shine/lib-daemongp/app/src/main/assets/native_example.txt")
        val out = File(file.parentFile, "native_example_txt")
        AesUtils.encode("aoivgnafoeanvoai", file.inputStream()).use {
            it.copyTo(out.outputStream())
        }

        println(AesUtils.decode("aoivgnafoeanvoai", out.inputStream()).bufferedReader().readText())
    }
}