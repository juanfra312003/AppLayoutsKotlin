package com.example.taller_uno

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.taller_uno.databinding.ActivityMainBinding
import com.example.taller_uno.databinding.ActivityTicTacToeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    fun buttonTicTacToeAction(){
        var intent = Intent (baseContext, TicTacToeActivity::class.java)
        startActivity(intent)
    }

    fun buttonCountriesAction(){
        var intent = Intent (baseContext, ListViewActivity::class.java)
        startActivity(intent)
    }

    fun buttonFrameActivity(itemSelected : String){
        if (itemSelected.isBlank() || itemSelected == " "){
            Toast.makeText(baseContext, "You must to select one language.", Toast.LENGTH_LONG).show()
        }
        else{
            var intent = Intent (baseContext, FrameActivity::class.java)
            val greeting : String = when (itemSelected){
                "Español" -> "Hola."
                "English" -> "Hello"
                "Français"->"Salut"
                "Italiano"->"Ciao"
                "Português"->"Olá"
                else -> ""
            }
            println(greeting)
            intent.putExtra("greeting", greeting)
            startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonTicTacToe.setOnClickListener{buttonTicTacToeAction()}
        //val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, )
        binding.buttonCountries.setOnClickListener{buttonCountriesAction()}
    }
}