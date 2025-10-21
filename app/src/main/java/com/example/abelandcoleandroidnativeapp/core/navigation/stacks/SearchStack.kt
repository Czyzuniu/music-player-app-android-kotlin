package com.example.abelandcoleandroidnativeapp.core.navigation.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.abelandcoleandroidnativeapp.core.components.atoms.Heading
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.HeadingStyle

enum class SearchStack(val route: String) {
    Search("search"),
}

@Composable
fun SearchStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = SearchStack.Search.route) {
        composable(SearchStack.Search.route) { Heading("Search Screen", HeadingStyle.TitleOne) }
    }
}
