package com.fiap.pokeshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.fiap.pokeshop.ui.screens.LoginScreen
import com.fiap.pokeshop.ui.screens.ShopScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController, startDestination = Routes.Login.route
    ) {

        composable(route = Routes.Login.route) {
            LoginScreen { trainerName ->
                navController.navigate(Routes.Shop.createRoute(trainerName))
            }
        }

        composable(
            route = Routes.Shop.route, arguments = listOf(
                navArgument(Routes.Shop.Args.TRAINER_NAME) {
                    type = NavType.StringType
                })
        ) {
            val trainerName = it.arguments?.getString(
                Routes.Shop.Args.TRAINER_NAME
            ) ?: "Ash"
            ShopScreen(trainerName, onBackClick = { navController.popBackStack() });
        }

    }
}