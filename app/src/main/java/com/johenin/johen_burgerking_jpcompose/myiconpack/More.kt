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

public val MyIconPack.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 28.0.dp, defaultHeight = 6.46.dp,
                viewportWidth = 28.0f, viewportHeight = 6.46f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.24f)
                arcTo(3.23f, 3.23f, 0.0f, true, true, 3.24f, 6.46f)
                arcTo(3.24f, 3.24f, 0.0f, false, true, 0.0f, 3.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.46f)
                arcToRelative(3.23f, 3.23f, 0.0f, true, true, 3.22f, -3.24f)
                arcTo(3.24f, 3.24f, 0.0f, false, true, 14.0f, 6.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.54f, 3.22f)
                arcToRelative(3.23f, 3.23f, 0.0f, true, true, 3.22f, 3.24f)
                arcTo(3.24f, 3.24f, 0.0f, false, true, 21.54f, 3.22f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
