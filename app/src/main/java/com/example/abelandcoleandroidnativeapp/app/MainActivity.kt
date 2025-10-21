package com.example.abelandcoleandroidnativeapp.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.AbelAndColeAndroidNativeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AbelAndColeAndroidNativeAppTheme {
                Root()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    AbelAndColeAndroidNativeAppTheme {

    }
}