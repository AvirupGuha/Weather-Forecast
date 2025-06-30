

---

## 🌤️ Weather Forecast App

A simple Java-based **weather forecast application** that fetches real-time weather data based on the user’s location. It uses the [OpenWeatherMap API](https://openweathermap.org/api) and includes location detection using IP-based services.

---

### 🚀 Features

* 🌍 Detects user's current location
* 🌦️ Displays real-time weather information (temperature, weather condition, etc.)
* 🔧 Built with modular Java classes
* 🧩 Uses external JSON parsing library (`org.json`)
* 📦 Clean and structured codebase

---

### 🖥️ Tech Stack

* **Language:** Java
* **IDE:** Visual Studio Code
* **APIs:** OpenWeatherMap, IP Geolocation API
* **Library:** `org.json` for parsing JSON responses

---

### 📁 Project Structure

```
Weather-Forecast/
│
├── LocationService.java     // Gets user location via IP API
├── WeatherService.java      // Fetches weather from OpenWeatherMap
├── WeatherApp.java          // Main entry point
├── lib/
│   └── json-20210307.jar    // External JSON library
├── README.md                // Project documentation
```

---

### ⚙️ How to Run

1. **Clone the repository**

```bash
git clone https://github.com/AvirupGuha/Weather-Forecast.git
cd Weather-Forecast
```

2. **Compile the code**

```bash
javac -cp ".;lib/json-20210307.jar" *.java
```

3. **Run the app**

```bash
java -cp ".;lib/json-20210307.jar" WeatherApp
```

> ✅ Make sure you have Java installed and internet connectivity to fetch live weather.

---

### 🔑 API Keys

To use the app, you need your own **OpenWeatherMap API Key**:

1. Create a free account at [openweathermap.org](https://openweathermap.org/api)
2. Get your API key.
3. Replace the placeholder in `WeatherService.java`:

```java
String apiKey = "your_api_key_here";
```

---

### 🌐 Sample Output

```
Location: Kolkata, IN
Temperature: 33.42°C
Weather: Broken Clouds
```

---

### 📌 To-Do (Improvements)

* Add GUI support with JavaFX or Swing
* Include weather forecast for upcoming days
* Handle more edge cases (e.g., no internet)

---

### 👨‍💻 Author

**Avirup Guha Biswas**
🔗 [GitHub Profile](https://github.com/AvirupGuha)

---



