package com.oh.protect.io

import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipFile

fun ZipFile.inputStream(name: String): InputStream {
    return getInputStream(ZipEntry(name))
}