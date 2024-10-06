Вот перевод вашего README на русский язык:

# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" /> WeatherAPP <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

<details>
  <summary><h2>📜 Описание</h2></summary>

  **WeatherApp** — это простое Android-приложение, позволяющее пользователю в реальном времени искать информацию о погоде в любом городе, используя API **OpenWeather**. С интуитивно понятным интерфейсом пользователь может видеть текущую температуру, ощущаемую температуру, влажность и время последнего обновления погоды.

</details>

<details>
  <summary><h2>🌟 Функции</h2></summary>

  - Поиск погоды в реальном времени по городу.
  - Отображение текущей температуры (в Цельсиях), ощущения, влажности и названия города.
  - Минималистичный и удобный интерфейс.
  - Персонализированный Toast для ошибок и сообщений.

</details>

<details>
  <summary><h2>🛠️ Используемые технологии</h2></summary>

  - **Kotlin**: основной язык, используемый для разработки приложения.
  - **Coroutines**: используется для асинхронных операций, таких как запросы к API погоды.
  - **Retrofit**: библиотека, используемая для работы с RESTful API.
  - **OpenWeather API**: API, используемое для получения метеорологической информации.
  - **Material Design**: компоненты дизайна Material от Android для визуально приятного интерфейса.
  - **Персонализированный Toast**: для отображения более заметных сообщений об ошибках.

</details>

<details>
  <summary><h2>⚙️ Настройка проекта</h2></summary>

  <details>
    <summary><h3>Предварительные требования</h3></summary>

    - Android Studio 4.1 или выше.
    - Gradle 7.0 или выше.
    - Учетная запись в [OpenWeather API](https://openweathermap.org/api) для получения API-ключа.

  </details>

  <details>
    <summary><h3>Установка</h3></summary>

    1. Клонируйте репозиторий:
       ```bash
       git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
       ```

    2. Откройте проект в **Android Studio**.

    3. Добавьте свой API-ключ OpenWeather в файл `local.properties`:
       ```
       API_KEY=your_api_key_here
       ```

    4. Соберите и запустите проект на эмуляторе или устройстве Android.

  </details>

</details>

<details>
  <summary><h2>📂 Структура кода</h2></summary>

  - **MainActivity.kt**: Главная активность приложения, управляющая интерфейсом и обрабатывающая взаимодействия пользователя.
  - **OpenWeather.kt**: Интерфейс, определяющий вызовы к API погоды с использованием Retrofit.
  - **Утилиты**: Утилитарные функции, такие как преобразование временной метки Unix в читаемый формат, могут быть извлечены и помещены в класс утилит.
  - **Макеты**: XML-файлы макетов, определенные в папке `res/layout`, которые включают структуру пользовательского интерфейса.

</details>

<details>
  <summary><h2>📦 Зависимости</h2></summary>

  - `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
  - `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
  - `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
  - `implementation "com.google.android.material:material:1.4.0"`

</details>

<details>
  <summary><h2>🧑‍🤝‍🧑 Как использовать</h2></summary>

  1. Откройте приложение.
  2. Введите название города в поле поиска.
  3. Нажмите кнопку «Поиск».
  4. Просмотрите информацию о погоде, включая:
      - Текущую температуру.
      - Ощущаемую температуру.
      - Влажность.
      - Название города и страны.

</details>

<details>
  <summary><h2>📁 Другие проекты на Kotlin:</h2></summary>

  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ar.md)
  - 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

</details>