package br.com.trybe.weatherapp.interfaces

import retrofit2.http.GET

interface OpenWeatherService {

    @GET
    fun getCurrentWeatherData()
}