package com.fiap.pokeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.fiap.pokeshop.ui.navigation.AppNavGraph
import com.fiap.pokeshop.ui.screens.LoginScreen
import com.fiap.pokeshop.ui.theme.PokeShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokeShopTheme {
                AppNavGraph(rememberNavController())
            }
        }
    }
}
