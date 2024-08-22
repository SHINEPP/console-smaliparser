package com.oh.protect.apk.zip

import java.io.InputStream
import java.util.zip.CRC32
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream


class ZipManifestHandler : IZipHandler {

    override fun isAccept(zipEntry: ZipEntry): Boolean {
        return zipEntry.name == "AndroidManifest.xml"
    }

    override fun processZipEntry(zipEntry: ZipEntry, inputStream: InputStream, outputStream: ZipOutputStream) {
        val data = inputStream.readBytes()
        val manifestCrc = CRC32()
        manifestCrc.update(data)
        zipEntry.size = data.size.toLong()
        zipEntry.compressedSize = -1
        zipEntry.setCrc(manifestCrc.value)
        outputStream.putNextEntry(zipEntry)
        outputStream.write(data)
        outputStream.closeEntry()
    }
}