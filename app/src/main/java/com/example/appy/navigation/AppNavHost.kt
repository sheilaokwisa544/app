package com.example.sellapy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.ui.theme.screens.about.AboutScreen
import com.example.sellapy.ui.theme.screens.contact.ContactScreen
import com.example.sellapy.ui.theme.screens.dashboard.DashboardScreen
import com.example.sellapy.ui.theme.screens.details.DetailsScreen
import com.example.sellapy.ui.theme.screens.home.HomeScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }


    }
}