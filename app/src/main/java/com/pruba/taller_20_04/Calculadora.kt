package com.pruba.taller_20_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var btnUno: Button
    lateinit var btnDos: Button
    lateinit var btnTres: Button
    lateinit var btnMas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.textResultado)

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnMas = findViewById(R.id.btnMas)

        btnUno.setOnClickListener{

            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "1"
            } else {
                txtResultado.text = str + "1"
            }

        }

        btnDos.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "2"
            } else {
                txtResultado.text = str + "2"
            }
        }
        btnTres.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "3"
            } else {
                txtResultado.text = str + "3"
            }
        }
    }
}