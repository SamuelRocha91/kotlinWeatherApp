# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> 天气应用 (WeatherApp) <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

## 描述

**WeatherApp** 是一个简单的 Android 应用程序，允许用户通过 **OpenWeather** API 实时查询任何城市的天气信息。用户界面友好，用户可以查看当前温度、体感温度、湿度以及天气的最新更新时间。

## 功能

- 通过城市名称实时查询天气。
- 显示当前温度（摄氏度）、体感温度、湿度和城市名称。
- 界面简洁友好。
- 自定义 Toast 错误和消息提示。

## 使用技术

- **Kotlin**: 应用程序开发中使用的主要编程语言。
- **Coroutines**: 用于处理异步操作，如天气 API 请求。
- **Retrofit**: 用于调用 RESTful API 的库。
- **OpenWeather API**: 获取天气信息的 API。
- **Material Design**: Android 材料设计组件，提供视觉上吸引人的用户界面。
- **自定义 Toast**: 显示更显眼的错误消息。

## 项目配置

### 先决条件

- Android Studio 4.1 或更高版本。
- Gradle 7.0 或更高版本。
- [OpenWeather API](https://openweathermap.org/api) 账户，用于获取 API 密钥。

### 安装

1. 克隆仓库：

   ```bash
   git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
   ```

2. 在 **Android Studio** 中打开项目。

3. 在 `local.properties` 文件中添加你的 OpenWeather API 密钥：

   ```
   API_KEY=your_api_key_here
   ```

4. 在 Android 模拟器或设备上编译并运行项目。

### 代码结构

- **MainActivity.kt**: 管理界面并处理用户交互的主活动文件。
- **OpenWeather.kt**: 使用 Retrofit 定义天气 API 调用的接口。
- **工具类**: 可以将诸如将 Unix 时间戳转换为可读格式等实用功能提取到工具类中。
- **布局文件**: 在 `res/layout` 文件夹中定义的 XML 布局文件，包括用户界面的结构。

### 依赖项

- `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
- `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
- `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
- `implementation "com.google.android.material:material:1.4.0"`

## 使用说明

1. 打开应用程序。
2. 在搜索框中输入城市名称。
3. 点击“搜索”按钮。
4. 查看天气信息，包括：
    - 当前温度。
    - 体感温度。
    - 湿度。
    - 城市和国家名称。

## 未来改进

- 增加对多种温度单位的支持（摄氏度、华氏度）。
- 实现未来几天的天气预报功能。
- 添加更多天气条件图标（多云、雨天等）。
- 支持离线模式并缓存最近的查询结果。

## 其他项目

- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ch.md)
