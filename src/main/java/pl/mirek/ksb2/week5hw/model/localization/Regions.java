
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
    "EASTERN_EUROPE",
    "EUROPE",
    "PL",
    "WORLD"
})
public class Regions {

    @JsonProperty("EASTERN_EUROPE")
    private String eASTERNEUROPE;
    @JsonProperty("EUROPE")
    private String eUROPE;
    @JsonProperty("PL")
    private String pL;
    @JsonProperty("WORLD")
    private String wORLD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Regions() {
    }

    /**
     * 
     * @param eASTERNEUROPE
     * @param wORLD
     * @param pL
     * @param eUROPE
     */
    public Regions(String eASTERNEUROPE, String eUROPE, String pL, String wORLD) {
        super();
        this.eASTERNEUROPE = eASTERNEUROPE;
        this.eUROPE = eUROPE;
        this.pL = pL;
        this.wORLD = wORLD;
    }

    @JsonProperty("EASTERN_EUROPE")
    public String getEASTERNEUROPE() {
        return eASTERNEUROPE;
    }

    @JsonProperty("EASTERN_EUROPE")
    public void setEASTERNEUROPE(String eASTERNEUROPE) {
        this.eASTERNEUROPE = eASTERNEUROPE;
    }

    @JsonProperty("EUROPE")
    public String getEUROPE() {
        return eUROPE;
    }

    @JsonProperty("EUROPE")
    public void setEUROPE(String eUROPE) {
        this.eUROPE = eUROPE;
    }

    @JsonProperty("PL")
    public String getPL() {
        return pL;
    }

    @JsonProperty("PL")
    public void setPL(String pL) {
        this.pL = pL;
    }

    @JsonProperty("WORLD")
    public String getWORLD() {
        return wORLD;
    }

    @JsonProperty("WORLD")
    public void setWORLD(String wORLD) {
        this.wORLD = wORLD;
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
