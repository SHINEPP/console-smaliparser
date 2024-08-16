package com.oh.protect.io

import java.io.IOException
import java.io.UncheckedIOException
import java.nio.file.DirectoryNotEmptyException
import java.nio.file.Files
import java.nio.file.Path

/**
 * Temporary directory that will get deleted recursively when closed.
 */
class TempDirectory(prefix: String? = null) : AutoCloseable {

    private var dirPath: Path? = null

    init {
        try {
            dirPath = Files.createTempDirectory(prefix)
        } catch (e: IOException) {
            throw UncheckedIOException(e)
        }
    }

    override fun close() {
        closeWithRetry( /* numAttempt= */1)
    }

    private fun closeWithRetry(numAttempt: Int) {
        try {
            dirPath?.toFile()?.deleteRecursively()
        } catch (e: FileSystemException) {
            // See https://github.com/google/bundletool/issues/61
            // Retrying because Windows sometimes doesn't delete everything synchronously.
            if (e.cause is DirectoryNotEmptyException) {
                if (numAttempt == 5) {
                    throw UncheckedIOException("Unable to delete temporary directory after 5 attempts.", e)
                }
                try {
                    Thread.sleep(200L)
                } catch (ex: InterruptedException) {
                    Thread.currentThread().interrupt()
                }
                closeWithRetry(numAttempt + 1)
            }
        } catch (e: IOException) {
            throw UncheckedIOException(e)
        }
    }
}
