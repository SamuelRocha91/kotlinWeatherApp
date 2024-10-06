# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="شعار مشاريع كوتلن" width="42" height="30" /> WeatherAPP <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="شعار مشاريع كوتلن" width="42" height="30" />

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="نسخة إنجليزية من التطبيق" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="نسخة إسبانية من التطبيق" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="نسخة روسية من التطبيق" style="width:32%; height: auto; margin:10px;" />
</div>

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)

<details>
  <summary><h2>📜 الوصف</h2></summary>

  **WeatherApp** هو تطبيق أندرويد بسيط يسمح للمستخدمين بالبحث في الوقت الفعلي عن معلومات الطقس في أي مدينة باستخدام **OpenWeather** API. من خلال واجهة مستخدم بديهية، يمكن للمستخدمين الاطلاع على درجة الحرارة الحالية، ودرجة الحرارة المحسوسة، والرطوبة، وآخر وقت تم تحديثه.

</details>

<details>
  <summary><h2>🌟 الميزات</h2></summary>

  - البحث في الوقت الفعلي عن الطقس في المدينة.
  - عرض درجة الحرارة الحالية (بالدرجات المئوية)، ودرجة الحرارة المحسوسة، والرطوبة، واسم المدينة.
  - واجهة بسيطة وسهلة الاستخدام.
  - رسائل Toast مخصصة للإشعارات والأخطاء.

</details>

<details>
  <summary><h2>🛠️ التقنيات المستخدمة</h2></summary>

  - **Kotlin**: لغة البرمجة الرئيسية لتطوير التطبيق.
  - **Coroutines**: تُستخدم للعمليات غير المتزامنة، مثل طلبات API للطقس.
  - **Retrofit**: مكتبة للتفاعل مع RESTful API.
  - **OpenWeather API**: API للحصول على معلومات الطقس.
  - **Material Design**: مكونات تصميم المواد من أندرويد، تقدم واجهة مستخدم مرئية جذابة.
  - **Toast مخصص**: لعرض رسائل الخطأ بشكل أكثر وضوحًا.

</details>

<details>
  <summary><h2>⚙️ إعداد المشروع</h2></summary>

  <details>
    <summary><h3>المتطلبات الأساسية</h3></summary>

    - Android Studio 4.1 أو إصدار أعلى.
    - Gradle 7.0 أو إصدار أعلى.
    - التسجيل للحصول على حساب على [OpenWeather API](https://openweathermap.org/api) للحصول على مفتاح API.

  </details>

  <details>
    <summary><h3>التثبيت</h3></summary>

    1. استنساخ المستودع:
       ```bash
       git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
       ```

    2. افتح المشروع في **Android Studio**.

    3. أضف مفتاح API الخاص بك إلى ملف `local.properties`:
       ```
       API_KEY=your_api_key_here
       ```

    4. قم ببناء المشروع وتشغيله على محاكي أو جهاز أندرويد.

  </details>

</details>

<details>
  <summary><h2>📂 هيكل الشيفرة</h2></summary>

  - **MainActivity.kt**: النشاط الرئيسي للتطبيق، يدير واجهة المستخدم ويتعامل مع تفاعلات المستخدم.
  - **OpenWeather.kt**: تعريف واجهة الاتصال مع API للطقس، باستخدام Retrofit.
  - **الأدوات**: وظائف مساعدة، مثل تحويل الطوابع الزمنية UNIX إلى تنسيق مقروء، يمكن استخراجها ووضعها في فئة أدوات.
  - **التخطيطات**: ملفات تخطيط XML المحددة في مجلد `res/layout`، بما في ذلك بنية واجهة المستخدم.

</details>

<details>
  <summary><h2>📦 التبعيات</h2></summary>

  - `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
  - `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
  - `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
  - `implementation "com.google.android.material:material:1.4.0"`

</details>

<details>
  <summary><h2>🧑‍🤝‍🧑 كيفية الاستخدام</h2></summary>

  1. افتح التطبيق.
  2. أدخل اسم المدينة في مربع البحث.
  3. انقر على زر "بحث".
  4. تحقق من معلومات الطقس، بما في ذلك:
      - درجة الحرارة الحالية.
      - درجة الحرارة المحسوسة.
      - الرطوبة.
      - اسم المدينة والدولة.

</details>

<details>
  <summary><h2>📁 مشاريع كوتلن أخرى:</h2></summary>

  - 📜 [قائمة الطعام الافتراضية](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)
  - 👤 [تسجيل الدخول الاجتماعي](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ar.md)
  - 💱 [سعر الصرف](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

</details>