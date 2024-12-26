package com.johenin.johen_burgerking_jpcompose

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.johenin.johen_burgerking_jpcompose.ui.theme.Johen_burgerking_jpComposeTheme

class OrderHistoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Johen_burgerking_jpComposeTheme {
                OrderHistoryScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderHistoryScreenPreview() {
    Johen_burgerking_jpComposeTheme {
        OrderHistoryScreen()
    }
}

@Composable
fun OrderHistoryScreen() {

    Column() {
        Text("OrderHistory")
        val context = LocalContext.current as? Activity
        Button(onClick = { context?.finish() }) {
            Icon(
                Icons.Filled.Home,
                contentDescription = "home icon",
            )

        }
    }
}
