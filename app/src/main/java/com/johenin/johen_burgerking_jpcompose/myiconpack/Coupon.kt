package com.johenin.johen_burgerking_jpcompose.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.johenin.johen_burgerking_jpcompose.MyIconPack

public val MyIconPack.Coupon: ImageVector
    get() {
        if (_coupon != null) {
            return _coupon!!
        }
        _coupon = Builder(name = "Coupon", defaultWidth = 28.0.dp, defaultHeight = 22.0.dp,
                viewportWidth = 28.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                horizontalLineTo(3.06f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.07f)
                verticalLineTo(7.85f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.1f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.91f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 14.15f)
                verticalLineTo(18.8f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.19f, 22.0f)
                horizontalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 14.14f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 26.9f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 28.0f, 7.85f)
                verticalLineTo(3.16f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 24.85f, 0.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.74f)
                arcTo(2.29f, 2.29f, 0.0f, false, false, 19.0f, 22.0f)
                horizontalLineToRelative(0.3f)
                curveToRelative(1.85f, 0.0f, 3.71f, 0.0f, 5.56f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 28.0f, 18.86f)
                close()
            }
        }
        .build()
        return _coupon!!
    }

private var _coupon: ImageVector? = null
