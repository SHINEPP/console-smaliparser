package com.oh.protect

import org.junit.jupiter.api.Test

class SmaliManagerTest {

    @Test
    fun travel() {
        val dir = "/Users/zhouzhenliang/Desktop/apk6/ttt-daemon-out/Notepad-vc2-v1.1/smali_classes4"
        SmaliManager.travel(dir)
    }
}