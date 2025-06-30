// WeatherService.java
import org.json.JSONObject;
import java.net.*;
import java.io.*;

public class WeatherService {
    private static final String API_KEY = "0b68437d327b6adca1fd135595682c7f"; // Replace with your key

    public static String getWeather(String city) {
        try {
            String urlStr = "https://api.openweathermap.org/data/2.5/weather?q=" 
                + URLEncoder.encode(city, "UTF-8") + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlStr);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String response = reader.readLine();
            JSONObject json = new JSONObject(response);
            JSONObject main = json.getJSONObject("main");
            JSONObject weather = json.getJSONArray("weather").getJSONObject(0);

            return "City: " + json.getString("name") + "\n"
                 + "Temp: " + main.getDouble("temp") + " °C\n"
                 + "Humidity: " + main.getInt("humidity") + "%\n"
                 + "Description: " + weather.getString("description");

        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching weather data.";
        }
    }
}

