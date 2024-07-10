package com.divyansh.jetpackcompose0to100

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.divyansh.jetpackcompose0to100.ui.theme.JetPackCompose0to100Theme

class JetpackComposeText : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose0to100Theme {
//                TextDemo()
                TextExcercise()
            }
        }
    }
}

@Composable
fun TextDemo() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name).plus(" "),
//                            .repeat(30),
            maxLines = 3,
            color = Color.Magenta,
            fontSize = 32.sp,
            textDecoration = TextDecoration.Underline,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.End,
        )
    }
}

@Composable
fun TextExcercise() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        val annotatedString = buildAnnotatedString {
            pinkBlueGradientText("Android")
            append("\n\n")
            blueGradientText("Application")
            append("\n\n")
            blueGradientText("Development")
        }

        Text(text = annotatedString)
    }
}

@Composable
private fun AnnotatedString.Builder.blueGradientText(text: String) {
    withStyle(
        style = SpanStyle(
            brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFF2788C7),
                    Color(0xFF00BBD4)
                )
            ),
            fontSize = 42.sp,
            fontWeight = FontWeight.Medium
        )
    ) {
        append(text)
    }
}

@Composable
private fun AnnotatedString.Builder.pinkBlueGradientText(text: String) {
    withStyle(
        style = SpanStyle(
            brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFFFF3B85),
                    Color(0xFF00BBD4)
                )
            ),
            fontSize = 48.sp,
            fontWeight = FontWeight.Medium
        )
    ) {
        append(text)
    }
}