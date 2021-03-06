// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolVector2Array
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class ConcavePolygonShape2D : Shape2D() {
  open var segments: PoolVector2Array
    get() {
      val mb = getMethodBind("ConcavePolygonShape2D","get_segments")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ConcavePolygonShape2D","set_segments")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ConcavePolygonShape2D",
      "ConcavePolygonShape2D")

  open fun getSegments(): PoolVector2Array {
    val mb = getMethodBind("ConcavePolygonShape2D","get_segments")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun setSegments(segments: PoolVector2Array) {
    val mb = getMethodBind("ConcavePolygonShape2D","set_segments")
    _icall_Unit_PoolVector2Array( mb, this.ptr, segments)
  }
}
