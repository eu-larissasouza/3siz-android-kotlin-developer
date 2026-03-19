package br.com.rm552664.repository

import br.com.rm552664.model.Category

fun getAllCategories(): List<Category> {
    return listOf(
        Category(1, "Coragem"),
        Category(2, "Inteligência"),
        Category(3, "Lealdade"),
        Category(4, "Ambição")
    )
}