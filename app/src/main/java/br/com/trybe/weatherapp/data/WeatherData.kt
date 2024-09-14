package br.com.trybe.weatherapp.data

import android.util.Log

data class WeatherData (
    val id: Long,
    val main: String,
    val description: String,
    val icon: String,
)
