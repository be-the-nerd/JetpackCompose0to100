package com.divyansh.jetpackcompose0to100

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.divyansh.jetpackcompose0to100.ui.theme.JetPackCompose0to100Theme
import com.divyansh.jetpackcompose0to100.ui.theme.Purple40

class JetpackComposeModifiers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose0to100Theme {
                ModifiersDemo()
                ModifiersExcercise()
                SplittedRow()
                CustomButtonUsingBox()
            }
        }
    }
}

@Composable
fun ModifiersDemo() {
    Box(
        modifier = Modifier
            /** functions applied sequentially **/
//                        .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
            .padding(horizontal = 12.dp, vertical = 12.dp)
//                        .size(100.dp)
//                        .width(100.dp)
//                        .height(200.dp)
//                        .fillMaxSize(0.5f)
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
            .background(color = Color.Red, shape = RectangleShape)
    )
}

@Composable
fun ModifiersExcercise() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(100.dp)
//                .clip(RoundedCornerShape(10.dp))
                .clip(CircleShape)
                .border(width = 3.dp, color = Color.Yellow, shape = CircleShape)
                .border(width = 6.dp, color = Color.Blue, shape = CircleShape)
                .background(Color.Green)
        )
    }
}

@Composable
fun CustomButtonUsingBox() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(60.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(color = Purple40)
                .clickable {
                    Toast
                        .makeText(context, "Clicked", Toast.LENGTH_SHORT)
                        .show()
                },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Button", color = Color.White)
        }
    }
}

@Composable
fun SplittedRow() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .height(80.dp)
                .weight(1f)
                .background(color = Color.Magenta)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Box(
            modifier = Modifier
                .height(80.dp)
                .weight(1f)
                .background(color = Color.Yellow)
        )
    }
}