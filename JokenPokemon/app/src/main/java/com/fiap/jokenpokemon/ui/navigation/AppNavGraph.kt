package com.fiap.jokenpokemon.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.fiap.jokenpokemon.ui.screens.JoKenPokemonScreen
import com.fiap.jokenpokemon.ui.screens.PlayerNameScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController, startDestination = Routes.PlayerName.route
    ) {

        composable(route = Routes.PlayerName.route) {
            PlayerNameScreen { playerName ->
                navController.navigate(Routes.JoKenPokemon.createRoute(playerName))
            }
        }

        composable(
            route = Routes.JoKenPokemon.route, arguments = listOf(
                navArgument(Routes.JoKenPokemon.Args.PLAYER_NAME) {
                    type = NavType.StringType
                })
        ) {
            val playerName = it.arguments?.getString(
                Routes.JoKenPokemon.Args.PLAYER_NAME
            ) ?: "Ash"
            JoKenPokemonScreen(playerName)
        }

    }
}