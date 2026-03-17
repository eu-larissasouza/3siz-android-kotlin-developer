package com.fiap.pokeshop.repository

import com.fiap.pokeshop.R
import com.fiap.pokeshop.model.Item

fun getAllItems(): List<Item> {
    return listOf(
        Item("1", "Poké Ball", 200.0, R.drawable.poke_ball),
        Item("2", "Potion", 300.0, R.drawable.potion),
        Item("3", "Super Potion", 700.0, R.drawable.super_potion),
        Item("4", "Hyper Potion", 1200.0, R.drawable.hyper_potion),
        Item("5", "Max Potion", 2500.0, R.drawable.max_potion),
        Item("6", "Revive", 1500.0, R.drawable.revive),
        Item("7", "Razz Berry", 100.0, R.drawable.razz_berry),
        Item("8", "Pinap Berry", 150.0, R.drawable.pinap_berry),
        Item("9", "Bluk Berry", 100.0, R.drawable.bluk_berry),
        Item("10", "Fire Stone", 3000.0, R.drawable.fire_stone),
        Item("11", "Water Stone", 3000.0, R.drawable.water_stone),
        Item("12", "Full Incense", 2000.0, R.drawable.full_incense),
        Item("13", "X Attack", 1000.0, R.drawable.x_attack),
        Item("14", "X Defense", 1000.0, R.drawable.x_defense)
    )
}