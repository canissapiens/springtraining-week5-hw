
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
    "apparent",
    "astronomical",
    "civil",
    "nautical"
})
public class Rise {

    @JsonProperty("apparent")
    private Integer apparent;
    @JsonProperty("astronomical")
    private Integer astronomical;
    @JsonProperty("civil")
    private Integer civil;
    @JsonProperty("nautical")
    private Integer nautical;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rise() {
    }

    /**
     * 
     * @param astronomical
     * @param civil
     * @param apparent
     * @param nautical
     */
    public Rise(Integer apparent, Integer astronomical, Integer civil, Integer nautical) {
        super();
        this.apparent = apparent;
        this.astronomical = astronomical;
        this.civil = civil;
        this.nautical = nautical;
    }

    @JsonProperty("apparent")
    public Integer getApparent() {
        return apparent;
    }

    @JsonProperty("apparent")
    public void setApparent(Integer apparent) {
        this.apparent = apparent;
    }

    @JsonProperty("astronomical")
    public Integer getAstronomical() {
        return astronomical;
    }

    @JsonProperty("astronomical")
    public void setAstronomical(Integer astronomical) {
        this.astronomical = astronomical;
    }

    @JsonProperty("civil")
    public Integer getCivil() {
        return civil;
    }

    @JsonProperty("civil")
    public void setCivil(Integer civil) {
        this.civil = civil;
    }

    @JsonProperty("nautical")
    public Integer getNautical() {
        return nautical;
    }

    @JsonProperty("nautical")
    public void setNautical(Integer nautical) {
        this.nautical = nautical;
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
