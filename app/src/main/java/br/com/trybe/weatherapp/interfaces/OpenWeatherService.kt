package br.com.trybe.weatherapp.interfaces

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherService {

    //https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
    @GET("weather")
    fun getCurrentWeatherData(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric"
    ): Call<CurrentWeatherData>
}