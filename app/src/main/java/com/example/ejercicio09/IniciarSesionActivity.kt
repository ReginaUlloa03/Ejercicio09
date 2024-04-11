package com.example.ejercicio09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IniciarSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        // Encuentra el botón por su ID
        val btnCerrar = findViewById<Button>(R.id.idCerrar)

        // Asigna un OnClickListener al botón
        btnCerrar.setOnClickListener {
            // Cierra la actividad actual
            finish()
        }

    }
}