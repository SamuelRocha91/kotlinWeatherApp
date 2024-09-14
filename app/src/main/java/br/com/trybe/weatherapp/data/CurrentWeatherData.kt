package br.com.trybe.weatherapp.data


data class CurrentWeatherData(
    val coord: CoordData,
    val weather: List<WeatherData>,
    val base: String,
    val main: MainData,
    val visibility: Long,
    val wind: WindData,
    val rain: RainData,
    val clouds: CloudData,
    val dt: Long,
    val sys: SysData,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long
)
