package com.oh.protect.dex

import com.android.tools.smali.baksmali.Baksmali
import com.android.tools.smali.baksmali.BaksmaliOptions
import com.android.tools.smali.dexlib2.DexFileFactory
import com.android.tools.smali.dexlib2.Opcodes
import com.android.tools.smali.smali.Smali
import com.android.tools.smali.smali.SmaliOptions
import java.io.File
import kotlin.math.min

class DexProcessor {

    private val jobCount = min(Runtime.getRuntime().availableProcessors(), 6)

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

    /**
     *  smali转dex
     */
    fun smaliToDex(smaliDir: File, dex: File) {
        val opcodes = Opcodes.getDefault()
        val smaliOptions = SmaliOptions()
        smaliOptions.jobs = jobCount
        smaliOptions.apiLevel = opcodes.api
        smaliOptions.outputDexFile = dex.path
        Smali.assemble(smaliOptions, smaliDir.path)
    }
}