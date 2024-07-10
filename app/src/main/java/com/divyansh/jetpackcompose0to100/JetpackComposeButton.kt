package com.divyansh.jetpackcompose0to100

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.divyansh.jetpackcompose0to100.extensions.showToast
import com.divyansh.jetpackcompose0to100.ui.theme.JetPackCompose0to100Theme

class JetpackComposeButton : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose0to100Theme {
                buttonWithIcon()
                typesOfButton()
            }
        }
    }
}

@Composable
fun buttonWithIcon() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            modifier = Modifier
                .height(50.dp)
                .width(140.dp),
            shape = RoundedCornerShape(
                topStart = 10.dp,
                bottomEnd = 10.dp
            ),
            enabled = true,
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2D4356),
                contentColor = Color.Green,
                disabledContentColor = Color.White,
                disabledContainerColor = Color.LightGray
            ),
            onClick = { showToast(context, "Elevated button clicked.") }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
            )
            Text(text = "Elevated Button")
        }
    }
}

@Composable
fun typesOfButton() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        contentAlignment = Alignment.Center,
    ) {
        TextButton(
            onClick = { showToast(context, "Text button clicked.") },
        ) {
            Text(
                text = "Text Button"
            )
        }
        IconButton(
            onClick = { showToast(context, "Icon button clicked.") },
            modifier = Modifier.padding(top = 60.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
            )
        }
    }
}