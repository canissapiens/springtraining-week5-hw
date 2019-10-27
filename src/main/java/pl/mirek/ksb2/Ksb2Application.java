package pl.mirek.ksb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

@SpringBootApplication
public class Ksb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ksb2Application.class, args);
    }

}
