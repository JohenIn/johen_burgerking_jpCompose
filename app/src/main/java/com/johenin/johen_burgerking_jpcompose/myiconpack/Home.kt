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

public val MyIconPack.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 25.49.dp, defaultHeight = 28.0.dp,
                viewportWidth = 25.49f, viewportHeight = 28.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 0.0f)
                curveToRelative(0.53f, 0.37f, 1.06f, 0.73f, 1.57f, 1.13f)
                lineTo(25.0f, 9.16f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, true, 0.52f, 1.05f)
                quadToRelative(0.0f, 8.32f, 0.0f, 16.67f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.38f, 28.0f)
                horizontalLineTo(17.06f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.7f, -1.7f)
                verticalLineTo(18.49f)
                arcToRelative(2.59f, 2.59f, 0.0f, true, false, -5.17f, 0.0f)
                curveToRelative(0.0f, 2.59f, 0.0f, 5.18f, 0.0f, 7.77f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, -0.14f, 0.82f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 8.63f, 28.0f)
                quadTo(4.79f, 28.0f, 1.0f, 28.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.41f, 0.0f, -4.83f, 0.0f, -7.24f)
                curveToRelative(0.0f, -3.17f, 0.0f, -6.34f, 0.0f, -9.51f)
                arcTo(1.24f, 1.24f, 0.0f, false, true, 0.52f, 9.16f)
                quadTo(6.18f, 4.82f, 11.8f, 0.48f)
                curveToRelative(0.23f, -0.18f, 0.48f, -0.32f, 0.73f, -0.48f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
