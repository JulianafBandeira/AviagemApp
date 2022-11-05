package com.example.aviagemapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }
    fun enviar2(view: View?) {
        val intent = Intent(this, Login::class.java).apply {
        }
        startActivity(intent)
    }


}