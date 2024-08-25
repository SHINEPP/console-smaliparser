package com.oh.protect.apk

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ApkHandlerTest {

    @Test
    fun execute() {
        val apk = "/Users/zhouzhenliang/source/google-samsung/app-wallpaper-4k/app/build/outputs/apk/release/app-release.apk"
        println("================= start =================")
        ApkHandler(apk).execute()
        println("================= end ===================")
    }
}