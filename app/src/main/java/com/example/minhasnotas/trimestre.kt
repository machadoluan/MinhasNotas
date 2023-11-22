package com.example.minhasnotas

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.minhasnotas.databinding.ActivityTrimestreBinding

class trimestre : AppCompatActivity() {

    private lateinit var binding: ActivityTrimestreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrimestreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {
            val diciplina = binding.inputDiciplina.text.toString()
            val inputNota1 = binding.inputNota1.text.toString()
            val inputNota2 = binding.inputNota2.text.toString()

            if (diciplina.isEmpty() || inputNota1.isEmpty() || inputNota2.isEmpty()){
                Toast.makeText(this, "Preenca todos os campos por favor!", Toast.LENGTH_SHORT).show()
            } else {
                val builder = AlertDialog.Builder(this)

                val nota1 = inputNota1.toInt()
                val nota2 = inputNota2.toInt()

                val soma = nota1 + nota2
                val multiplication = soma * 3
                val subtract = 600 - multiplication
                val divider = subtract / 4


//              Starting Result Dialogue!
                builder.setTitle("Minha nota")
                builder.setMessage("Diciplina: $diciplina \n \nVocê ainda precisa de: $divider para passar de ano!")

                builder.setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }

                val alertDialog = builder.create()
                alertDialog.show()
            }
        }

        //==================================[ Skip to the next input ]===================================//

        binding.inputNota1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 2) {
                    binding.inputNota2.requestFocus() // Move o foco para o próximo EditText
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        //===========================================================================================================
    }
}