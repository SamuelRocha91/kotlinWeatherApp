package br.com.trybe.weatherapp.data

import com.google.gson.annotations.SerializedName

data class MainData(
    val temp: Double,
    @SerializedName("feels_like")
    val feelsLike: Double,
    @SerializedName("temp_Min")
    val tempMin: Double,
    @SerializedName("temp_Max")
    val tempMax: Double,
    val pressure: Long,
    val humidity: Long,
    @SerializedName("sea_level")
    val seaLevel: Long,
    @SerializedName("grnd_level")
    val grndLevel: Long
)
