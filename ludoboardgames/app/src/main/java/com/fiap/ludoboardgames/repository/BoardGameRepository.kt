package com.fiap.ludoboardgames.repository

import com.fiap.ludoboardgames.model.BoardGame
import com.fiap.ludoboardgames.model.GamePublisher

fun getAllBoardGames(): List<BoardGame> {
    return listOf(
        BoardGame("Azul", listOf(Asmodee)),
        BoardGame(
            "Ticket To Ride",
            listOf(Asmodee)
        ),
        BoardGame(
            "Quem Foi?",
            listOf(PaperGames)
        ),
    )
}

fun getBoardGamesBy(
    gamePublisher: GamePublisher
): List<BoardGame> {
    return getAllBoardGames().filter {

        it.gamesPublisher.contains(gamePublisher)
    }
}