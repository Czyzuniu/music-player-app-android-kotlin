package com.example.abelandcoleandroidnativeapp.core.components.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.BodyTextStyle

@Composable
fun BodyText(text: String, bodyTextType: BodyTextStyle, modifier: Modifier = Modifier) {
    Text(
        text,
        style = bodyTextType.textStyle,
        modifier = modifier
    )
}