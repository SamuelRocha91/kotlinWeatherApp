package br.com.trybe.weatherapp.interfaces

import br.com.trybe.weatherapp.data.CurrentWeatherData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherService {

    @GET("weather")
    suspend fun getCurrentWeatherData(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric"
    ): Response<CurrentWeatherData>
}
