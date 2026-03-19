package com.fiap.jokenpokemon.ui.navigation

sealed class Routes(val route: String) {

    object WesterosHouse : Routes("westeroshouse")

    object Category : Routes("category")

    object ResultHouse : Routes("resulthouse/{${Args.CATEGORY_NAME}}"){
        object Args {
            const val CATEGORY_NAME = "categoryname"
        }

        fun createRoute(categoryname: String) = "resulthouse/${categoryname}"
    }
}