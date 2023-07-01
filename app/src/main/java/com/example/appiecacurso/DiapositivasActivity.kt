package com.example.appiecacurso

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class DiapositivasActivity : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var img : ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diapositivas)

        btn1 = findViewById(R.id.button8)
        btn2 = findViewById(R.id.button9)
        btn3 = findViewById(R.id.button10)
        img = findViewById(R.id.imageButton2)

        btn1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://ieca.conectatalentomx.com/app/virtual-classroom/3?moduleId=17&resourceId=12")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://ieca.conectatalentomx.com/app/virtual-classroom/3?moduleId=18&resourceId=33")
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://ieca.conectatalentomx.com/app/virtual-classroom/3?moduleId=19&resourceId=71")
            startActivity(intent)
        }


    }

    fun imageButton2Clicked(view: View) {
        val intento1 = Intent(this, MenuActivity::class.java)
        startActivity(intento1)
    }
}