package com.oh.protect.apk

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ApkHandlerTest {

    @Test
    fun execute() {
        val apk = "/Users/zhenliangzhou/Desktop/temp/app-release.apk"
        println("=========================================")
        ApkHandler(apk).execute()
        println("=========================================")
    }
}