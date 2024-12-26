package com.johenin.johen_burgerking_jpcompose.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.johenin.johen_burgerking_jpcompose.MyIconPack

public val MyIconPack.Back: ImageVector
    get() {
        if (_back != null) {
            return _back!!
        }
        _back = Builder(name = "Back", defaultWidth = 24.42.dp, defaultHeight = 28.0.dp,
                viewportWidth = 24.42f, viewportHeight = 28.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.58f)
                lineTo(24.42f, 0.0f)
                verticalLineTo(3.63f)
                lineTo(3.84f, 14.0f)
                verticalLineToRelative(0.1f)
                lineTo(24.42f, 24.37f)
                verticalLineTo(28.0f)
                lineTo(0.0f, 15.42f)
                close()
            }
        }
        .build()
        return _back!!
    }

private var _back: ImageVector? = null
