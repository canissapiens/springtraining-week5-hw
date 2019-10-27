
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
    "ISO_3166-1_alpha-2",
    "ISO_3166-1_alpha-3",
    "_type",
    "city",
    "continent",
    "country",
    "country_code",
    "county",
    "political_union",
    "state",
    "state_code",
    "hamlet",
    "state_district",
    "postcode",
    "suburb",
    "village",
    "bus_stop",
    "road",
    "road_type"
})
public class Components {

    @JsonProperty("ISO_3166-1_alpha-2")
    private String iSO31661Alpha2;
    @JsonProperty("ISO_3166-1_alpha-3")
    private String iSO31661Alpha3;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("city")
    private String city;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("county")
    private String county;
    @JsonProperty("political_union")
    private String politicalUnion;
    @JsonProperty("state")
    private String state;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("hamlet")
    private String hamlet;
    @JsonProperty("state_district")
    private String stateDistrict;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("village")
    private String village;
    @JsonProperty("bus_stop")
    private String busStop;
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
    public Components() {
    }

    /**
     * 
     * @param continent
     * @param country
     * @param stateDistrict
     * @param city
     * @param hamlet
     * @param busStop
     * @param county
     * @param postcode
     * @param type
     * @param roadType
     * @param road
     * @param iSO31661Alpha2
     * @param countryCode
     * @param iSO31661Alpha3
     * @param suburb
     * @param stateCode
     * @param state
     * @param village
     * @param politicalUnion
     */
    public Components(String iSO31661Alpha2, String iSO31661Alpha3, String type, String city, String continent, String country, String countryCode, String county, String politicalUnion, String state, String stateCode, String hamlet, String stateDistrict, String postcode, String suburb, String village, String busStop, String road, String roadType) {
        super();
        this.iSO31661Alpha2 = iSO31661Alpha2;
        this.iSO31661Alpha3 = iSO31661Alpha3;
        this.type = type;
        this.city = city;
        this.continent = continent;
        this.country = country;
        this.countryCode = countryCode;
        this.county = county;
        this.politicalUnion = politicalUnion;
        this.state = state;
        this.stateCode = stateCode;
        this.hamlet = hamlet;
        this.stateDistrict = stateDistrict;
        this.postcode = postcode;
        this.suburb = suburb;
        this.village = village;
        this.busStop = busStop;
        this.road = road;
        this.roadType = roadType;
    }

    @JsonProperty("ISO_3166-1_alpha-2")
    public String getISO31661Alpha2() {
        return iSO31661Alpha2;
    }

    @JsonProperty("ISO_3166-1_alpha-2")
    public void setISO31661Alpha2(String iSO31661Alpha2) {
        this.iSO31661Alpha2 = iSO31661Alpha2;
    }

    @JsonProperty("ISO_3166-1_alpha-3")
    public String getISO31661Alpha3() {
        return iSO31661Alpha3;
    }

    @JsonProperty("ISO_3166-1_alpha-3")
    public void setISO31661Alpha3(String iSO31661Alpha3) {
        this.iSO31661Alpha3 = iSO31661Alpha3;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("political_union")
    public String getPoliticalUnion() {
        return politicalUnion;
    }

    @JsonProperty("political_union")
    public void setPoliticalUnion(String politicalUnion) {
        this.politicalUnion = politicalUnion;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("hamlet")
    public String getHamlet() {
        return hamlet;
    }

    @JsonProperty("hamlet")
    public void setHamlet(String hamlet) {
        this.hamlet = hamlet;
    }

    @JsonProperty("state_district")
    public String getStateDistrict() {
        return stateDistrict;
    }

    @JsonProperty("state_district")
    public void setStateDistrict(String stateDistrict) {
        this.stateDistrict = stateDistrict;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @JsonProperty("village")
    public String getVillage() {
        return village;
    }

    @JsonProperty("village")
    public void setVillage(String village) {
        this.village = village;
    }

    @JsonProperty("bus_stop")
    public String getBusStop() {
        return busStop;
    }

    @JsonProperty("bus_stop")
    public void setBusStop(String busStop) {
        this.busStop = busStop;
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
