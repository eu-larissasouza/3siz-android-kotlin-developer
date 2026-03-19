package br.com.rm552664.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import br.com.rm552664.ui.screens.CategoryScreen
import br.com.rm552664.ui.screens.ResultHouseScreen
import br.com.rm552664.ui.screens.WesterosHouseScreen
import com.fiap.jokenpokemon.ui.navigation.Routes

@Composable
fun AppNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController, startDestination = Routes.WesterosHouse.route
    ) {

        composable(route = Routes.WesterosHouse.route) {
            WesterosHouseScreen {
                navController.navigate(Routes.Category.route)
            }
        }

        composable(route = Routes.Category.route) {
            CategoryScreen { categoryName ->
                navController.navigate(Routes.ResultHouse.createRoute(categoryName))
            }
        }

        composable(
            route = Routes.ResultHouse.route, arguments = listOf(
                navArgument(Routes.ResultHouse.Args.CATEGORY_NAME) {
                    type = NavType.StringType
                })
        ) {
            val categoryname = it.arguments?.getString(
                Routes.ResultHouse.Args.CATEGORY_NAME
            ) ?: "Ash"
            ResultHouseScreen(categoryname)
        }

    }
}