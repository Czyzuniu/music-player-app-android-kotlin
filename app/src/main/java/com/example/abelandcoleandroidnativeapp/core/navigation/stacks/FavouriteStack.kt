package com.example.abelandcoleandroidnativeapp.core.navigation.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.abelandcoleandroidnativeapp.core.designsystem.components.atoms.Heading
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.HeadingStyle

enum class FavouriteStack(val route: String) {
    Favourites("favourites"),
}

@Composable
fun FavouriteStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = FavouriteStack.Favourites.route) {
        composable(FavouriteStack.Favourites.route) { Heading("Favourites Screen", HeadingStyle.TitleOne) }
    }
}
