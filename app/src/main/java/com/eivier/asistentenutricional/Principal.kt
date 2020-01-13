package com.eivier.asistentenutricional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*

class Principal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        importancia.setOnClickListener{
            startActivity(Intent(this, Importancia::class.java))
        }

        receta.setOnClickListener{
            startActivity(Intent(this, RecetasOpciones::class.java))
        }

        noticias.setOnClickListener{
            startActivity(Intent(this, Noticias::class.java))
        }
    }
}
