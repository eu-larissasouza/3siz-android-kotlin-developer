package com.fiap.lotteryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fiap.lotteryapp.ui.screens.NumberAmountScreen
import com.fiap.lotteryapp.ui.screens.ResultScreen
import com.fiap.lotteryapp.ui.theme.LotteryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LotteryAppTheme {
                // vamos montar a navegação do app
                val navController = rememberNavController()
                // A navegação em Compose é gerenciada por meio do Navigation Compose, uma biblioteca
                // que permite mudar de tela de forma declarativa

                // A navegação é feita através de rotas registradas em um NavHost

                // mapeamento da navegação
                NavHost(navController = navController, startDestination = "input"){
                    composable(route = "input"){
                        NumberAmountScreen(navController)
                    }

                    composable(route = "result"){
                        ResultScreen()
                    }
                }
            }
        }
    }
}
