package pl.mirek.ksb2.week5hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mirek.ksb2.week5hw.component.Utilities;
import pl.mirek.ksb2.week5hw.dto.ForecastDto;
import pl.mirek.ksb2.week5hw.dto.NewPlaceDto;
import pl.mirek.ksb2.week5hw.dto.PositionDto;
import pl.mirek.ksb2.week5hw.model.forecast.Forecast;
import pl.mirek.ksb2.week5hw.model.forecast.WeatherIcons;
import pl.mirek.ksb2.week5hw.model.localization.Result;

import static pl.mirek.ksb2.week5hw.dto.ForecastDto.ForecastBuilder;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/weather")
public class GuiController {

    GetFromApiController getFromApiController;
    Utilities utilities;
    WeatherIcons weatherIcons;

    @Autowired
    public GuiController(GetFromApiController getController, Utilities utilities, WeatherIcons weatherIcons) {
        this.getFromApiController = getController;
        this.utilities = utilities;
        this.weatherIcons = weatherIcons;
    }

    @GetMapping()
    public String getWeather(Model model) {
        model.addAttribute("getLocation", new NewPlaceDto(""));
        model.addAttribute("welcome", "Podaj lokalizację");
        model.addAttribute("warning", "");
        return "index";
    }

    @GetMapping("/reload")
    public String goToTop() {
        return "redirect:";
    }

    @GetMapping("/forlocation")
    public String getForecast(@RequestParam String newPlace, Model model) {

        System.out.println("weatherforecast --> " + newPlace);
        List<Result> results = getFromApiController.getGeoposition(newPlace.replaceAll(", ", " "));
        System.out.println("#Results --> " + results.size());

        if (results.size() == 0) {
            System.out.println("--> 0");
            model.addAttribute("getLocation", new NewPlaceDto(""));
            model.addAttribute("welcome", "Coś bliżej?");
            model.addAttribute("warning", "Niepoprawna lokalizacja");
            return "index";
        }
        if (results.size() == 1) {
            System.out.println("--> 1");
            PositionDto positionDto = new PositionDto(results.get(0).getGeometry().getLat(), results.get(0).getGeometry().getLng());
            Forecast forecast = getFromApiController.getForecast(positionDto);
            model.addAttribute("getLocation", new NewPlaceDto(newPlace));
            model.addAttribute("welcome", "Mirek");
            model.addAttribute("warning", "Wykryto " + results.size() + "miejsce");
            System.out.println("Pogoda --> " + forecast.getCurrently());
            ForecastBuilder forecastBuilder = new ForecastBuilder();
            System.out.println(forecast.getCurrently().getTemperature().toString());
            ForecastDto forecastDto = forecastBuilder
                    .setTemp(utilities.convertTempFromFahrenheitToCelsius(forecast.getCurrently().getTemperature().toString()) + "C")
                    .setTime(utilities.getDateTimeFromSeconds(forecast.getCurrently().getTime()))
                    .setWind(utilities.convertMilesPerHourToMetersPerSecond(forecast.getCurrently().getWindSpeed()) + "m/s")
                    .setIcon(weatherIcons.getWeatherIcon(forecast.getCurrently().getIcon()))
                    .buildForecast();
            model.addAttribute("forecast", forecastDto);
            return "showforecast";
        }

        List<NewPlaceDto> newPlaces = new ArrayList<>();
        for (Result r : results) {
            newPlaces.add(new NewPlaceDto(r.getFormatted()));
            // System.out.println("---> " + r.getFormatted());
        }
        model.addAttribute("places", newPlaces);
        model.addAttribute("name", "Mirek");
        model.addAttribute("warning", "Wykryto " + results.size() + " miejsc");
        return "selectplace";

    }
}
