package com.example.abelandcoleandroidnativeapp.core.components.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.HeadingStyle

@Composable
fun Heading(text: String, headingType: HeadingStyle, modifier: Modifier = Modifier) {
    Text(
        text,
        style = headingType.textStyle,
        modifier = modifier
    )
}