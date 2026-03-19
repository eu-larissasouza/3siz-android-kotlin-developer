package br.com.rm552664.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rm552664.R
import br.com.rm552664.ui.components.GameOfThronesLogo
import br.com.rm552664.ui.theme.HouseOfWesterosTheme

@Composable
fun WesterosHouseScreen(
    onSelectNavigateTo: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GameOfThronesLogo(R.drawable.logo_got, "Game Of Thrones Logo", 300.dp)

        Text(
            text = "Descubra sua casa em Westeros",
            fontSize = 22.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(90.dp))

        Button(
            onClick = {
                onSelectNavigateTo()
            },
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                Color.Black,
                Color.White,

                )
        ) {
            Text("Escolher caracteristica", fontSize = 22.sp)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WesterosHouseScreen() {
    HouseOfWesterosTheme {
        WesterosHouseScreen {}
    }
}