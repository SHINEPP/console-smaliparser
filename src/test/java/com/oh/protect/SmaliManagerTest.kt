package com.oh.protect

import org.example.com.oh.protect.SmaliManager
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SmaliManagerTest {

    @Test
    fun travel() {
        val dir = "/Users/zhouzhenliang/Desktop/apk6/ttt-daemon-out/Notepad-vc2-v1.1/smali"
        SmaliManager.travel(dir)
    }
}