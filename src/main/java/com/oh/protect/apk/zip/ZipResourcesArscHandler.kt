package com.oh.protect.apk.zip

import java.io.InputStream
import java.util.zip.CRC32
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class ZipResourcesArscHandler : IZipHandler {

    override fun isAccept(zipEntry: ZipEntry): Boolean {
        return zipEntry.name == "resources.arsc"
    }

    override fun processZipEntry(zipEntry: ZipEntry, inputStream: InputStream, outputStream: ZipOutputStream) {
        val data = inputStream.readBytes()
        val manifestCrc = CRC32()
        manifestCrc.update(data)
        val entry = ZipEntry(zipEntry.name)
        entry.size = data.size.toLong()
        entry.method = ZipEntry.STORED
        entry.setCrc(manifestCrc.value)
        outputStream.putNextEntry(entry)
        outputStream.write(data)

        val paddingSize = (4 - (data.size % 4)) % 4
        for (i in 0 until paddingSize) {
            outputStream.write(0)
        }

        outputStream.closeEntry()
    }
}