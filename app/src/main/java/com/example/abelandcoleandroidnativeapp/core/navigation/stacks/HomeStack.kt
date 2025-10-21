package com.example.abelandcoleandroidnativeapp.core.navigation.stacks

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.abelandcoleandroidnativeapp.core.components.atoms.Heading
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.HeadingStyle

enum class HomeStack(val route: String) {
    Home("home"),
    HomeDetails("home_details")
}

@Composable
fun HomeStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = HomeStack.Home.route) {
        composable(HomeStack.Home.route) { Box {
            Heading("Home Screen", HeadingStyle.TitleOne)
        } }
    }
}
