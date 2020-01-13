package com.eivier.asistentenutricional.opciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eivier.asistentenutricional.AdaptadorRecyclerView
import com.eivier.asistentenutricional.ClickListener
import com.eivier.asistentenutricional.Principal
import com.eivier.asistentenutricional.R
import com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta.datosComida
import com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta.datosDesayuno
import com.eivier.asistentenutricional.recetasComida.Comida01

class Comidas : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var listaRecetas: RecyclerView
    lateinit var adaptador: AdaptadorRecyclerView
    val recetas = datosComida.creacionDatosComida()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comidas)

        listaRecetas = findViewById(R.id.listaComida)
        layoutManager = LinearLayoutManager(this)
        adaptador = AdaptadorRecyclerView(recetas, object : ClickListener {
            override fun onClick(view: View, position: Int) {
                when (position) {
                    0 -> {
                        startActivity(Intent(this@Comidas, Comida01::class.java))
                    }
                    1 -> {
                        Toast.makeText(this@Comidas, "Receta No $position", Toast.LENGTH_SHORT).show()
                    }
                    2 -> {
                        Toast.makeText(this@Comidas, "Receta No $position", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
        listaRecetas.layoutManager = layoutManager
        listaRecetas.adapter = adaptador
    }
}
