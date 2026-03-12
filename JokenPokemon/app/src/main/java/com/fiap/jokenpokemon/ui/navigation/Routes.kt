package com.fiap.jokenpokemon.ui.navigation

sealed class Routes(val route: String) {

    object PlayerName : Routes("playername")

    object JoKenPokemon : Routes("jokenpokemon/{${Args.PLAYER_NAME}}"){
        object Args {
            const val PLAYER_NAME = "playername"
        }

        fun createRoute(playername: String) = "jokenpokemon/${playername}"
    }
}