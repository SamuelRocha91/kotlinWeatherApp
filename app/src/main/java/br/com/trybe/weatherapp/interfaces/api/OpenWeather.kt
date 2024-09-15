package br.com.trybe.weatherapp.interfaces.api

import br.com.trybe.weatherapp.interfaces.OpenWeatherService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OpenWeather {
    val instance: OpenWeatherService by lazy {
        val retrofit = Retrofit
            .Builder().baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create()).build();
        retrofit.create(OpenWeatherService::class.java)
    }
}