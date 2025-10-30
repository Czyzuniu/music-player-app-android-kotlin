package com.example.spotifyclone.core.navigation.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spotifyclone.screens.home.HomeScreen

enum class HomeStack(val route: String) {
    Home("home"),
    HomeDetails("home_details")
}

@Composable
fun HomeStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = HomeStack.Home.route) {
        composable(HomeStack.Home.route) { HomeScreen() }
    }
}
