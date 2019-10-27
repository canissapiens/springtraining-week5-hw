package pl.mirek.ksb2.week5hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mirek.ksb2.week5hw.model.localization.Result;

import java.util.List;


@RestController
@RequestMapping("/localization")
public class RController {

    private GetFromApiController getController;

    @Autowired
    public RController(GetFromApiController getController) {
        this.getController = getController;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    /*public Geolocal getLocalization() {
        return getController.getGeoposition("Kraków PL");
    }
    */
    public List<Result> getCoordinates() {
        List<Result> output = getController.getGeoposition("Krakow");
        System.out.println("Linii --> " + output.size());
        return output;
    }

}
