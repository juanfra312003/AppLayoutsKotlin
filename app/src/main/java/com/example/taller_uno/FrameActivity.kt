package com.example.taller_uno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taller_uno.databinding.ActivityFrameBinding

class FrameActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFrameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameBinding.inflate(layoutInflater)
        val greeting = intent.getStringExtra("greeting")
        binding.greetingText.text = greeting
        setContentView(binding.root)
    }
}