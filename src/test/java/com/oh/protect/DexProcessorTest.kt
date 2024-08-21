package com.oh.protect

import com.oh.protect.dex.DexProcessor
import org.junit.jupiter.api.Test
import java.io.File

class DexProcessorTest {

    @Test
    fun dexToSmali() {
        val rootDir = "/Users/zhouzhenliang/Desktop/zz_protector/temp"
        val dex = File("/Users/zhouzhenliang/Desktop/apk6/ttt-daemon-out/a_output/aaaaa_78304f8000_1059c2.dex")
        val outDir = File("/Users/zhouzhenliang/Desktop/apk6/ttt-daemon-out/a_output/aaaaa_78304f8000_1059c2_smali")
        DexProcessor().dexToSmali(dex, outDir)
    }

    @Test
    fun smaliToDex() {
        val rootDir = "/Users/zhouzhenliang/Desktop/zz_protector/temp"
        val smaliDir = File("$rootDir/classes")
        val outDex = File("$rootDir/output_classes.dex")
        DexProcessor().smaliToDex(smaliDir, outDex)
    }
}