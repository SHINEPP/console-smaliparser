package com.oh.protect.parser

import com.oh.protect.parser.SmaliProcessor
import org.junit.jupiter.api.Test

class SmaliProcessorTest {

    @Test
    fun process() {
        val file = "/Users/zhouzhenliang/Desktop/apk6/ttt-daemon-out/Notepad-vc2-v1.1/smali_classes3/com/calc/hwai/MyApp.smali"
        println()
        println("$file:")
        println("----------------------- smali start -----------------------")
        SmaliProcessor.process(file, "")
        println("----------------------- smali end -------------------------")
    }
}