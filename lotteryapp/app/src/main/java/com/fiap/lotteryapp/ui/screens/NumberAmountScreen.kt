package com.fiap.lotteryapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fiap.lotteryapp.ui.theme.LotteryAppTheme
import java.time.format.TextStyle

@Composable
fun NumberAmountScreen(
    // Parâmetro que gerencia navegação através do AppNavHost
    onNavigateToGenerateNumbers: (Int) -> Unit
) {

    var input by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Gerador de Loteria",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = input,
            onValueChange = {
                input = it
                // Limpa o erro assim que o usuário começa a digitar de novo
                if (error.isNotEmpty()) error = ""
            },
            label = { Text("Quantos numeros você deseja gerar? (1 a 15)") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            isError = error.isNotEmpty(),
            // O supportingText é a forma correta de mostrar erro no Material 3
            supportingText = {
                if (error.isNotEmpty()) {
                    Text(text = error, color = MaterialTheme.colorScheme.error)
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val number = input.toIntOrNull()

                when {
                    number == null -> {
                        error = "Digite um número válido"
                    }
                    number < 1 || number > 15 -> {
                        error = "O valor deve ser entre 1 e 15"
                    }
                    else -> {
                        error = ""
                        onNavigateToGenerateNumbers(number)
                    }
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                Color(0xFF3C0061),
                Color.White
            )
        ) {
            Text("Gerar números")
        }
    }


}

@Preview(showBackground = true)
@Composable
private fun NumberAmountScreenPreview() {
    LotteryAppTheme {
        NumberAmountScreen { }
    }
}