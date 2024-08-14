package com.oh.protect

import com.android.tools.smali.baksmali.Baksmali
import com.android.tools.smali.baksmali.BaksmaliOptions
import com.android.tools.smali.dexlib2.DexFileFactory
import com.android.tools.smali.dexlib2.Opcodes
import java.io.File
import kotlin.math.min

class DexProcessor {

    /**
     *  dex转smali
     */
    fun dexToSmali(dex: File, outDir: File) {
        val opcodes = Opcodes.getDefault()
        val dexFile = DexFileFactory.loadDexFile(dex, opcodes)

        val jobs = min(Runtime.getRuntime().availableProcessors(), 6)
        val options = BaksmaliOptions()
        options.deodex = false
        options.implicitReferences = false
        options.parameterRegisters = true
        options.localsDirective = true
        options.sequentialLabels = true
        options.debugInfo = false
        options.codeOffsets = false
        options.accessorComments = false
        options.registerInfo = 0
        options.inlineResolver = null
        Baksmali.disassembleDexFile(dexFile, outDir, jobs, options)
    }
}