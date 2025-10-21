package com.example.abelandcoleandroidnativeapp.core.navigation.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.navigation.compose.rememberNavController
import com.example.abelandcoleandroidnativeapp.core.navigation.stacks.AccountStack
import com.example.abelandcoleandroidnativeapp.core.navigation.stacks.FavouriteStack
import com.example.abelandcoleandroidnativeapp.core.navigation.stacks.HomeStack
import com.example.abelandcoleandroidnativeapp.core.navigation.stacks.OrdersStack
import com.example.abelandcoleandroidnativeapp.core.navigation.stacks.SearchStack

@PreviewScreenSizes

@Composable
@Preview
fun Tabs() {
    var selectedTab by rememberSaveable { mutableStateOf(AppDestinations.HOME) }

    val homeNavController = rememberNavController()

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            it.icon,
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == selectedTab,
                    onClick = { selectedTab = it }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding), // Apply Scaffold inner padding
                contentAlignment = Alignment.Center // Center the content
            ) {
                when (selectedTab) {
                    AppDestinations.HOME -> HomeStack(navController = homeNavController)
                    AppDestinations.SEARCH -> SearchStack(navController = homeNavController)
                    AppDestinations.FAVORITES -> FavouriteStack(navController = homeNavController)
                    AppDestinations.ORDERS -> OrdersStack(navController = homeNavController)
                    AppDestinations.ACCOUNT -> AccountStack(navController = homeNavController)
                }
            }
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    HOME("Home", Icons.Default.Home),
    SEARCH("Search", Icons.Default.Favorite),
    FAVORITES("Favorites", Icons.Default.Favorite),
    ORDERS("Orders", Icons.Default.ShoppingCart),
    ACCOUNT("Account", Icons.Default.AccountBox),
}