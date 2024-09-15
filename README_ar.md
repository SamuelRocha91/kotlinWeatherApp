# تطبيق الطقس (WeatherApp)

![WeatherApp](./app/src/main/weather.gif)

<div style="display: flex; justify-content: space-around;">
  <img src="./app/src/main/res/drawable/english.png" alt="english version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/spanish.png" alt="spanish version app" style="width:32%; height: auto; margin:10px;" />
  <img src="./app/src/main/res/drawable/ru.png" alt="russian version app" style="width:32%; height: auto; margin:10px;" />
</div>

<h2>🌐</h2>
<ul>
  <li><a href="https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README.md" target="_blank">Português</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_sp.md" target="_blank">Español</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md" target="_blank">English</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md" target="_blank">Русский</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md" target="_blank">中文</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md" target="_blank">العربية</a></li>
</ul>

## الوصف

**WeatherApp** هو تطبيق أندرويد بسيط يسمح للمستخدم بالبحث عن معلومات الطقس في أي مدينة في الوقت الفعلي باستخدام واجهة برمجة التطبيقات **OpenWeather**. من خلال واجهة سهلة الاستخدام، يمكن للمستخدم رؤية درجة الحرارة الحالية، والحرارة المحسوسة، والرطوبة، ووقت آخر تحديث للطقس.

## الميزات

- البحث عن حالة الطقس في الوقت الفعلي حسب المدينة.
- عرض درجة الحرارة الحالية (بالسيلسيوس)، الحرارة المحسوسة، الرطوبة، واسم المدينة.
- واجهة بسيطة وسهلة الاستخدام.
- رسائل خطأ وتنبيهات مخصصة (Toast) للأخطاء والرسائل.

## التقنيات المستخدمة

- **Kotlin**: اللغة الرئيسية المستخدمة في تطوير التطبيق.
- **Coroutines**: تستخدم لتنفيذ العمليات غير المتزامنة مثل طلبات API للطقس.
- **Retrofit**: مكتبة تستخدم لاستهلاك API الخاصة بالطقس.
- **OpenWeather API**: واجهة برمجة التطبيقات المستخدمة للحصول على معلومات الطقس.
- **Material Design**: مكونات تصميم الماتريال من أندرويد لواجهة مستخدم جذابة.
- **Toast مخصص**: لعرض رسائل خطأ أكثر وضوحاً.

## إعداد المشروع

### المتطلبات المسبقة

- Android Studio 4.1 أو أعلى.
- Gradle 7.0 أو أعلى.
- حساب في [OpenWeather API](https://openweathermap.org/api) للحصول على مفتاح API.

### التثبيت

1. استنساخ المستودع:

   ```bash
   git clone git@github.com:SamuelRocha91/kotlinWeatherApp.git
   ```

2. افتح المشروع في **Android Studio**.

3. أضف مفتاح API الخاص بك من OpenWeather إلى ملف `local.properties`:

   ```
   API_KEY=your_api_key_here
   ```

4. قم بتجميع وتشغيل المشروع على جهازك الأندرويد أو المحاكي.

### هيكلية الكود

- **MainActivity.kt**: النشاط الرئيسي للتطبيق الذي يدير الواجهة ويتعامل مع تفاعلات المستخدم.
- **OpenWeather.kt**: الواجهة التي تحدد طلبات API للطقس باستخدام Retrofit.
- **الأدوات**: يمكن استخراج وظائف مساعدة، مثل تحويل الطابع الزمني Unix إلى تنسيق قابل للقراءة، ووضعها في فئة الأدوات المساعدة.
- **التخطيطات**: ملفات تخطيط XML محددة في مجلد `res/layout`، والتي تشمل هيكلية واجهة المستخدم.

### التبعيات

- `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"`
- `implementation "com.squareup.retrofit2:retrofit:2.9.0"`
- `implementation "com.squareup.retrofit2:converter-gson:2.9.0"`
- `implementation "com.google.android.material:material:1.4.0"`

## كيفية الاستخدام

1. افتح التطبيق.
2. أدخل اسم المدينة في حقل البحث.
3. اضغط على زر "بحث".
4. شاهد معلومات الطقس، بما في ذلك:
    - درجة الحرارة الحالية.
    - الحرارة المحسوسة.
    - الرطوبة.
    - اسم المدينة والبلد.

## التحسينات المستقبلية

- إضافة دعم للوحدات المتعددة (درجة مئوية، فهرنهايت).
- تنفيذ توقعات الطقس للأيام القادمة.
- إضافة المزيد من الأيقونات للظروف الجوية المختلفة (غائم، ممطر، إلخ).
- دعم العمل دون اتصال بالإنترنت مع تخزين مؤقت لآخر الاستعلامات.

---