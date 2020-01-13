package com.eivier.asistentenutricional

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.eivier.asistentenutricional.opciones.Cenas
import com.eivier.asistentenutricional.opciones.Comidas
import com.eivier.asistentenutricional.opciones.Desayunos
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.activity_recetas_opciones.*
import kotlinx.android.synthetic.main.btn_volver.*
import kotlinx.android.synthetic.main.content_recetas_opciones.*
import kotlinx.android.synthetic.main.detalles_receta.*

class RecetasOpciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetas_opciones)
        setSupportActionBar(toolbar)

        btnDesayuno.setOnClickListener{
            startActivity(Intent(this, Desayunos::class.java))
        }

        btnComida.setOnClickListener{
            startActivity(Intent(this, Comidas::class.java))
        }

        btnCena.setOnClickListener{
            startActivity(Intent(this, Cenas::class.java))
        }

        btnVolver.setOnClickListener{
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.desayuno -> {
                startActivity(Intent(this, Desayunos::class.java))
            }
            R.id.comida -> {
                startActivity(Intent(this, Comidas::class.java))
            }
            R.id.cena -> {
                startActivity(Intent(this, Cenas::class.java))
            }
            R.id.principal -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
