
package pl.mirek.ksb2.week5hw.model.localization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import pl.mirek.ksb2.week5hw.model.localization.Regions;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "regions",
    "statistical_groupings"
})
public class UNM49 {

    @JsonProperty("regions")
    private Regions regions;
    @JsonProperty("statistical_groupings")
    private List<String> statisticalGroupings = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UNM49() {
    }

    /**
     * 
     * @param regions
     * @param statisticalGroupings
     */
    public UNM49(Regions regions, List<String> statisticalGroupings) {
        super();
        this.regions = regions;
        this.statisticalGroupings = statisticalGroupings;
    }

    @JsonProperty("regions")
    public Regions getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    @JsonProperty("statistical_groupings")
    public List<String> getStatisticalGroupings() {
        return statisticalGroupings;
    }

    @JsonProperty("statistical_groupings")
    public void setStatisticalGroupings(List<String> statisticalGroupings) {
        this.statisticalGroupings = statisticalGroupings;
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
