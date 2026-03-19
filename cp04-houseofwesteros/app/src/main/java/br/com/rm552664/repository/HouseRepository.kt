package br.com.rm552664.repository

import br.com.rm552664.R
import br.com.rm552664.model.House

fun getAllHouses(): List<House> {
    return listOf(
        House("Coragem", "Casa Stark", R.drawable.house_stark),
        House("Inteligência", "Casa Lannister", R.drawable.house_lannister),
        House("Lealdade", "Casa Tully", R.drawable.house_tully),
        House("Ambição", "Casa Targaryen", R.drawable.house_targaryen)
    )
}

fun getHouseBy(category: String): House {
    return getAllHouses().filter {
        it.category.contains(
            category, ignoreCase = true
        )
    }.first()
}