package com.fiap.jokenpokemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.fiap.jokenpokemon.ui.navigation.AppNavGraph
import com.fiap.jokenpokemon.ui.theme.JoKenPokemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JoKenPokemonTheme {
                val navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}