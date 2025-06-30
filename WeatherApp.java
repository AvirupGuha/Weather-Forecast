// WeatherApp.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WeatherApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Weather Forecast");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel locationLabel = new JLabel("Detecting location...");
        JTextArea weatherArea = new JTextArea();
        weatherArea.setEditable(false);
        JButton refreshBtn = new JButton("Refresh");

        frame.setLayout(new BorderLayout());
        frame.add(locationLabel, BorderLayout.NORTH);
        frame.add(new JScrollPane(weatherArea), BorderLayout.CENTER);
        frame.add(refreshBtn, BorderLayout.SOUTH);

        frame.setVisible(true);

        new Thread(() -> {
            String city = LocationService.getCityByIP();
            locationLabel.setText("Location: " + city);
            String weather = WeatherService.getWeather(city);
            weatherArea.setText(weather);
        }).start();

        refreshBtn.addActionListener(e -> {
            String city = locationLabel.getText().replace("Location: ", "");
            String weather = WeatherService.getWeather(city);
            weatherArea.setText(weather);
        });
    }
}
