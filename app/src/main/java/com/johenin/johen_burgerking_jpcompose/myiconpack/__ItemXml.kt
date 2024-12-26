package com.johenin.johen_burgerking_jpcompose.myiconpack

import androidx.compose.ui.graphics.vector.ImageVector
import com.johenin.johen_burgerking_jpcompose.MyIconPack
import com.johenin.johen_burgerking_jpcompose.myiconpack.itemxml.AllIcons
import com.johenin.johen_burgerking_jpcompose.myiconpack.itemxml.ItemXml
import kotlin.collections.List as ____KtList

public object ItemXmlGroup

public val MyIconPack.ItemXml: ItemXmlGroup
  get() = ItemXmlGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ItemXmlGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= ItemXml.AllIcons + listOf()
    return __AllIcons!!
  }
