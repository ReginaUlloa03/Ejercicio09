package com.example.ejercicio09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun irIniciar(view: View) {
        val usuarioCorrecto ="1234"
        val contrasenaCorrecta ="1234"
        val editTextUsuario = findViewById<EditText>(R.id. edUsuario)
        val editTextContrasena = findViewById<EditText>(R.id.edContra)
        val usuarioIngresado = editTextUsuario.text.toString()
        val contrasenaIngresada = editTextContrasena.text.toString()

        if (usuarioIngresado == usuarioCorrecto && contrasenaIngresada == contrasenaCorrecta) {
            val intent = Intent(this, IniciarSesionActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }
}