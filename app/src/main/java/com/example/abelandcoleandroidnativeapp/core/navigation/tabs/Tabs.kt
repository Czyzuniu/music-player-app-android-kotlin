package com.example.abelandcoleandroidnativeapp.core.navigation.tabs

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.navigation.compose.rememberNavController
import com.example.abelandcoleandroidnativeapp.R
import com.example.abelandcoleandroidnativeapp.core.designsystem.components.atoms.Body
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.Aubergine
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.BodyTextStyle
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.Charcoal60
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.Charcoal80
import com.example.abelandcoleandroidnativeapp.core.designsystem.theme.IconSize
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

    val myNavigationSuiteItemColors = NavigationSuiteDefaults.itemColors(
        navigationBarItemColors = NavigationBarItemDefaults.colors(
            selectedIconColor = Aubergine,
            selectedTextColor = Charcoal80,
            unselectedIconColor = Charcoal60,
            unselectedTextColor = Charcoal80,
        ),
    )

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            painter = painterResource(it.iconRes),
                            contentDescription = it.label,
                            modifier = Modifier.size(IconSize.lg)
                        )
                    },
                    label = { Body(it.label, BodyTextStyle.VerySmallText) },
                    selected = it == selectedTab,
                    onClick = { selectedTab = it },
                    colors = myNavigationSuiteItemColors
                )
            }
        },
        navigationSuiteColors = NavigationSuiteDefaults.colors(
            navigationBarContainerColor = Color.Transparent,
        )
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
    @DrawableRes val iconRes: Int,
) {
    HOME("Home", R.drawable.house),
    SEARCH("Search", R.drawable.grid),
    FAVORITES("Favorites", R.drawable.heart),
    ORDERS("Orders", R.drawable.van),
    ACCOUNT("Account", R.drawable.account),
}