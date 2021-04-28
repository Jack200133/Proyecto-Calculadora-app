package com.pruba.taller_20_04

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var txtloque: TextView
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
    lateinit var btnDividir: Button
    lateinit var btnCE: Button
    lateinit var btnC: Button
    lateinit var btnSum: Button
    lateinit var btnResta: Button
    lateinit var btnMul: Button
    lateinit var btnRes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.textResultado)
        txtloque = findViewById(R.id.textLoqueLLeva)

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnCuatro = findViewById(R.id.btnCuatro)
        btnCinco = findViewById(R.id.btnCinco)
        btnSeis = findViewById(R.id.btnSeis)
        btnSiete = findViewById(R.id.btnSiete)
        btnOcho = findViewById(R.id.btnOcho)
        btnNueve = findViewById(R.id.btnNuevo)
        btnCero = findViewById(R.id.bntCero)
        btnPunto = findViewById(R.id.btnPunto)
        btnDividir = findViewById(R.id.btnDel)
        btnCE = findViewById(R.id.btnCE)
        btnC = findViewById(R.id.btnC)
        btnSum = findViewById(R.id.btnMas)
        btnRes = findViewById(R.id.btnIgual)
        btnResta = findViewById(R.id.btnMenos)
        btnMul = findViewById(R.id.btnPor)
        val resultado = ""
        var signo = ""
        var segundo = "0"
        var primer = "0"
        var cual = false

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
        btnPunto.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "0."
            } else {
                txtResultado.text = str + "."
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
        btnCE.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "0"
                txtloque.text = ""
                primer = "0"
                segundo = "0"
                signo = "+"
                cual = false
            } else {
                txtResultado.text = "0"
                txtloque.text = ""
                primer = "0"
                segundo = "0"
                signo = "+"
                cual = false
            }
        }
        btnC.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(str == "0") {
                txtResultado.text = "0"
            } else {
                var res = str.dropLast(1)
                if(res.equals("")){
                    txtResultado.text = "0"
                }else{
                    txtResultado.text = res
                }

            }
        }
        btnSum.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(!cual){
                cual = true
                signo = "+"
                primer = str
                val num = txtloque.text.length
                if(num > 1){
                    val ve = txtloque.text.dropLast(1)
                    txtloque.text = ve.toString() + " + "
                    txtResultado.text = "0"
                }else{
                    txtloque.text = str + " + "
                    txtResultado.text = "0"
                }
            }else{
                segundo = str
                txtloque.text = ""
                primer =  operar(primer, segundo, signo)
                signo = "+"
                txtloque.text = primer + " + "
                txtResultado.text = "0"
            }

        }
        btnRes.setOnClickListener{
            val str: String = txtResultado.text.toString()
            txtloque.text = ""
            segundo = str
            operar(primer, segundo, signo)
            primer = "0"
            segundo = "0"
            signo = "+"
        }

        btnResta.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(!cual){
                cual = true
                signo = "-"
                primer = str
                val num = txtloque.text.length
                if(num > 1){
                    val ve = txtloque.text.dropLast(1)
                    txtloque.text = ve.toString() + " - "
                    txtResultado.text = "0"
                }else{
                    txtloque.text = str + " - "
                    txtResultado.text = "0"
                }
            }else{
                segundo = str
                txtloque.text = ""
                primer =  operar(primer, segundo, signo)
                signo = "-"
                txtloque.text = primer + " - "
                txtResultado.text = "0"
            }
        }

        btnMul.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(!cual){
                cual = true
                signo = "*"
                primer = str
                val num = txtloque.text.length
                if(num > 1){
                    val ve = txtloque.text.dropLast(1)
                    txtloque.text = ve.toString() + " X "
                    txtResultado.text = "0"
                }else{
                    txtloque.text = str + " X "
                    txtResultado.text = "0"
                }
            }else{
                segundo = str
                txtloque.text = ""
                primer =  operar(primer, segundo, signo)
                signo = "*"
                txtloque.text = primer + " X "
                txtResultado.text = "0"
            }
        }
        btnDividir.setOnClickListener{
            val str: String = txtResultado.text.toString()
            if(!cual){
                cual = true
                signo = "/"
                primer = str
                val num = txtloque.text.length
                if(num > 1){
                    val ve = txtloque.text.dropLast(1)
                    txtloque.text = ve.toString() + " ÷ "
                    txtResultado.text = "0"
                }else{
                    txtloque.text = str + " ÷ "
                    txtResultado.text = "0"
                }
            }else{
                segundo = str
                txtloque.text = ""
                primer =  operar(primer, segundo, signo)
                signo = "/"
                txtloque.text = primer + " ÷ "
                txtResultado.text = "0"
            }
        }

    }

    private fun operar(primer:String,segundo:String, signo:String): String {
        val n1 = primer.toDouble()
        val n2 = segundo.toDouble()
        var res = "0"

        when (signo) {
            "+" -> { res = (n1+n2).toString()
            }
            "-" -> { res = (n1-n2).toString()
            }
            "*" -> { res = (n1*n2).toString()
            }
            "/" -> {res = (n1/n2).toString()
            }
        }
        txtResultado.text = res
        return res
    }
}