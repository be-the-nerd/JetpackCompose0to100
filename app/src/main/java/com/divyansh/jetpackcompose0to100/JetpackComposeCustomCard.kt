package com.divyansh.jetpackcompose0to100

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.divyansh.jetpackcompose0to100.ui.theme.JetPackCompose0to100Theme

class JetpackComposeCustomCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose0to100Theme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.8f)),
                    contentAlignment = Alignment.Center
                ) {
                    MyCustomCard(
                        modifier = Modifier.fillMaxWidth(0.8f),
                        image = R.drawable.background,
                        title = "Shadows & Lightening",
                        text = "Create subtle & stunning UI designs with tips using Jetpack Compose. The new UI toolkit for building UI in Android.",
                        publisher = Publisher(
                            name = "Divyansh Verma",
                            job = "Android Developer",
                            image = R.drawable.my_image
                        )
                    )
                }
            }
        }
    }
}