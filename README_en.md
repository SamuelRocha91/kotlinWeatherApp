
# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> WeatherApp <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

## Description

The **WeatherApp** is a simple Android application that allows users to search for real-time weather information for any city using the **OpenWeather API**. With a user-friendly interface, users can view the current temperature, feels-like temperature, humidity, and the time of the last weather update.

## Features

- Real-time weather search by city.
- Displays current temperature (in Celsius), feels-like temperature, humidity, and city name.
- Minimalistic and user-friendly interface.
- Custom toast messages for errors and notifications.

## Technologies Used

- **Kotlin**: Main language used for app development.
- **Coroutines**: Used for asynchronous operations like weather API requests.
- **Retrofit**: Library used for consuming RESTful APIs.
- **OpenWeather API**: API used to fetch weather information.
- **Material Design**: Android Material Design components for a visually appealing interface.
- **Custom Toast**: Used for displaying more engaging error messages.

## Project Setup

### Prerequisites

- Android Studio 4.1 or later.
- Gradle 7.0 or later.
- An account with [OpenWeather API](https://openweathermap.org/api) to obtain an API key.

### Installation

1. Clone the repository:

   ```bash
   git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
   ```

2. Open the project in **Android Studio**.

3. Add your OpenWeather API key to the `local.properties` file:

   ```
   API_KEY=your_api_key_here
   ```

4. Build and run the project on your emulator or Android device.

### Code Structure

- **MainActivity.kt**: The main activity of the application that manages the interface and handles user interactions.
- **OpenWeather.kt**: Interface that defines the API calls to fetch weather data using Retrofit.
- **Utilities**: Utility functions, such as converting Unix timestamps to a readable format, can be extracted into a utilities class.
- **Layouts**: XML layout files are defined in the `res/layout` folder, which include the structure of the user interface.

### Dependencies

- `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
- `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
- `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
- `implementation "com.google.android.material:material:1.4.0"`

## How to Use

1. Open the app.
2. Enter the name of a city in the search field.
3. Click the "Search" button.
4. View weather information including:
    - Current temperature.
    - Feels-like temperature.
    - Humidity.
    - City and country name.

## Future Improvements

- Add support for multiple measurement units (Celsius, Fahrenheit).
- Implement weather forecasts for upcoming days.
- Add more icons for different weather conditions (cloudy, rainy, etc.).
- Offline support with cached results for the latest searches.

## Other Projects

- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_en.md)
- 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md)
