package com.example.minhasnotas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minhasnotas.databinding.ActivitySelecionarOpcaoBinding

class selecionarOpcao : AppCompatActivity() {

    private lateinit var binding: ActivitySelecionarOpcaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelecionarOpcaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSelecionar1.setOnClickListener {
            val i = Intent(this, selecionarOpcao2::class.java)
            startActivity(i)
        }

        binding.btnSelecionar2.setOnClickListener {
            val i = Intent(this, selecionarOpcao2::class.java)
            startActivity(i)
        }
    }
}