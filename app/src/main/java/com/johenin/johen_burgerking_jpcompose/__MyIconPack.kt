package com.johenin.johen_burgerking_jpcompose

import androidx.compose.ui.graphics.vector.ImageVector
import com.johenin.johen_burgerking_jpcompose.myiconpack.AllIcons
import com.johenin.johen_burgerking_jpcompose.myiconpack.Back
import com.johenin.johen_burgerking_jpcompose.myiconpack.Barcode
import com.johenin.johen_burgerking_jpcompose.myiconpack.Burgerking
import com.johenin.johen_burgerking_jpcompose.myiconpack.Cart
import com.johenin.johen_burgerking_jpcompose.myiconpack.Coupon
import com.johenin.johen_burgerking_jpcompose.myiconpack.Home
import com.johenin.johen_burgerking_jpcompose.myiconpack.ItemXml
import com.johenin.johen_burgerking_jpcompose.myiconpack.Menu
import com.johenin.johen_burgerking_jpcompose.myiconpack.More
import com.johenin.johen_burgerking_jpcompose.myiconpack.Myking
import com.johenin.johen_burgerking_jpcompose.myiconpack.Order
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Burgerking.AllIcons + ItemXml.AllIcons + listOf(Back, Barcode, Cart, Coupon, Home,
        Menu, More, Myking, Order)
    return __AllIcons!!
  }
