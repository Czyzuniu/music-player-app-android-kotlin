package com.example.spotifyclone.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.spotifyclone.core.designsystem.components.atoms.Heading
import com.example.spotifyclone.core.designsystem.theme.HeadingType

@Composable
fun HomeScreen(): Unit {
    Heading(
        "Home Screen",
        headingType = HeadingType.TitleOne,
    )
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(): Unit {
    HomeScreen()
}