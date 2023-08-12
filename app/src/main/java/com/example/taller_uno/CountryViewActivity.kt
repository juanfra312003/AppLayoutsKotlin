package com.example.taller_uno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taller_uno.Model.Country
import com.example.taller_uno.databinding.ActivityCountryViewBinding
import com.example.taller_uno.databinding.ItemCountryBinding

class CountryViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCountryViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val country = intent.getSerializableExtra("country") as Country
        putValues(binding, country)
    }

    fun putValues(binding : ActivityCountryViewBinding, country : Country){
        binding.countryName.text = country.getNameCountry()
        binding.textNameInt.text = country.getName_intCountry()
        binding.capitalCity.text = country.getCapitalCountry()
        binding.acronym.text = country.getAcronymCountry()
        setImageItem(country.getNameCountry(), binding)
    }

    fun setImageItem(nameCountry : String, binding : ActivityCountryViewBinding){
        when (nameCountry){
            "Alemania" ->
                binding.imageCountry.setImageResource(R.drawable.alemania)
            "Argentina"->
                binding.imageCountry.setImageResource(R.drawable.argentina)
            "Australia"->
                binding.imageCountry.setImageResource(R.drawable.australia)
            "Austria"->
                binding.imageCountry.setImageResource(R.drawable.austria)
            "Bélgica"->
                binding.imageCountry.setImageResource(R.drawable.belgica)
            "Bolívia"->
                binding.imageCountry.setImageResource(R.drawable.bolivia)
            "Brasil"->
                binding.imageCountry.setImageResource(R.drawable.brasil)
            "Chile"->
                binding.imageCountry.setImageResource(R.drawable.chile)
            "Colombia"->
                binding.imageCountry.setImageResource(R.drawable.colombia)
            "Cuba"->
                binding.imageCountry.setImageResource(R.drawable.cuba)
            "Ecuador"->
                binding.imageCountry.setImageResource(R.drawable.ecuador)
            "España"->
                binding.imageCountry.setImageResource(R.drawable.espana)
            "Estados Unidos"->
                binding.imageCountry.setImageResource(R.drawable.estadosunidos)
            "Francia"->
                binding.imageCountry.setImageResource(R.drawable.francia)
            "Reino Unido"->
                binding.imageCountry.setImageResource(R.drawable.bandera)
            "Grecia"->
                binding.imageCountry.setImageResource(R.drawable.grecia)
            "Holanda"->
                binding.imageCountry.setImageResource(R.drawable.paisesbajos)
            "Hungria"->
                binding.imageCountry.setImageResource(R.drawable.hungria)
            "Irlanda"->
                binding.imageCountry.setImageResource(R.drawable.irlanda)
            "Islandia"->
                binding.imageCountry.setImageResource(R.drawable.islandia)
            "Israel"->
                binding.imageCountry.setImageResource(R.drawable.israel)
            "Italia"->
                binding.imageCountry.setImageResource(R.drawable.italia)
            "Japón"->
                binding.imageCountry.setImageResource(R.drawable.japon)
            "Uruguay"->
                binding.imageCountry.setImageResource(R.drawable.uruguay)
            "Venezuela"->
                binding.imageCountry.setImageResource(R.drawable.venezuela)
        }
    }
}

