package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = Calcular
        val resultado = Resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(Nota1.text.toString())
            val nota2 = Integer.parseInt(Nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val falta = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && falta <= 10){
                resultado.setText("Aluno foi aprovado\n Média: ${media}\n Faltas: ${falta}")
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno foi reprovado\n Média: ${media}\n Faltas: ${falta}")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}