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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTicTacToe.setOnClickListener{buttonTicTacToeAction()}
        binding.buttonRandomGreet.setOnClickListener { buttonFrameActivity(binding) }
        binding.buttonCountries.setOnClickListener{buttonCountriesAction()}
    }

    fun buttonTicTacToeAction(){
        var intent = Intent (baseContext, TicTacToeActivity::class.java)
        startActivity(intent)
    }

    fun buttonCountriesAction(){
        var intent = Intent (baseContext, ListViewActivity::class.java)
        startActivity(intent)
    }

    fun buttonFrameActivity(binding : ActivityMainBinding){
        val itemSelected = binding.spinnerRandomGreet.selectedItem.toString()
        if (itemSelected.isBlank() || itemSelected == " "){
            Toast.makeText(baseContext, "You must to select one language.", Toast.LENGTH_SHORT).show()
        }
        else{
            var intent = Intent (baseContext, FrameActivity::class.java)
            intent.putExtra("itemselected", itemSelected)
            startActivity(intent)
        }

    }
}