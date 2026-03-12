package com.fiap.jokenpokemon.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fiap.jokenpokemon.model.Pokemon

@Composable
fun PokemonCard(pokemon: Pokemon, label: String, isMirrored: Boolean = false, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier) {
        Image(
            painter = painterResource(id = pokemon.imageRes),
            contentDescription = pokemon.name,
            modifier = Modifier
                .size (240.dp)
                .padding(if (pokemon.name == "-") 40.dp else 0.dp) // Garante que a Pokebola vazia não fique tão grande
                .graphicsLayer(
                    scaleX = if (isMirrored) -1f else 1f // Inverte a imagem se for true -> Um jogador contra o outro
                )
        )

        Text(
            text = pokemon.name,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            text = label,
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}

