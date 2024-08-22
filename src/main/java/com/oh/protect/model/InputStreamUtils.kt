package com.oh.protect.model

import java.io.InputStream
import java.io.OutputStream

fun InputStream.copyToWithClose(outputStream: OutputStream): Long {
    return use { input ->
        outputStream.use { output ->
            val size = input.copyTo(output)
            output.flush()
            size
        }
    }
}