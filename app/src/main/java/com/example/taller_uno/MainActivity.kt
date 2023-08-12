package com.example.taller_uno

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taller_uno.databinding.ActivityMainBinding
import com.example.taller_uno.databinding.ActivityTicTacToeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    fun buttonTicTacToeAction(){
        var intent = Intent (baseContext, TicTacToeActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTicTacToe.setOnClickListener{buttonTicTacToeAction()}
    }
}