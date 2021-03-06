// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.RID
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Object_Long
import godot.icalls._icall_RID_Long
import godot.internal.utils.getMethodBind
import kotlin.Long

open class Physics2DShapeQueryResult internal constructor() : Reference() {
  open fun getResultCount(): Long {
    val mb = getMethodBind("Physics2DShapeQueryResult","get_result_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getResultObject(idx: Long): Object {
    val mb = getMethodBind("Physics2DShapeQueryResult","get_result_object")
    return _icall_Object_Long( mb, this.ptr, idx)
  }

  open fun getResultObjectId(idx: Long): Long {
    val mb = getMethodBind("Physics2DShapeQueryResult","get_result_object_id")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getResultObjectShape(idx: Long): Long {
    val mb = getMethodBind("Physics2DShapeQueryResult","get_result_object_shape")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getResultRid(idx: Long): RID {
    val mb = getMethodBind("Physics2DShapeQueryResult","get_result_rid")
    return _icall_RID_Long( mb, this.ptr, idx)
  }
}
