package com.oh.protect.apk.zip

import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class ZipDefaultHandler : IZipHandler {

    override fun isAccept(zipEntry: ZipEntry): Boolean {
        return true
    }

    override fun processZipEntry(zipEntry: ZipEntry, inputStream: InputStream, outputStream: ZipOutputStream) {
        val data = inputStream.readBytes()
        val entry = ZipEntry(zipEntry.name)
        entry.method = ZipEntry.DEFLATED
        outputStream.putNextEntry(entry)
        outputStream.write(data)

        val paddingSize = (4 - (data.size % 4)) % 4
        for (i in 0 until paddingSize) {
            outputStream.write(0)
        }

        outputStream.closeEntry()
    }
}