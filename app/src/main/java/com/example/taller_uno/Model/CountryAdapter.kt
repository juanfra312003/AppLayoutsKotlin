package com.example.taller_uno.Model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.taller_uno.R
import com.example.taller_uno.databinding.ItemCountryBinding


class CountryAdapter(private val mContext: Context, private val listCountries: List<Country>) :
    ArrayAdapter<Country>(mContext, 0, listCountries) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding = if (convertView == null) {
            val inflater = LayoutInflater.from(mContext)
            ItemCountryBinding.inflate(inflater, parent, false)
        } else {
            ItemCountryBinding.bind(convertView)
        }

        val country = listCountries[position]

        binding.name.text = country.getNameCountry()
        setImageItem(binding.name.text.toString(), binding)

        return binding.root
    }

    fun setImageItem(nameCountry : String, binding : ItemCountryBinding){
        when (nameCountry){
            "Alemania" ->
                binding.image.setImageResource(R.drawable.alemania)
            "Argentina"->
                binding.image.setImageResource(R.drawable.argentina)
            "Australia"->
                binding.image.setImageResource(R.drawable.australia)
            "Austria"->
                binding.image.setImageResource(R.drawable.austria)
            "Bélgica"->
                binding.image.setImageResource(R.drawable.belgica)
            "Bolívia"->
                binding.image.setImageResource(R.drawable.bolivia)
            "Brasil"->
                binding.image.setImageResource(R.drawable.brasil)
            "Chile"->
                binding.image.setImageResource(R.drawable.chile)
            "Colombia"->
                binding.image.setImageResource(R.drawable.colombia)
            "Cuba"->
                binding.image.setImageResource(R.drawable.cuba)
            "Ecuador"->
                binding.image.setImageResource(R.drawable.ecuador)
            "España"->
                binding.image.setImageResource(R.drawable.espana)
            "Estados Unidos"->
                binding.image.setImageResource(R.drawable.estadosunidos)
            "Francia"->
                binding.image.setImageResource(R.drawable.francia)
            "Reino Unido"->
                binding.image.setImageResource(R.drawable.bandera)
            "Grecia"->
                binding.image.setImageResource(R.drawable.grecia)
            "Holanda"->
                binding.image.setImageResource(R.drawable.paisesbajos)
            "Hungria"->
                binding.image.setImageResource(R.drawable.hungria)
            "Irlanda"->
                binding.image.setImageResource(R.drawable.irlanda)
            "Islandia"->
                binding.image.setImageResource(R.drawable.islandia)
            "Israel"->
                binding.image.setImageResource(R.drawable.israel)
            "Italia"->
                binding.image.setImageResource(R.drawable.italia)
            "Japón"->
                binding.image.setImageResource(R.drawable.japon)
            "Uruguay"->
                binding.image.setImageResource(R.drawable.uruguay)
            "Venezuela"->
                binding.image.setImageResource(R.drawable.venezuela)
        }
    }
}