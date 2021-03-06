// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolByteArray
import godot.icalls._icall_CryptoKey_Long
import godot.icalls._icall_PoolByteArray_Long
import godot.icalls._icall_X509Certificate_Object_String_String_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class Crypto : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("Crypto", "Crypto")

  open fun generateRandomBytes(size: Long): PoolByteArray {
    val mb = getMethodBind("Crypto","generate_random_bytes")
    return _icall_PoolByteArray_Long( mb, this.ptr, size)
  }

  open fun generateRsa(size: Long): CryptoKey {
    val mb = getMethodBind("Crypto","generate_rsa")
    return _icall_CryptoKey_Long( mb, this.ptr, size)
  }

  open fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000"
  ): X509Certificate {
    val mb = getMethodBind("Crypto","generate_self_signed_certificate")
    return _icall_X509Certificate_Object_String_String_String( mb, this.ptr, key, issuerName,
        notBefore, notAfter)
  }
}
