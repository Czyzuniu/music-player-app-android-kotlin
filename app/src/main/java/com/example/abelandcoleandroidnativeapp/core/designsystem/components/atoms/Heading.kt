package com.example.abelandcoleandroidnativeapp.core.designsystem.components.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.HeadingStyle

@Composable
fun Heading(text: String, headingType: HeadingStyle, modifier: Modifier = Modifier) {
    Text(
        text,
        style = headingType.textStyle,
        modifier = modifier
    )
}

@Preview(
    showBackground = true,          // adds a background so text is visible
    backgroundColor = 0xFFF0F0F0    // optional: light gray background
)
@Composable
fun HeadingPreview() {
    Heading(
        text = "Welcome to A&C Native Android",
        headingType = HeadingStyle.TitleTwo
    )
}