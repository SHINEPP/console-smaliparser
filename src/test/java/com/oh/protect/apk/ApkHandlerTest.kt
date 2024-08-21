package com.oh.protect.apk

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ApkHandlerTest {

    @Test
    fun execute() {
        val apk = "/Users/zhouzhenliang/source/shine/lib-daemongp/app/build/outputs/apk/superapp/release/app-superapp-release.apk"
        println("=========================================")
        ApkHandler(apk).execute()
        println("=========================================")
    }
}