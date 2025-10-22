package com.example.abelandcoleandroidnativeapp.core.designsystem.components.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.BodyTextStyle

@Composable
fun Body(text: String, bodyTextType: BodyTextStyle, modifier: Modifier = Modifier) {
    Text(
        text,
        style = bodyTextType.textStyle,
        modifier = modifier
    )
}

@Composable
@Preview(showBackground = true)
fun BodyPreview() {
    Body(
        text = "Welcome to A&C Native Android",
        BodyTextStyle.VerySmallText
    )
}

@Composable
@Preview(showBackground = true)
fun BodyBoldPreview() {
    Body(
        text = "Welcome to A&C Native Android",
        BodyTextStyle.BodyTextBold
    )
}