package com.fiap.meuseguroauto

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.fiap.meuseguroauto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // um dos principais metodos, cria a nossa tela
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Define a função executada ao clicar no botao
        binding.btBack.setOnClickListener {
            binding.containerSummary.visibility = View.GONE
        }

        binding.btSend.setOnClickListener {
            binding.containerSummary.visibility = View.VISIBLE
        }


    }
}