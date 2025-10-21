package com.example.abelandcoleandroidnativeapp.core.navigation.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.abelandcoleandroidnativeapp.core.components.atoms.Heading
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.HeadingStyle

enum class AccountStack(val route: String) {
    Account("account"),
}

@Composable
fun AccountStack(navController: NavHostController) {
    NavHost(navController = navController, startDestination = AccountStack.Account.route) {
        composable(AccountStack.Account.route) { Heading("Account Screen", HeadingStyle.TitleOne) }
    }
}
