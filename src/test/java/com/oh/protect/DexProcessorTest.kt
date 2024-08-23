package com.oh.protect

import com.oh.protect.dex.DexProcessor
import org.junit.jupiter.api.Test
import java.io.File

class DexProcessorTest {

    @Test
    fun dexToSmali() {
        val dex = File("/Users/zhouzhenliang/source/shine/lib-daemongp/libdaemon/build/outputs/aar/classes_1.dex")
        val outDir = File("/Users/zhouzhenliang/source/shine/lib-daemongp/libdaemon/build/outputs/aar/classes_1")
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