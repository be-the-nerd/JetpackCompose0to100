package com.divyansh.jetpackcompose0to100

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.divyansh.jetpackcompose0to100.ui.theme.JetPackCompose0to100Theme

class JetpackComposeLayouts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose0to100Theme {
                BoxLayout()
                ColumnLayout()
                RowLayout()
            }
        }
    }
}

@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Hello", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Hello", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "Hello", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "Hello", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "Hello", modifier = Modifier.align(Alignment.Center))
        Text(text = "Hello", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "Hello", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "Hello", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "Hello", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun ColumnLayout() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "AAA")
        Text(text = "BBB")
        Text(text = "CCC")
        Text(text = "DDD")
    }
}

@Composable
fun RowLayout() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "AAA")
        Text(text = "BBB")
        Text(text = "CCC")
        Text(text = "DDD")
    }
}