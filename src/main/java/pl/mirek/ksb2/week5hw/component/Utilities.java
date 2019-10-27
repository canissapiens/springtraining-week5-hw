package pl.mirek.ksb2.week5hw.component;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLFault;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

@Component
public class Utilities {

    private final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String convertTempFromFahrenheitToCelsius(String f) {
        BigDecimal fahrenheit = new BigDecimal(f);
        BigDecimal celsius = fahrenheit.subtract(new BigDecimal(32)).multiply(new BigDecimal(5)).divide(new BigDecimal(9), 4);
        celsius = celsius.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println(celsius);
        return celsius.toString();
    }

    public String getDateTimeFromSeconds(long timestamp) {
        if (timestamp == 0) {
            return "";
        }
        Instant instantS = Instant.ofEpochSecond(1572162356L);
        Date date = Date.from(instantS);
        String output = sdf.format(date);
        return output;
    }

    public String convertMilesPerHourToMetersPerSecond(Double speed) {
        Double speedInMeters = speed * 1609.344D;
        Double finalSpeed = speedInMeters / 3600.0D;
        BigDecimal output = BigDecimal.valueOf(finalSpeed);
        output = output.setScale(1, BigDecimal.ROUND_HALF_UP);
        return output.toString();
    }

}
