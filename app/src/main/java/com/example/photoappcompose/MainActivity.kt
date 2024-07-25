package com.example.photoappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import com.example.photoappcompose.ui.theme.PhotoAppComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }

        lifecycleScope.launch {
            delay(3000L) // Splash screen duration
            setContent {
                Greeting(name="HOME SCREEN")
            }
        }
    }
}

@Composable
fun MyApp() {
    SplashScreen()
}

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Getting Started ",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            modifier = Modifier.wrapContentSize()
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Text(text = " $name!",
            textAlign = TextAlign.Center,
            fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PhotoAppComposeTheme {
        Greeting("Android")
    }
}

//class MainActivity : ComponentActivity() {
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        installSplashScreen()
//        setContent {
//            MyApp()
//        }
//
//        lifecycleScope.launch {
//            delay(3000L) // Splash screen duration
//            setContent {
//                MainScreen()
//            }
//        }
//    }
//}

