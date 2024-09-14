package br.com.trybe.weatherapp.interfaces.api

import br.com.trybe.weatherapp.data.CurrentWeatherData
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherService {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric"
    ): retrofit2.Call<CurrentWeatherData>
}
