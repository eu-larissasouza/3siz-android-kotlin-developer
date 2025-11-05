package com.fiap.goldwise

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.fiap.goldwise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalculateTotal.setOnClickListener {
            calculateTotal()
        }

    }

    private fun calculateTotal() {
        val mountGold = binding.etMountGold.text.toString()
        val priceGram = binding.etPriceGram.text.toString();

        if (mountGold == "" || priceGram == "") {
            binding.tvTotalResult.text = getString(R.string.fill_all_fields_text)
        } else {
            val total = mountGold.toDouble() * priceGram.toDouble();
            binding.tvTotalResult.text = getString(R.string.total_result_text, total)
        }

        binding.tvTotalResult.visibility = View.VISIBLE
    }
}