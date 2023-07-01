package com.example.appiecacurso

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*

class PromedioActivity : AppCompatActivity() {
    lateinit var im : ImageButton
    lateinit var imm : ImageButton
    lateinit var n1 : EditText
    lateinit var n2 : EditText
    lateinit var n3 : EditText
    lateinit var n4 : EditText
    lateinit var btnnn : Button
    lateinit var resultado : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio)

        im = findViewById(R.id.imageButton3)
        imm = findViewById(R.id.imageButton4)
        n1 = findViewById(R.id.editTextNumber)
        n2 = findViewById(R.id.editTextNumber2)
        n3 = findViewById(R.id.editTextNumber3)
        n4 = findViewById(R.id.editTextNumber4)
        btnnn = findViewById(R.id.button13)
        resultado = findViewById(R.id.textView21)



        btnnn.setOnClickListener(View.OnClickListener {
            resultado.setText(
                promedio(
                    n1.getText().toString().toInt(), n2.getText().toString().toInt(),n3.getText().toString().toInt(),n4.getText().toString().toInt(),
                ).toString() + ""
            )
        })


    }

    private fun promedio(a: Int, b: Int, c: Int, d: Int): Int {
        return (a + b + c + d)/2
    }

    fun imageButton4Clicked(view: View) {
        val intento1 = Intent(this, MenuActivity::class.java)
        startActivity(intento1)
    }

    fun imageButto5Clicked(view: View) {
        Toast.makeText(this, "Ingresa el valor de tus calificaciones y obtiene tu promedio general del curso", Toast.LENGTH_LONG).show()
    }


}