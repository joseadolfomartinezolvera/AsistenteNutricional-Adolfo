package com.eivier.asistentenutricional.recetasCena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.asistentenutricional.R
import com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta.datosCena
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.btn_volver.*
import kotlinx.android.synthetic.main.detalles_receta.*

class Cena01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cena01)

        val recetas = datosCena.creacionDatosCena()
        val receta01 = recetas.get(0)
        nombre_receta.text = receta01.nombre
        Picasso.get().load(receta01.imagen).into(imageReceta)
        imageReceta.setImageResource(R.drawable.platosaludable)
        duracion_receta.text = receta01.tiempo
        porciones_receta.text = receta01.porciones
        dificultad_receta.text = receta01.dificultad
        ingredientes_receta.text = receta01.ingredientes
        procedimiento_receta.text = receta01.preparacion

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
