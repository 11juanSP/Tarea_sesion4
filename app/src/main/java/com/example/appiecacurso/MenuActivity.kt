package com.example.appiecacurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MenuActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button
    lateinit var button5 : Button
    lateinit var button6 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        button = findViewById(R.id.button)
        button1 = findViewById(R.id.button2)
        button2 = findViewById(R.id.button3)
        button3 = findViewById(R.id.button4)
        button4 = findViewById(R.id.button5)
        button5 = findViewById(R.id.button6)
        button6 = findViewById(R.id.button7)

        button.setOnClickListener {
            val intento1 = Intent(this, DiapositivasActivity::class.java)
            startActivity(intento1)
        }

        button1.setOnClickListener {
            val intento1 = Intent(this, TareasActivity::class.java)
            startActivity(intento1)
        }

        button2.setOnClickListener {
            Toast.makeText(this, "Este boton aun esta en reparacion XD", Toast.LENGTH_LONG).show()
        }

        button3.setOnClickListener {
            val intento1 = Intent(this, PromedioActivity::class.java)
            startActivity(intento1)
        }

        button4.setOnClickListener {
            Toast.makeText(this, "Este boton aun esta en reparacion XD", Toast.LENGTH_LONG).show()
        }

        button5.setOnClickListener {
            Toast.makeText(this, "Este boton aun esta en reparacion XD", Toast.LENGTH_LONG).show()
        }

        button6.setOnClickListener {
            val intento1 = Intent(this, MyFirstActivity::class.java)
            startActivity(intento1)
        }

    }
}