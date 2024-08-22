package com.oh.protect.dex

import com.android.tools.r8.CompilationMode
import com.android.tools.r8.D8
import com.android.tools.r8.D8Command
import com.android.tools.r8.OutputMode
import com.android.tools.smali.baksmali.Baksmali
import com.android.tools.smali.baksmali.BaksmaliOptions
import com.android.tools.smali.dexlib2.DexFileFactory
import com.android.tools.smali.dexlib2.Opcodes
import com.android.tools.smali.smali.Smali
import com.android.tools.smali.smali.SmaliOptions
import java.io.File
import kotlin.math.min

class DexProcessor {

    companion object {
        private val jobCount = min(Runtime.getRuntime().availableProcessors(), 6)
    }

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

    /**
     *  jar转dex
     */
    fun jarToDex(jar: File, dex: File) {
        val androidJar = File("/Users/zhouzhenliang/Library/Android/sdk/platforms/android-34/android.jar")
        D8.run(D8Command.builder()
            .setMinApiLevel(24)
            .setMode(CompilationMode.RELEASE)
            .setIntermediate(true)
            .addProgramFiles(jar.toPath())
            .setOutput(dex.toPath(), OutputMode.DexIndexed)
            .addLibraryFiles(androidJar.toPath())
            .build())
    }
}