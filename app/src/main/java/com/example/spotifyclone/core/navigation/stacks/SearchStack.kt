package com.example.spotifyclone.core.navigation.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spotifyclone.core.designsystem.components.atoms.Heading
import com.example.spotifyclone.core.designsystem.theme.HeadingType

enum class SearchStack(val route: String) {
    Search("search"),
}

@Composable
fun SearchStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = SearchStack.Search.route) {
        composable(SearchStack.Search.route) { Heading("Search Screen", HeadingType.TitleOne) }
    }
}
