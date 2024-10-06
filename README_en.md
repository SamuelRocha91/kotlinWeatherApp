# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" /> WeatherAPP <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

<details>
  <summary><h2>📜 Description</h2></summary>

  The **WeatherApp** is a simple Android application that allows users to search for real-time weather information for any city using the **OpenWeather** API. With a user-friendly interface, users can view the current temperature, feels-like temperature, humidity, and the time of the last weather update.

</details>

<details>
  <summary><h2>🌟 Features</h2></summary>

  - Real-time weather search by city.
  - Displays the current temperature (in Celsius), feels-like temperature, humidity, and city name.
  - Minimalistic and user-friendly interface.
  - Customized toast for errors and messages.

</details>

<details>
  <summary><h2>🛠️ Technologies Used</h2></summary>

  - **Kotlin**: Main language used for app development.
  - **Coroutines**: Used for asynchronous operations like requests to the weather API.
  - **Retrofit**: Library used for consuming RESTful APIs.
  - **OpenWeather API**: API used to obtain weather information.
  - **Material Design**: Android Material Design components for a visually appealing interface.
  - **Customized Toast**: To display more striking error messages.

</details>

<details>
  <summary><h2>⚙️ Project Setup</h2></summary>

  <details>
    <summary><h3>Prerequisites</h3></summary>

    - Android Studio 4.1 or higher.
    - Gradle 7.0 or higher.
    - An account on [OpenWeather API](https://openweathermap.org/api) to obtain an API key.

  </details>

  <details>
    <summary><h3>Installation</h3></summary>

    1. Clone the repository:
       ```bash
       git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
       ```

    2. Open the project in **Android Studio**.

    3. Add your OpenWeather API key in the `local.properties` file:
       ```
       API_KEY=your_api_key_here
       ```

    4. Build and run the project on your emulator or Android device.

  </details>

</details>

<details>
  <summary><h2>📂 Code Structure</h2></summary>

  - **MainActivity.kt**: Main activity of the application that manages the interface and handles user interactions.
  - **OpenWeather.kt**: Interface that defines the calls to the weather API using Retrofit.
  - **Utilities**: Utility functions, such as converting Unix timestamp to a readable format, can be extracted and placed in a utility class.
  - **Layouts**: XML layout files defined in the `res/layout` folder, which include the structure of the user interface.

</details>

<details>
  <summary><h2>📦 Dependencies</h2></summary>

  - `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
  - `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
  - `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
  - `implementation "com.google.android.material:material:1.4.0"`

</details>

<details>
  <summary><h2>🧑‍🤝‍🧑 How to Use</h2></summary>

  1. Open the app.
  2. Enter the name of a city in the search field.
  3. Click the "Search" button.
  4. View the weather information, including:
      - Current temperature.
      - Feels-like temperature.
      - Humidity.
      - City and country name.

</details>

<details>
  <summary><h2>📁 Other Kotlin Projects:</h2></summary>

  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_en.md)
  - 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md)

</details>
