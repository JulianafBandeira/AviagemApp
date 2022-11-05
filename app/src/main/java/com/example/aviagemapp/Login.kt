package com.example.aviagemapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun entrar(view: View?) {
        val intent = Intent(this, Produtos::class.java).apply {
        }
        startActivity(intent)
    }

    fun cadastrar(view: View?) {
        val intent = Intent(this, Cadastro::class.java).apply {
        }
        startActivity(intent)
    }


}