package pl.mirek.ksb2.week5hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.mirek.ksb2.week5hw.dto.PositionDto;
import pl.mirek.ksb2.week5hw.model.forecast.Forecast;
import pl.mirek.ksb2.week5hw.model.localization.Geolocal;
import pl.mirek.ksb2.week5hw.model.localization.Result;

import java.util.List;

@Controller
public class GetFromApiController {

    public List<Result> getGeoposition(String localization) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.opencagedata.com/geocode/v1/json?q={PLACE}&key=45a93c3ea25646359e2c359c62472306&language=pl&pretty=1";
        localization = localization.replaceAll(" ", "%20");
        url = url.replaceAll("\\{PLACE}", localization);
        System.out.println("Url --> " + url);
        Geolocal geoposition = restTemplate.getForObject(
                url,
                Geolocal.class);
        return geoposition.getResults();
    }

    // https://api.darksky.net/forecast/0b0f516376e6a5c6a49dbe88d6d6f7b8/37.8267,-122.4233

    public Forecast getForecast(PositionDto position) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.darksky.net/forecast/0b0f516376e6a5c6a49dbe88d6d6f7b8/{LAT},{LNG}?lang=pl";
        url = url.replaceAll("\\{LAT}", position.getLat().toString());
        url = url.replaceAll("\\{LNG}", position.getLng().toString());
        System.out.println("url --> " + url);
        Forecast forecast = restTemplate.getForObject(
                url,
                Forecast.class);
        return forecast;
    }
}
