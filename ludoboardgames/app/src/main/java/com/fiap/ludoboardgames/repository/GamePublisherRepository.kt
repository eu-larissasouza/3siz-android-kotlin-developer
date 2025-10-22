package com.fiap.ludoboardgames.repository

import com.fiap.ludoboardgames.model.GamePublisher

// nosso repositorio para gerenciar os dados
// nesse caso, a lista de editoras de games
val Asmodee = GamePublisher(title = "Asmodee")
val Devir = GamePublisher(title = "Devir")
val Calamity = GamePublisher(title = "Calamity")
val Conclave = GamePublisher(title = "Conclave")
val PaperGames = GamePublisher(title = "PaperGames")
val MeepleBR = GamePublisher(title = "Meeple BR")
val JellyMonster = GamePublisher(title = "Jelly Monster")
val AcrossTheBoard = GamePublisher(title = "Across the Board")
val Grok = GamePublisher(title = "Grok")
val Mosaico = GamePublisher(title = "Mosaico")
val Buro = GamePublisher(title = "Buro")

fun getAllGamesPublishers(): List<GamePublisher> {
    return listOf(
        Asmodee,
        Devir,
        Calamity,
        Conclave,
        PaperGames,
        MeepleBR,
        JellyMonster,
        AcrossTheBoard,
        Grok,
        Mosaico,
        Buro
    )
}