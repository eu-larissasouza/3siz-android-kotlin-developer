package com.fiap.lotteryapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.fiap.lotteryapp.ui.screens.NumberAmountScreen
import com.fiap.lotteryapp.ui.screens.ResultScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
// A navegação em Compose é gerenciada por meio do Navigation Compose, uma biblioteca
// que permite mudar de tela de forma declarativa

// NavController: responsável por controlar as transições entre as telas.
// NavHost: define o container onde as telas serão exibidas e registra as rotas disponíveis.

// Mapeamento da navegação
    NavHost(
        navController = navController, startDestination = Routes.Input.route
    ) {

        composable(route = Routes.Input.route) {
            NumberAmountScreen { amount ->
                // Ensino a criar a rota
                navController.navigate(Routes.Result.createRoute(amount))
            }
        }

        composable(
            route = Routes.Result.route, arguments = listOf(
                navArgument(Routes.Result.Args.AMOUNT) {
                    type = NavType.IntType
                    defaultValue = 6
                })
        ) {
            val amount = it.arguments?.getInt(Routes.Result.Args.AMOUNT) ?: 6
            ResultScreen(amount)
        }

    }
}