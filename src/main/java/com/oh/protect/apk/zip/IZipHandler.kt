package com.oh.protect.apk.zip

import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

interface IZipHandler {

    fun isAccept(zipEntry: ZipEntry): Boolean

    fun processZipEntry(zipEntry: ZipEntry, inputStream: InputStream, outputStream: ZipOutputStream)
}