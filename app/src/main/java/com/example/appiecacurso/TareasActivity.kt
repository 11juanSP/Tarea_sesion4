package com.example.appiecacurso

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class TareasActivity : AppCompatActivity() {

    lateinit var imga : ImageButton
    lateinit var btnw : Button
    lateinit var btnn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tareas)

        imga = findViewById(R.id.imageButton)
        btnw = findViewById(R.id.button11)
        btnn = findViewById(R.id.button12)

        btnw.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://ieca.conectatalentomx.com/app/virtual-classroom/3?moduleId=17&resourceId=35")
            startActivity(intent)
        }

        btnn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://ieca.conectatalentomx.com/app/virtual-classroom/3?moduleId=18&resourceId=42")
            startActivity(intent)
        }


    }
    fun imageButton3Clicked(view: View) {
        val intento1 = Intent(this, MenuActivity::class.java)
        startActivity(intento1)
    }
}