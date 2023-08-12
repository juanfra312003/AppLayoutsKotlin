package com.example.taller_uno.Model

class Country(
    var name: String,
    var name_int: String,
    var capital: String,
    var acronym: String
) {
    // Getter y Setter para 'name'
    fun getNameCountry(): String {
        return name
    }
    fun setNameCountry(newName: String) {
        name = newName
    }

    // Getter y Setter para 'name_int'
    fun getName_intCountry(): String {
        return name_int
    }
    fun setName_intCountry(newName_int: String) {
        name_int = newName_int
    }

    // Getter y Setter para 'capital'
    fun getCapitalCountry(): String {
        return capital
    }
    fun setCapitalCountry(newCapital: String) {
        capital = newCapital
    }

    // Getter y Setter para 'acronym'
    fun getAcronymCountry(): String {
        return acronym
    }
    fun setAcronymCountry(newAcronym: String) {
        acronym = newAcronym
    }
}