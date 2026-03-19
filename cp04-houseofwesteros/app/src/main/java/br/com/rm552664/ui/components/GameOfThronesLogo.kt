package br.com.rm552664.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp

@Composable
fun GameOfThronesLogo(imageRes: Int, desc: String, size: Dp) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = desc,
        modifier = Modifier
            .height(size)
            .fillMaxWidth()
    )
}