package com.eivier.asistentenutricional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long=6000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Crear un objeto de Animation
        val animacion: Animation = AnimationUtils.loadAnimation(this, R.anim.animacion )
        txtBienvenida.startAnimation(animacion)
        imgFondo.startAnimation(animacion)
        txtGrupo.startAnimation(animacion)
        txtNombre.startAnimation(animacion)
        txtRecuperacion.startAnimation(animacion)

        //Se inicia la actividad principal
        Handler().postDelayed({
            startActivity(Intent(this,  Principal::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }
}
