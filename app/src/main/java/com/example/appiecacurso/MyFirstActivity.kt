package com.example.appiecacurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MyFirstActivity : AppCompatActivity() {

    lateinit var btn : Button
    lateinit var contra : EditText
    lateinit var nom : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first)

        btn = findViewById(R.id.btn1)
        contra = findViewById(R.id.contra)
        nom = findViewById(R.id.nombre)

        btn.setOnClickListener {
            val intento1 = Intent(this, MySecondActivity::class.java)
            startActivity(intento1)

        /*if ((nom == "admin"))&&(contra == "admin")) {
                    val intento1 = Intent(this, MySecondActivity::class.java)
                    startActivity(intento1)
                }else{
                    Toast.makeText(this, "El usuario o la contraseña son incorrectas", Toast.LENGTH_LONG).show()
                }*/
        }

    }
}