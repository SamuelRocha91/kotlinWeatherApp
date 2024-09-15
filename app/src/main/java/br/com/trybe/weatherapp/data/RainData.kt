package br.com.trybe.weatherapp.data

import com.google.gson.annotations.SerializedName

data class RainData(
    @SerializedName("1h")
    val oneHour: Double
)
