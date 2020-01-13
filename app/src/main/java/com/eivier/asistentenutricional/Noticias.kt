package com.eivier.asistentenutricional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.btn_volver.*

class Noticias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

        val webViewNoticias: WebView = findViewById(R.id.webViewNoticias)
        webViewNoticias.settings.javaScriptEnabled = true
        webViewNoticias.loadUrl("https://www.eitb.eus/es/tag/salud/")

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
