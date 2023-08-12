package com.example.taller_uno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.taller_uno.databinding.ActivityListViewBinding
import com.example.taller_uno.Model.Country
import com.example.taller_uno.Model.CountryAdapter
import org.json.JSONObject

class ListViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityListViewBinding
    private val countries = mutableListOf<Country>()

    fun loadCountries() {
        val json_string = this.assets.open("paises.json").bufferedReader().use{
            it.readText()
        }
        var json = JSONObject(json_string);
        var paisesJsonArray = json.getJSONArray("paises");
        for (i in 0..paisesJsonArray.length()-1) {
            val jsonObject = paisesJsonArray.getJSONObject(i)
            val capital = jsonObject.getString("capital")
            val acronym = jsonObject.getString("sigla")
            val nameInt = jsonObject.getString("nombrepaisint")
            val name = jsonObject.getString("nombrepais")
            //Crear el objeto pais y agregarlo al arreglo
            val country = Country(name, nameInt,capital, acronym)
            countries.add(country)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadCountries()

        val adapter = CountryAdapter(this, countries)
        binding.listview.adapter = adapter

        binding.listview.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(baseContext, CountryViewActivity::class.java)
            intent.putExtra("country", countries[i])
            startActivity(intent)
        }
    }
}