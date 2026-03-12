package com.fiap.jokenpokemon.repository

import com.fiap.jokenpokemon.R
import com.fiap.jokenpokemon.model.Pokemon

fun getAllPokemons(): List<Pokemon> {
    return listOf(
        Pokemon("Charmander", R.drawable.charmander),
        Pokemon("Bulbasaur", R.drawable.bulbassaur),
        Pokemon("Squirtle", R.drawable.squirtle)
    )
}
//
//fun getBoardGamesBy(
//    gamePublisher: GamePublisher
//): List<BoardGame> {
//    return getAllBoardGames().filter {
//
//        it.gamesPublisher.contains(gamePublisher)
//    }
//}