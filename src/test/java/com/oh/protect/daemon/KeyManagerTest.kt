package com.oh.protect.daemon

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File
import java.util.Base64

class KeyManagerTest {

    @Test
    fun initKey() {
        KeyManager.initKey()
    }

    @Test
    fun encryptByPublicKey() {
        val data = "com.oh.daemon.demo".toByteArray()
        val key = Base64.getDecoder()
            .decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsoQaFCH4kClG/3fVv91Djle++KPdy1mJshDRXkh51VzX2wwNTVl4CPim+8253GVLzlf9P26r2sViIRXCGkVuzoWLAN2eCrAQFKr/DKPgDQjYsFzN9n7aAPpl5zDbxkGoJmJAkpQ0c4dPWQg4cMHcnhLem67nFE08iXIEoiKNeZMV5TKSw84cKAq2n/E6CzUzYTcghJv0BUx0JCPbiVDAQ+fwbVkmxa1aCJYwqGjMLhiB4F2CVUZqwnIK7iuBO5YJa4jPar6xs4m9UVysm784EpJWDzBmpwfiitvcmBwDJx1p7sRq6lVHCFtIWm2W0JrIZzSqA4pS11QCfRwYZGJcUQIDAQAB")
        val encodeData = KeyManager.encryptByPublicKey(data, key)

        val assetsFile = File("/Users/zhouzhenliang/source/shine/lib-daemongp/app/src/main/assets")
        val file = File(assetsFile, "ea9cd46acbe96543")
        file.writeBytes(encodeData)

        val key2 = Base64.getDecoder().decode("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCyhBoUIfiQKUb/d9W/3UOOV774o93LWYmyENFeSHnVXNfbDA1NWXgI+Kb7zbncZUvOV/0/bqvaxWIhFcIaRW7OhYsA3Z4KsBAUqv8Mo+ANCNiwXM32ftoA+mXnMNvGQagmYkCSlDRzh09ZCDhwwdyeEt6brucUTTyJcgSiIo15kxXlMpLDzhwoCraf8ToLNTNhNyCEm/QFTHQkI9uJUMBD5/BtWSbFrVoIljCoaMwuGIHgXYJVRmrCcgruK4E7lglriM9qvrGzib1RXKybvzgSklYPMGanB+KK29yYHAMnHWnuxGrqVUcIW0habZbQmshnNKoDilLXVAJ9HBhkYlxRAgMBAAECggEAcaeTZu/97eKp1ip4hzAbO7v31RuXMUlvVlRIyEtCbiovL8Hrkix9NNECl1xykbRYYCY7ETCn76AtirzsmIdONeRmDIYMged4RYBc47JOCl5wf1CGvQIkT+0cBeZgdkgFA3MYg3oiLs+eICQQsxFqIaYH3nyrmIxYF3XlJ0jyY8zDjbeIsTtFRj1xpVqgOcLdK5mFUv01xO/TuV1czp+sgamCkbYLplyb5aqup0Md2Fi0NwPJTfzta7Opnv0Ga8FusI2xfrqyb2k8Kf1v8JONBfj41I7TxQuL1eYbFEgqsL/434bMfT0CuXTbmzOy7LNFUUqb5nHxq1FidyTDfmUW1QKBgQD1yAAA+Y6mwtXfeZtycFo8Ghs2ySQp2oLSlV7hd3dCSd1DyhD3H2b6qHGXPr+AYI/hou/fU37qqFYCeWsoh/BVHem3eLCPLCCNUC7kl+3jORA9iZPFvYC60zSKutaKSjDtjdXsaaxMIN/plpWoFjv6iuXsgsKbdSbWGP1AUOBjlwKBgQC58CguAuPlkN+0x8lncsjPyZSXQ1uce2KFfj8KLnAJLlVtQfbm6Wac0FmVLGtHWhL8/y8812tDpu3Oju7uHmXvropJvnrSmi/wy9V5iv10IYHbk10G4i6SpIFdw8CwkrGKBU6ygY8VL3o1z49saNE3mEQuFmYzDaktcXH4BCQcVwKBgQCV+Cxwa9YsURRZYQWF5aJZrABRBJipZSiQQA59+vxtGU8GzyRc9e9LIT72b5ZASithHZ/KIFN/8alRpy7Is3HlLfRvPBhXtDBEqdmDKGVCUY5kTi856DDFTpxvziOcjDqgqPwQXkaAyUp3aKf2wWJltR0onH0MiIZi+yqEdRUGDwKBgQCDfwAragfZ9lb+9rvM2TSDHsBjKVPEms3WMq5KeQTquUXY+umt7CqRhBeWk89aqqz7F01E7eQB+C/+AL+gzwawNvO9q2QZRMnatYzHZDBSzM+VheYoVBUzx/tlYGcJePTt80rwmwehp+352ExKEubDNoAhR94HBQY8CRrcl7EiCQKBgGPM3LPU/T2GPeODvoNsX4/UN3RIr0Qu5VCQlUOPQFaLmTIkLsRE+YYnhYfHxie8x8zZ8bQqAGkNiQWiCPA0dEOOXB2DloBXmF9OdyK6u6DZx1DruGANjR5R+m9q69P4PUta/xdtLnBrB6V6/CbPoetXDuUHwZqQA4l8MJd23Sto")
        val result = KeyManager.decryptByPrivateKey(encodeData, key2)
        println("result = ${String(result)}")
    }

    @Test
    fun decryptByPrivateKey() {
    }
}