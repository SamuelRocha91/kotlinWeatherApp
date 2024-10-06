# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  WeatherAPP <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

<details>
  <summary><h2>📜 Descrição</h2></summary>

  O **WeatherApp** é uma aplicação Android simples que permite ao usuário buscar informações sobre o clima de qualquer cidade em tempo real, usando a API do **OpenWeather**. Com uma interface amigável, o usuário pode ver a temperatura atual, sensação térmica, umidade e o horário da última atualização do clima.

</details>

<details>
  <summary><h2>🌟 Funcionalidades</h2></summary>

  - Busca de clima em tempo real por cidade.
  - Exibe a temperatura atual (em Celsius), sensação térmica, umidade e nome da cidade.
  - Interface minimalista e amigável.
  - Toast customizado para erros e mensagens.

</details>

<details>
  <summary><h2>🛠️ Tecnologias Utilizadas</h2></summary>

  - **Kotlin**: Linguagem principal usada no desenvolvimento do app.
  - **Coroutines**: Utilizado para operações assíncronas como requisições à API de clima.
  - **Retrofit**: Biblioteca usada para consumo de APIs RESTful.
  - **OpenWeather API**: API usada para obter as informações meteorológicas.
  - **Material Design**: Componentes do Android Material Design para uma interface visualmente agradável.
  - **Toast customizado**: Para exibir mensagens de erro mais chamativas.

</details>

<details>
  <summary><h2>⚙️ Configuração do Projeto</h2></summary>

  <details>
    <summary><h3>Pré-requisitos</h3></summary>

    - Android Studio 4.1 ou superior.
    - Gradle 7.0 ou superior.
    - Conta no [OpenWeather API](https://openweathermap.org/api) para obter uma chave de API.

  </details>

  <details>
    <summary><h3>Instalação</h3></summary>

    1. Clone o repositório:
       ```bash
       git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
       ```

    2. Abra o projeto no **Android Studio**.

    3. Adicione sua chave da API do OpenWeather no arquivo `local.properties`:
       ```
       API_KEY=your_api_key_here
       ```

    4. Compile e rode o projeto no seu emulador ou dispositivo Android.

  </details>

</details>

<details>
  <summary><h2>📂 Estrutura do Código</h2></summary>

  - **MainActivity.kt**: Principal atividade da aplicação que gerencia a interface e lida com as interações do usuário.
  - **OpenWeather.kt**: Interface que define as chamadas à API de clima usando Retrofit.
  - **Utilidades**: Funções utilitárias, como a conversão de timestamp Unix para formato legível, podem ser extraídas e colocadas em uma classe de utilidades.
  - **Layouts**: Arquivos de layout XML definidos na pasta `res/layout`, que incluem a estrutura da interface do usuário.

</details>

<details>
  <summary><h2>📦 Dependências</h2></summary>

  - `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
  - `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
  - `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
  - `implementation "com.google.android.material:material:1.4.0"`

</details>

<details>
  <summary><h2>🧑‍🤝‍🧑 Como Usar</h2></summary>

  1. Abra o app.
  2. Insira o nome de uma cidade no campo de busca.
  3. Clique no botão "Buscar".
  4. Veja as informações sobre o clima, incluindo:
      - Temperatura atual.
      - Sensação térmica.
      - Umidade.
      - Nome da cidade e país.

</details>


<details>
  <summary><h2>📁 Outros projetos Kotlin:</h2></summary>

  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial)
  - 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate)

</details>
