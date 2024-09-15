package br.com.trybe.weatherapp.data

data class SysData(
    val type: Int,
    val id: Long,
    val country: String,
    val sunrise: Long,
    val sunset: Long
)
