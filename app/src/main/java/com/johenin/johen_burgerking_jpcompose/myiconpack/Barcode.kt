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

public val MyIconPack.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 28.0.dp, defaultHeight = 20.35.dp,
                viewportWidth = 28.0f, viewportHeight = 20.35f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.66f, 3.66f)
                horizontalLineToRelative(3.03f)
                verticalLineToRelative(12.84f)
                horizontalLineToRelative(-3.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.75f)
                horizontalLineToRelative(3.03f)
                verticalLineToRelative(12.84f)
                horizontalLineToRelative(-3.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.47f, 3.66f)
                horizontalLineToRelative(1.01f)
                verticalLineToRelative(12.84f)
                horizontalLineToRelative(-1.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.34f, 3.66f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(12.84f)
                horizontalLineToRelative(-2.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.62f, 3.66f)
                horizontalLineToRelative(1.54f)
                verticalLineToRelative(12.84f)
                horizontalLineToRelative(-1.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 3.66f)
                horizontalLineToRelative(2.53f)
                verticalLineToRelative(12.84f)
                horizontalLineToRelative(-2.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineTo(4.64f)
                horizontalLineTo(0.81f)
                verticalLineTo(0.82f)
                horizontalLineTo(5.07f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.78f, 0.26f)
                horizontalLineTo(23.15f)
                verticalLineToRelative(0.81f)
                horizontalLineTo(27.0f)
                verticalLineTo(5.33f)
                horizontalLineToRelative(0.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 20.13f)
                verticalLineTo(15.49f)
                horizontalLineToRelative(-0.81f)
                verticalLineToRelative(3.82f)
                horizontalLineTo(22.93f)
                verticalLineToRelative(0.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.22f, 20.35f)
                horizontalLineTo(4.85f)
                verticalLineToRelative(-0.81f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.28f)
                horizontalLineTo(0.22f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null
