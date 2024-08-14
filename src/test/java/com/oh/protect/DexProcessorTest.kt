package com.oh.protect

import org.junit.jupiter.api.Test
import java.io.File

class DexProcessorTest {

    @Test
    fun dexToSmali() {
        val rootDir = "/Users/zhouzhenliang/Desktop/zz_protector/temp"
        val dex = File("$rootDir/classes.dex")
        val outDir = File("$rootDir/classes")
        DexProcessor().dexToSmali(dex, outDir)
    }
}