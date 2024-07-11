package com.divyansh.jetpackcompose0to100

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import com.divyansh.jetpackcompose0to100.ui.theme.JetPackCompose0to100Theme

class JetpackComposePreview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose0to100Theme {
                SimpleComposable()
            }
        }
    }
}

@Composable
fun SimpleComposable() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
    ) {
        Text(text = "Hello World")
    }
}

//Dimensions
@Preview(widthDp = 100, heightDp = 50)
@Composable
fun WithDimensions() {
    SimpleComposable()
}

//Dynamic color
@Preview(
    showBackground = true,
    wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE
)
@Composable
fun WithDynamicColor() {
    Button(onClick = {}) {
        Text(text = "Dynamic color")
    }
}

//Different devices
@Preview(device = Devices.PIXEL_XL)
@Composable
fun WithDevice() {
    SimpleComposable()
}

//Locale
@Preview(locale = "es")
@Composable
fun WithLocale() {
    Text(text = stringResource(id = R.string.locale_string))
}

//Background color
@Preview(showBackground = true, backgroundColor = 0xFF00FF00)
@Composable
fun WithBackground() {
    Text("Hello World")
}

//System UI
@Preview(showSystemUi = true)
@Composable
fun WithSystemUI() {
    SimpleComposable()
}

//UI Mode
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun WithUIMode() {
    SimpleComposable()
}

//LocalInspectionMode
@Preview()
@Composable
fun GreetingScreen() {
    if (LocalInspectionMode.current) {
        // Show this text in a preview window:
        Text("Hello preview user!")
    } else {
        // Show this text in the app:
        Text("Hello Divyansh!")
    }
}

//Interactive Mode
//Run preview
//Copy @Preview render