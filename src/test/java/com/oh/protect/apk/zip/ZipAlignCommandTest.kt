package com.oh.protect.apk.zip

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class ZipAlignCommandTest {

    @Test
    fun execute() {
        val inFile = File("/Users/zhouzhenliang/source/google-samsung/app-storage-file-master/app/build/outputs/apk/release/build/outputs/apk/app-release.apk")
        val outFile = File(inFile.parentFile, "out.apk")
        ZipAlignCommand(inFile, outFile).execute()
    }
}