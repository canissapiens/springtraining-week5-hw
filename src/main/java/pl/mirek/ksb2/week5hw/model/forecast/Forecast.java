
package pl.mirek.ksb2.week5hw.model.forecast;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "timezone",
    "currently",
    "hourly",
    "daily",
    "flags",
    "offset"
})
public class Forecast {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currently")
    private Currently currently;
    @JsonProperty("hourly")
    private Hourly hourly;
    @JsonProperty("daily")
    private Daily daily;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("offset")
    private Integer offset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecast() {
    }

    /**
     * 
     * @param currently
     * @param offset
     * @param timezone
     * @param latitude
     * @param daily
     * @param flags
     * @param hourly
     * @param longitude
     */
    public Forecast(Double latitude, Double longitude, String timezone, Currently currently, Hourly hourly, Daily daily, Flags flags, Integer offset) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.timezone = timezone;
        this.currently = currently;
        this.hourly = hourly;
        this.daily = daily;
        this.flags = flags;
        this.offset = offset;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("currently")
    public Currently getCurrently() {
        return currently;
    }

    @JsonProperty("currently")
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    @JsonProperty("hourly")
    public Hourly getHourly() {
        return hourly;
    }

    @JsonProperty("hourly")
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    @JsonProperty("daily")
    public Daily getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
