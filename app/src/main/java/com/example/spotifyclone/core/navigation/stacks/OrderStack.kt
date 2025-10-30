package com.example.spotifyclone.core.navigation.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spotifyclone.core.designsystem.components.atoms.Heading
import com.example.spotifyclone.core.designsystem.theme.HeadingType

enum class OrderStack(val route: String) {
    Orders("orders"),
}

@Composable
fun OrdersStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = OrderStack.Orders.route) {
        composable(OrderStack.Orders.route) { Heading("Orders Screen", HeadingType.TitleOne) }
    }
}
