// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String

open class EditorResourcePreviewGenerator internal constructor() : Reference() {
  open fun canGenerateSmallPreview(): Boolean {
    throw
        NotImplementedError("can_generate_small_preview is not implemented for EditorResourcePreviewGenerator")
  }

  open fun generate(from: Resource, size: Vector2): Texture {
    throw NotImplementedError("generate is not implemented for EditorResourcePreviewGenerator")
  }

  open fun generateFromPath(path: String, size: Vector2): Texture {
    throw
        NotImplementedError("generate_from_path is not implemented for EditorResourcePreviewGenerator")
  }

  open fun generateSmallPreviewAutomatically(): Boolean {
    throw
        NotImplementedError("generate_small_preview_automatically is not implemented for EditorResourcePreviewGenerator")
  }

  open fun handles(type: String): Boolean {
    throw NotImplementedError("handles is not implemented for EditorResourcePreviewGenerator")
  }
}
