package com.oh.protect.daemon

import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.interfaces.RSAPrivateKey
import java.security.interfaces.RSAPublicKey
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.util.*
import javax.crypto.Cipher


object KeyManager {

    private const val RSA = "RSA"
    private const val ECB_PKCS1_PADDING = "RSA/ECB/PKCS1Padding"

    fun initKey() {
        // 实例化密钥生成器
        val keyPairGenerator = KeyPairGenerator.getInstance(RSA)

        // 初始化密钥生成器
        keyPairGenerator.initialize(2048)

        // 生成密钥对
        val keyPair = keyPairGenerator.generateKeyPair()

        // 公钥
        val publicKey = keyPair.public as RSAPublicKey

        // 私钥
        val privateKey = keyPair.private as RSAPrivateKey

        val publicKeyBase64 = Base64.getEncoder().encodeToString(publicKey.encoded)
        val privateKeyBase64 = Base64.getEncoder().encodeToString(privateKey.encoded)
        println("-------- publicKeyBase64 --------")
        println(publicKeyBase64)
        println("-------- publicKeyBase64 --------")
        println()
        println("-------- privateKeyBase64 --------")
        println(privateKeyBase64)
        println("-------- privateKeyBase64 --------")
    }

    /**
     * 公钥加密
     *
     * @param data 待加密数据
     * @param key       密钥
     * @return byte[] 加密数据
     */
    fun encryptByPublicKey(data: ByteArray, key: ByteArray): ByteArray {
        val keyFactory = KeyFactory.getInstance(RSA)
        val x509KeySpec = X509EncodedKeySpec(key)
        val pubKey = keyFactory.generatePublic(x509KeySpec)
        val cipher = Cipher.getInstance(ECB_PKCS1_PADDING)
        cipher.init(Cipher.ENCRYPT_MODE, pubKey)
        return cipher.doFinal(data)
    }

    /**
     * 私钥解密
     *
     * @param data 待解密数据
     * @param key  密钥
     * @return byte[] 解密数据
     */
    fun decryptByPrivateKey(data: ByteArray, key: ByteArray): ByteArray {
        //取得私钥
        val pkcs8KeySpec = PKCS8EncodedKeySpec(key)
        val keyFactory = KeyFactory.getInstance(RSA)
        //生成私钥
        val privateKey = keyFactory.generatePrivate(pkcs8KeySpec)
        //数据解密
        val cipher = Cipher.getInstance(ECB_PKCS1_PADDING)
        cipher.init(Cipher.DECRYPT_MODE, privateKey)
        return cipher.doFinal(data)
    }
}