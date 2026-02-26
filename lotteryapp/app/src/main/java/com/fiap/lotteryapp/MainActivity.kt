package com.fiap.lotteryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fiap.lotteryapp.ui.navigation.AppNavGraph
import com.fiap.lotteryapp.ui.screens.NumberAmountScreen
import com.fiap.lotteryapp.ui.screens.ResultScreen
import com.fiap.lotteryapp.ui.theme.LotteryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LotteryAppTheme {
                // Delegamos a responsabilidade de navegação para um composable próprio.
                AppNavGraph(rememberNavController())
            }
        }
    }
}
