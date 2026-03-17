package com.fiap.pokeshop.model

import com.fiap.pokeshop.R

data class Item(
    val id: String = "-",
    val name: String = "-",
    val price: Double = 0.00,
    val imageRes: Int
)