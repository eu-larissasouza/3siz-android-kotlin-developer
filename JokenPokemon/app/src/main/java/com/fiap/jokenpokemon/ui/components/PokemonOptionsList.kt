package com.fiap.jokenpokemon.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fiap.jokenpokemon.R
import com.fiap.jokenpokemon.model.Pokemon

@Composable
fun PokemonOptionsList(
    options: List<Pokemon>,
    pokemonSelected: Pokemon,
    onSelected: (Pokemon) -> Unit,
) {
    Row(
        horizontalArrangement =
            Arrangement.spacedBy(16.dp)
    ) {
        options.forEach { pokemon ->
            PokemonOption(
                pokemon = pokemon,
                selected = pokemon == pokemonSelected,
                onSelected = onSelected
            )
        }
    }
}

@Composable
fun PokemonOption(
    selected: Boolean,
    pokemon: Pokemon,
    onSelected: (Pokemon) -> Unit
) {
    Column(
        modifier = Modifier
            .clickable { onSelected(pokemon) }
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = if (selected)
                painterResource(
                    id =
                        R.drawable.pokeball_selected
                ) else painterResource(
                id = R.drawable.pokeball_unselected
            ),
            contentDescription = pokemon.name,
            modifier = Modifier.size(40.dp),
            colorFilter = if (isSystemInDarkTheme() &&
                !selected
            ) ColorFilter.tint(Color.White) else null
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = pokemon.name, fontSize = 16.sp)
    }
}
