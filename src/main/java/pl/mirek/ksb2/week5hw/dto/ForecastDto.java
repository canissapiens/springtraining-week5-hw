package pl.mirek.ksb2.week5hw.dto;

import pl.mirek.ksb2.week5hw.model.forecast.Forecast;

public class ForecastDto {
    private String time;
    private String temp;
    private String wind;
    private String icon;

    public ForecastDto(ForecastBuilder builder) {
        this.time = builder.time;
        this.temp = builder.temp;
        this.wind = builder.wind;
        this.icon = builder.icon;
    }

    public String getTime() {
        return time;
    }

    public String getTemp() {
        return temp;
    }

    public String getWind() {
        return wind;
    }

    public String getIcon() {
        return icon;
    }

    public static class ForecastBuilder {
        private String time;
        private String temp;
        private String wind;
        private String icon;

        public ForecastBuilder() {
        }

        public ForecastBuilder setTime(String time) {
            this.time = time;
            return this;
        }

        public ForecastBuilder setTemp(String temp) {
            this.temp = temp;
            return this;
        }

        public ForecastBuilder setWind(String wind) {
            this.wind = wind;
            return this;
        }

        public ForecastBuilder setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public ForecastDto buildForecast() {
            return new ForecastDto(this);
        }

    } // ForecastBuilder
}
