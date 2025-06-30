// LocationService.java
import org.json.JSONObject;
import java.net.*;
import java.io.*;

public class LocationService {
    public static String getCityByIP() {
        try {
            URL url = new URL("http://ip-api.com/json/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String response = reader.readLine();
            JSONObject json = new JSONObject(response);
            return json.getString("city");
        } catch (Exception e) {
            e.printStackTrace();
            return "Kolkata"; // default
        }
    }
}

