package br.com.trybe.weatherapp.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

object DateUtils {
    @RequiresApi(Build.VERSION_CODES.O)
    fun convertUnixTimestamp(unixTimestamp: Long): String {
        val instant = Instant.ofEpochSecond(unixTimestamp)
        val zoneId = ZoneId.systemDefault()
        val formatter = DateTimeFormatter.ofPattern("MMM dd, hh:mm a")
        return instant.atZone(zoneId).format(formatter)
    }
}
