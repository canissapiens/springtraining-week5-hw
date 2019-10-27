package pl.mirek.ksb2.week5hw.model.forecast;


import org.springframework.stereotype.Component;
import pl.mirek.ksb2.week5hw.dto.PositionDto;

import java.util.HashMap;
import java.util.Map;

@Component
public class WeatherIcons {
    private Map<String, String> weatherIcons;

//  , , , , partly-cloudy-day, .

    public WeatherIcons() {
        weatherIcons = new HashMap<>();
        weatherIcons.put("clear-day", "wi-day-sunny");
        weatherIcons.put("clear-night", "wi-night-clear");
        weatherIcons.put("rain", "wi-rain");
        weatherIcons.put("snow", "wi-snow");
        weatherIcons.put("sleet", "wi-sleet");
        weatherIcons.put("wind", "wi-windy");
        weatherIcons.put("cloudy", "wi-cloudy");
        weatherIcons.put("partly-cloudy-day", "wi-day-cloudy");
        weatherIcons.put("partly-cloudy-night", "wi-night-partly-cloudy");
        weatherIcons.put("fog", "wi-fog");
    }

    public String getWeatherIcon(String icon) {
        return weatherIcons.get(icon);
    }
}
