package com.example.minhasnotas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minhasnotas.databinding.ActivitySelecionarOpcao2Binding

class selecionarOpcao2 : AppCompatActivity() {

    private lateinit var binding: ActivitySelecionarOpcao2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelecionarOpcao2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSelecionar1.setOnClickListener {
            val i = Intent(this, trimestre::class.java)
            startActivity(i)
        }

        binding.btnSelecionar2.setOnClickListener {
            val i = Intent(this, bimestre::class.java)
            startActivity(i)
        }
    }
}