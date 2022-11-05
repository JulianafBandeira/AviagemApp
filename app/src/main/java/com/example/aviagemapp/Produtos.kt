package com.example.aviagemapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Produtos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produtos)
    }
    fun caixoes(view: View?) {
        val intent = Intent(this, Caixoes::class.java).apply {
        }
        startActivity(intent)
    }

    fun flores(view: View?) {
        val intent = Intent(this, Flores::class.java).apply {
        }
        startActivity(intent)
    }
    fun velas(view: View?) {
        val intent = Intent(this, Velas::class.java).apply {
        }
        startActivity(intent)
    }
    fun lapides(view: View?) {
        val intent = Intent(this, Lapides::class.java).apply {
        }
        startActivity(intent)
    }


}
