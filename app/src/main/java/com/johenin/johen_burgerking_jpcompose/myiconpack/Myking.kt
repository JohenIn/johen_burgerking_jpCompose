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

public val MyIconPack.Myking: ImageVector
    get() {
        if (_myking != null) {
            return _myking!!
        }
        _myking = Builder(name = "Myking", defaultWidth = 28.0.dp, defaultHeight = 21.85.dp,
                viewportWidth = 28.0f, viewportHeight = 21.85f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.53f, 6.54f)
                quadToRelative(1.77f, -2.0f, 3.49f, -4.0f)
                lineTo(12.67f, 0.66f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 2.65f, 0.0f)
                lineToRelative(4.95f, 5.66f)
                lineToRelative(0.21f, 0.23f)
                lineToRelative(3.0f, -1.89f)
                curveToRelative(0.68f, -0.43f, 1.35f, -0.88f, 2.05f, -1.28f)
                arcTo(1.65f, 1.65f, 0.0f, false, true, 28.0f, 4.89f)
                arcTo(10.74f, 10.74f, 0.0f, false, true, 27.85f, 6.0f)
                quadToRelative(-0.69f, 4.32f, -1.39f, 8.64f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.22f, -0.06f, 0.34f)
                horizontalLineTo(1.6f)
                curveToRelative(-0.13f, -0.76f, -0.25f, -1.52f, -0.37f, -2.29f)
                curveTo(0.83f, 10.23f, 0.44f, 7.76f, 0.0f, 5.29f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 2.71f, 3.5f)
                lineTo(7.25f, 6.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.09f, 17.0f)
                curveToRelative(-0.16f, 1.0f, -0.3f, 1.93f, -0.47f, 2.88f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, -2.27f, 2.0f)
                horizontalLineTo(4.84f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, true, -2.48f, -2.06f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, false, 0.0f, -0.09f)
                curveToRelative(-0.14f, -0.89f, -0.28f, -1.79f, -0.42f, -2.71f)
                close()
            }
        }
        .build()
        return _myking!!
    }

private var _myking: ImageVector? = null
