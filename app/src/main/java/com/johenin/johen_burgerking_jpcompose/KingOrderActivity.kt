package com.johenin.johen_burgerking_jpcompose

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.johenin.johen_burgerking_jpcompose.ui.theme.Johen_burgerking_jpComposeTheme

class KingOrderActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Johen_burgerking_jpComposeTheme {
                KingOrderScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KingOrderScreenPreview() {
    Johen_burgerking_jpComposeTheme {
        KingOrderScreen()
    }
}

@Composable
fun KingOrderScreen() {

    Column() {
        Text("KingOrder")
        val context = LocalContext.current as? Activity
        Button(onClick = { context?.finish() }) {
            Icon(
                Icons.Filled.Home,
                contentDescription = "home icon",
            )

        }
    }
}