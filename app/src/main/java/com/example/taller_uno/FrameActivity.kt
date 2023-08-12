package com.example.taller_uno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.taller_uno.databinding.ActivityFrameBinding
import com.example.taller_uno.databinding.ActivityMainBinding

class FrameActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFrameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val itemselected = intent.getStringExtra("itemselected")
        asignValue(itemselected.toString())
    }

    fun asignValue(itemSelected : String){
        val greeting : String = when (itemSelected){
            "Español" -> "Hola, que tengas un bonito día.."
            "English" -> "Hello, have a nice day."
            "Français"->"Salut, bonne journée."
            "Italiano"->"Ciao, buona giornata."
            "Português"->"Olá, tenha um bom dia."
            else -> ""
        }
        binding.greetingText.text = greeting.toString()
    }

}