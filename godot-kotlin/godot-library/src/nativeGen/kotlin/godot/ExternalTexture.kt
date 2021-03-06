// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class ExternalTexture : Texture() {
  open var size: Vector2
    get() {
      throw UninitializedPropertyAccessException("Cannot access property size: has no getter")
    }
    set(value) {
      val mb = getMethodBind("ExternalTexture","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ExternalTexture", "ExternalTexture")

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun getExternalTextureId(): Long {
    val mb = getMethodBind("ExternalTexture","get_external_texture_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("ExternalTexture","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }
}
