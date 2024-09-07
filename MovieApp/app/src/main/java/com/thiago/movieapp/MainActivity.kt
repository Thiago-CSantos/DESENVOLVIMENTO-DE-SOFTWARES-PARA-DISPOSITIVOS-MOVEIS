package com.thiago.movieapp

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : Activity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Toast.makeText(this, "App de filmes", Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main)

        // Trazer o obj Kotlin de um obj visual do xml
        val btn: Button = findViewById<Button>(R.id.btnEnviar)

        btn.setOnClickListener{
            val nome = findViewById<EditText>(R.id.editName)
            nome.setText("Meu nome mudou pelo main")
            Toast.makeText(this, "App de filmes", Toast.LENGTH_SHORT).show()
        }

    }



}