package org.jetbrains.compose.desktop.idea.preview

import com.intellij.openapi.util.IconLoader

object PreviewIcons {
    private fun load(path: String) = IconLoader.getIcon(path, PreviewIcons::class.java)

    // todo ask compose icons usage permission?
    val COMPOSE = load("/icons/compose/compose.svg")
}