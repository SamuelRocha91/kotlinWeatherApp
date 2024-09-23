# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> WeatherApp <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>


## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

## Описание

**WeatherApp** — это простое Android-приложение, которое позволяет пользователю в реальном времени получать информацию о погоде в любом городе, используя API **OpenWeather**. С дружелюбным интерфейсом, пользователь может увидеть текущую температуру, ощущаемую температуру, влажность и время последнего обновления данных о погоде.

## Функционал

- Поиск информации о погоде в реальном времени по названию города.
- Отображение текущей температуры (в градусах Цельсия), ощущаемой температуры, влажности и названия города.
- Минималистичный и удобный интерфейс.
- Индивидуальные уведомления (Toast) для ошибок и сообщений.

## Используемые технологии

- **Kotlin**: Основной язык, используемый для разработки приложения.
- **Coroutines**: Используется для выполнения асинхронных операций, таких как запросы к API погоды.
- **Retrofit**: Библиотека, используемая для работы с RESTful API.
- **OpenWeather API**: API, которое используется для получения информации о погоде.
- **Material Design**: Компоненты Material Design от Android для визуально приятного интерфейса.
- **Индивидуальные уведомления (Toast)**: Для отображения более заметных сообщений об ошибках.

## Настройка проекта

### Предварительные требования

- Android Studio 4.1 или новее.
- Gradle 7.0 или новее.
- Учетная запись в [OpenWeather API](https://openweathermap.org/api) для получения API-ключа.

### Установка

1. Клонируйте репозиторий:

   ```bash
   git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
   ```

2. Откройте проект в **Android Studio**.

3. Добавьте ваш API-ключ от OpenWeather в файл `local.properties`:

   ```
   API_KEY=ваш_api_ключ
   ```

4. Скомпилируйте и запустите проект на вашем эмуляторе или Android-устройстве.

### Структура кода

- **MainActivity.kt**: Основная активность приложения, которая управляет интерфейсом и взаимодействием с пользователем.
- **OpenWeather.kt**: Интерфейс, определяющий запросы к API погоды с использованием Retrofit.
- **Утилиты**: Полезные функции, такие как преобразование временной метки Unix в читаемый формат, могут быть вынесены в утилитарный класс.
- **Макеты**: XML-файлы макетов, находящиеся в папке `res/layout`, включают структуру пользовательского интерфейса.

### Зависимости

- `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
- `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
- `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
- `implementation "com.google.android.material:material:1.4.0"`

## Как использовать

1. Откройте приложение.
2. Введите название города в строку поиска.
3. Нажмите кнопку "Поиск".
4. Посмотрите информацию о погоде, включая:
    - Текущую температуру.
    - Ощущаемую температуру.
    - Влажность.
    - Название города и страны.

## Будущие улучшения

- Добавить поддержку нескольких единиц измерения (Цельсий, Фаренгейт).
- Реализовать прогноз погоды на несколько дней вперед.
- Добавить больше иконок для различных погодных условий (облачно, дождливо и т.д.).
- Поддержка работы в оффлайн-режиме с кешированием последних запросов.

## Другие проекты

- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ru.md)
