
package pl.mirek.ksb2.week5hw.model.localization;

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
    "drive_on",
    "speed_in",
    "road",
    "road_type"
})
public class Roadinfo {

    @JsonProperty("drive_on")
    private String driveOn;
    @JsonProperty("speed_in")
    private String speedIn;
    @JsonProperty("road")
    private String road;
    @JsonProperty("road_type")
    private String roadType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Roadinfo() {
    }

    /**
     * 
     * @param roadType
     * @param road
     * @param speedIn
     * @param driveOn
     */
    public Roadinfo(String driveOn, String speedIn, String road, String roadType) {
        super();
        this.driveOn = driveOn;
        this.speedIn = speedIn;
        this.road = road;
        this.roadType = roadType;
    }

    @JsonProperty("drive_on")
    public String getDriveOn() {
        return driveOn;
    }

    @JsonProperty("drive_on")
    public void setDriveOn(String driveOn) {
        this.driveOn = driveOn;
    }

    @JsonProperty("speed_in")
    public String getSpeedIn() {
        return speedIn;
    }

    @JsonProperty("speed_in")
    public void setSpeedIn(String speedIn) {
        this.speedIn = speedIn;
    }

    @JsonProperty("road")
    public String getRoad() {
        return road;
    }

    @JsonProperty("road")
    public void setRoad(String road) {
        this.road = road;
    }

    @JsonProperty("road_type")
    public String getRoadType() {
        return roadType;
    }

    @JsonProperty("road_type")
    public void setRoadType(String roadType) {
        this.roadType = roadType;
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
