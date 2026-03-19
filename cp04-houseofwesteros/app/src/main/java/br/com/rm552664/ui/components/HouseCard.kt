package com.fiap.jokenpokemon.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rm552664.R
import br.com.rm552664.model.House

@Composable
fun HouseCard(house: House) {
    val context = LocalContext.current

    val resultHouse = context.getString(R.string.result_house, house.name)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = house.imageRes),
            contentDescription = house.name,
            modifier = Modifier
                .size(400.dp)
                .padding(15.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = resultHouse,
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}

