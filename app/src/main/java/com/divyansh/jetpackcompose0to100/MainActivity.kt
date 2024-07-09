package com.divyansh.jetpackcompose0to100

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "to Jetpack Compose")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Greeting(name: String = "India") {
    Column {
        val context = LocalContext.current
        Text(
            text = "Welcome $name",
            color = Color.Red,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = { println("Click") },
            content = {
                Text(text = "Button")
            }
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            tint = Color.Black
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Name") }
        )
        FloatingActionButton(onClick = {
            Toast.makeText(context, "FAB clicked", Toast.LENGTH_SHORT).show()
        }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
        }
    }
}