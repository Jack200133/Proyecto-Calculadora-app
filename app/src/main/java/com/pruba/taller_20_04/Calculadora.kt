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
    lateinit var btnCuatro: Button
    lateinit var btnCinco: Button
    lateinit var btnSeis: Button
    lateinit var btnSiete: Button
    lateinit var btnOcho: Button
    lateinit var btnNueve: Button
    lateinit var btnCero: Button
    lateinit var btnPunto: Button
    lateinit var btnMenos: Button
    lateinit var btnDividir: Button
    lateinit var btnPor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.textResultado)

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnMas = findViewById(R.id.btnMas)
        btnCuatro = findViewById(R.id.btnCuatro)
        btnCinco = findViewById(R.id.btnCinco)
        btnSeis = findViewById(R.id.btnSeis)
        btnSiete = findViewById(R.id.btnSiete)
        btnOcho = findViewById(R.id.btnOcho)
        btnNueve = findViewById(R.id.btnNuevo)
        btnCero = findViewById(R.id.bntCero)
        btnPunto = findViewById(R.id.btnPunto)
        btnMenos = findViewById(R.id.btnMenos)
        btnDividir = findViewById(R.id.btnDel)
        btnPor = findViewById(R.id.btnPor)

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
        btnCuatro.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "4"
            } else {
                txtResultado.text = str + "4"
            }
        }
        btnCinco.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "5"
            } else {
                txtResultado.text = str + "5"
            }
        }
        btnSeis.setOnClickListener{

            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "6"
            } else {
                txtResultado.text = str + "6"
            }

        }
        btnSiete.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "7"
            } else {
                txtResultado.text = str + "7"
            }
        }
        btnOcho.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "8"
            } else {
                txtResultado.text = str + "8"
            }
        }
        btnNueve.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "9"
            } else {
                txtResultado.text = str + "9"
            }
        }
        btnCero.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "0"
            } else {
                txtResultado.text = str + "0"
            }
        }
    }
}