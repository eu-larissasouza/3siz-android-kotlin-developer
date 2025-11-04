package com.fiap.appiadas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.fiap.appiadas.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btNewJoker.setOnClickListener() {
            showJoker();
        }

    }

    private fun showJoker() {
        val jokers = resources.getStringArray(R.array.jokers)
        var numJoker = Random.nextInt(jokers.size)
        val joker = jokers[numJoker]
        binding.tvJoker.text = joker;
    }
}