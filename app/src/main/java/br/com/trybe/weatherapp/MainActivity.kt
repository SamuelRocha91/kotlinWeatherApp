package br.com.trybe.weatherapp
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.trybe.weatherapp.data.CurrentWeatherData
import br.com.trybe.weatherapp.interfaces.api.OpenWeather
import br.com.trybe.weatherapp.utils.DateUtils
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    private val searchBtn: Button by lazy { findViewById(R.id.search_btn) }
    val text: TextInputEditText by lazy { findViewById(R.id.input_city) }
    val temp: TextView by lazy { findViewById(R.id.main_temp) }
    val dateText: TextView by lazy { findViewById(R.id.main_date_dt) }
    val cityText: TextView by lazy { findViewById(R.id.main_country_name) }
    val umidityText: TextView by lazy { findViewById(R.id.main_umidity) }
    val fellText: TextView by lazy { findViewById(R.id.main_feels_live) }
    private val apiService = OpenWeather.instance

    val apiKey = BuildConfig.API_KEY

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        searchBtn.setOnClickListener {
            val city = text.text.toString()
            searchWeather(city)
        }
    }

        @RequiresApi(Build.VERSION_CODES.O)
        private fun searchWeather(city: String) {
            CoroutineScope(Dispatchers.IO).launch {
                val weatherData = apiService.getCurrentWeatherData(city, apiKey).body()
                withContext(Dispatchers.Main) {
                    weatherData?.let {
                        updateUI(it)
                    } ?: run {
                        showError(getString(R.string.error_message))
                    }
                }
            }
        }


        @SuppressLint("SetTextI18n")
        @RequiresApi(Build.VERSION_CODES.O)
        private fun updateUI(dataWeather: CurrentWeatherData) {
            val drawableIcon = ContextCompat.getDrawable(baseContext, R.drawable.cloud)
            val sunIcon = ContextCompat.getDrawable(baseContext, R.drawable.sun)
            val windIcon = ContextCompat.getDrawable(baseContext, R.drawable.wind)

            temp.text = "${dataWeather.main.temp}° C"
            temp.setCompoundDrawablesWithIntrinsicBounds(drawableIcon, null, null, null)
            temp.compoundDrawablePadding = 8

            dateText.text = DateUtils.convertUnixTimestamp(dataWeather.dt)

            cityText.text = "${dataWeather.name}, ${dataWeather.sys.country}"

            umidityText.text = "${getString(R.string.humidity)}: ${dataWeather.main.humidity}%"
            umidityText.setCompoundDrawablesWithIntrinsicBounds(windIcon, null, null, null)
            umidityText.compoundDrawablePadding = 8

            fellText.text = "${getString(R.string.feels_like)}: ${dataWeather.main.feelsLike}° C"
            fellText.setCompoundDrawablesWithIntrinsicBounds(sunIcon, null, null, null)
            fellText.compoundDrawablePadding = 8
      }

      private fun showError(message: String) {
          Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
      }
    }
