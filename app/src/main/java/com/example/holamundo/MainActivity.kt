package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ingreso = findViewById<EditText>(R.id.txtingresar)
        val ver = findViewById<TextView>(R.id.txtver)
        val btnacep = findViewById<Button>(R.id.btnaceptar)

        btnacep.setOnClickListener {
                ver.setText( "Hola"+(ingreso.text.toString()))
        }
    }
}