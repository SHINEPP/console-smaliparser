package com.oh.protect.apk.zip

import java.util.zip.ZipEntry

object ZipHandlerFactory {

    private val zipDefaultHandler = ZipDefaultHandler()

    fun createHandlers(): List<IZipHandler> {
        return arrayListOf(
            ZipManifestHandler(),
            ZipResourcesArscHandler()
        )
    }

    fun getHandler(handlers: List<IZipHandler>, entry: ZipEntry): IZipHandler {
        return handlers.find { it.isAccept(entry) } ?: zipDefaultHandler
    }
}