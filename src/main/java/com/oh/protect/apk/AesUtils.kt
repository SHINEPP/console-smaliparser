package com.oh.protect.apk

import java.io.InputStream
import javax.crypto.Cipher
import javax.crypto.CipherInputStream
import javax.crypto.spec.SecretKeySpec

object AesUtils {

    private const val AES_CBC_PKCS5 = "AES/ECB/PKCS5Padding"
    private const val AES = "AES"

    fun decode(key: String, input: InputStream): InputStream {
        val cipher = Cipher.getInstance(AES_CBC_PKCS5)
        val secretKey = SecretKeySpec(key.toByteArray(), AES)
        cipher.init(Cipher.DECRYPT_MODE, secretKey)
        return CipherInputStream(input, cipher)
    }

    fun encode(key: String, input: InputStream): InputStream {
        val cipher = Cipher.getInstance(AES_CBC_PKCS5)
        val secretKey = SecretKeySpec(key.toByteArray(), AES)
        cipher.init(Cipher.ENCRYPT_MODE, secretKey)
        return CipherInputStream(input, cipher)
    }
}