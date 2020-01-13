package com.eivier.asistentenutricional.recetasDesayuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.asistentenutricional.R
import com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta.datosCena
import com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta.datosDesayuno
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.btn_volver.*
import kotlinx.android.synthetic.main.detalles_receta.*

class Desayuno01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desayuno01)

        val recetas = datosDesayuno.creacionDatosDesayuno()
        val receta01 = recetas.get(0)
        nombre_receta.text = receta01.nombre
        Picasso.get().load(receta01.imagen).into(imageReceta)
        //imageReceta.setImageResource(R.drawable.platosaludable)
        duracion_receta.text = receta01.tiempo
        porciones_receta.text = receta01.porciones.toString()
        dificultad_receta.text = receta01.dificultad
        ingredientes_receta.text = receta01.ingredientes
        procedimiento_receta.text = receta01.preparacion

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
