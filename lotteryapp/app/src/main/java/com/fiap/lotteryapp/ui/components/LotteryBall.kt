package com.fiap.lotteryapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fiap.lotteryapp.ui.screens.NumberAmountScreen
import com.fiap.lotteryapp.ui.theme.LotteryAppTheme

@Composable
fun LotteryBall(number: Int) {
    /* wrapContentSize = Ocupa somente o espaço necessário pro componente */
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .wrapContentSize()
            .size(60.dp) // Largura e altura devem ser iguais
            .background(
                color = Color(0xFF3C0061),
                shape = CircleShape
            ),
    ) {
        Text(
            text = number.toString(),
            fontSize = 20.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LotteryBallPreview() {
    LotteryAppTheme {
        LotteryBall(2)
    }
}