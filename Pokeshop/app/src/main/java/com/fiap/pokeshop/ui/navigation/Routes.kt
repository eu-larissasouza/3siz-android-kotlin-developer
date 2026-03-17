package com.fiap.pokeshop.ui.navigation

sealed class Routes(val route: String) {
    object Login : Routes("login")

    object Shop : Routes("shop/{${Args.TRAINER_NAME}}") {
        object Args {
            const val TRAINER_NAME = "trainerName"
        }

        fun createRoute(trainerName: String) = "shop/${trainerName}"
    }
}