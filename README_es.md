# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  WeatherAPP <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

<details>
  <summary><h2>📜 Descripción</h2></summary>

  El **WeatherApp** es una aplicación Android sencilla que permite al usuario buscar información sobre el clima de cualquier ciudad en tiempo real, utilizando la API de **OpenWeather**. Con una interfaz amigable, el usuario puede ver la temperatura actual, la sensación térmica, la humedad y la hora de la última actualización del clima.

</details>

<details>
  <summary><h2>🌟 Funcionalidades</h2></summary>

  - Búsqueda del clima en tiempo real por ciudad.
  - Muestra la temperatura actual (en Celsius), la sensación térmica, la humedad y el nombre de la ciudad.
  - Interfaz minimalista y amigable.
  - Toast personalizado para errores y mensajes.

</details>

<details>
  <summary><h2>🛠️ Tecnologías Utilizadas</h2></summary>

  - **Kotlin**: Lenguaje principal utilizado en el desarrollo de la aplicación.
  - **Coroutines**: Utilizado para operaciones asíncronas como solicitudes a la API del clima.
  - **Retrofit**: Biblioteca utilizada para consumir APIs RESTful.
  - **OpenWeather API**: API utilizada para obtener la información meteorológica.
  - **Material Design**: Componentes del diseño material de Android para una interfaz visualmente agradable.
  - **Toast personalizado**: Para mostrar mensajes de error más llamativos.

</details>

<details>
  <summary><h2>⚙️ Configuración del Proyecto</h2></summary>

  <details>
    <summary><h3>Requisitos previos</h3></summary>

    - Android Studio 4.1 o superior.
    - Gradle 7.0 o superior.
    - Cuenta en [OpenWeather API](https://openweathermap.org/api) para obtener una clave de API.

  </details>

  <details>
    <summary><h3>Instalación</h3></summary>

    1. Clona el repositorio:
       ```bash
       git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
       ```

    2. Abre el proyecto en **Android Studio**.

    3. Agrega tu clave de API de OpenWeather en el archivo `local.properties`:
       ```
       API_KEY=your_api_key_here
       ```

    4. Compila y ejecuta el proyecto en tu emulador o dispositivo Android.

  </details>

</details>

<details>
  <summary><h2>📂 Estructura del Código</h2></summary>

  - **MainActivity.kt**: Actividad principal de la aplicación que gestiona la interfaz y maneja las interacciones del usuario.
  - **OpenWeather.kt**: Interfaz que define las llamadas a la API del clima utilizando Retrofit.
  - **Utilidades**: Funciones utilitarias, como la conversión de timestamp Unix a un formato legible, pueden ser extraídas y colocadas en una clase de utilidades.
  - **Layouts**: Archivos de diseño XML definidos en la carpeta `res/layout`, que incluyen la estructura de la interfaz de usuario.

</details>

<details>
  <summary><h2>📦 Dependencias</h2></summary>

  - `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
  - `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
  - `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
  - `implementation "com.google.android.material:material:1.4.0"`

</details>

<details>
  <summary><h2>🧑‍🤝‍🧑 Cómo Usar</h2></summary>

  1. Abre la aplicación.
  2. Ingresa el nombre de una ciudad en el campo de búsqueda.
  3. Haz clic en el botón "Buscar".
  4. Ve la información sobre el clima, incluyendo:
      - Temperatura actual.
      - Sensación térmica.
      - Humedad.
      - Nombre de la ciudad y país.

</details>

<details>
  <summary><h2>📁 Otros proyectos de Kotlin:</h2></summary>

  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_es.md)
  - 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md)

</details>