package com.example.appiecacurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import android.widget.Toolbar

class MySecondActivity : AppCompatActivity() {

    private lateinit var button : ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_second)



        button = findViewById(R.id.botoncito)

    }

    fun imageButtonClicked(view: View) {
        val intento1 = Intent(this, MenuActivity::class.java)
        startActivity(intento1)
    }
}