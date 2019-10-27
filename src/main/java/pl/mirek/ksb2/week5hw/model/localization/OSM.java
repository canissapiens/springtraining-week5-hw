
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
    "edit_url",
    "url"
})
public class OSM {

    @JsonProperty("edit_url")
    private String editUrl;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OSM() {
    }

    /**
     * 
     * @param editUrl
     * @param url
     */
    public OSM(String editUrl, String url) {
        super();
        this.editUrl = editUrl;
        this.url = url;
    }

    @JsonProperty("edit_url")
    public String getEditUrl() {
        return editUrl;
    }

    @JsonProperty("edit_url")
    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
