
package pl.mirek.ksb2.week5hw.model.localization;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import pl.mirek.ksb2.week5hw.model.localization.Annotations;
import pl.mirek.ksb2.week5hw.model.localization.Bounds;
import pl.mirek.ksb2.week5hw.model.localization.Components;
import pl.mirek.ksb2.week5hw.model.localization.Geometry;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annotations",
    "bounds",
    "components",
    "confidence",
    "formatted",
    "geometry"
})
public class Result {

    @JsonProperty("annotations")
    private Annotations annotations;
    @JsonProperty("bounds")
    private Bounds bounds;
    @JsonProperty("components")
    private Components components;
    @JsonProperty("confidence")
    private Integer confidence;
    @JsonProperty("formatted")
    private String formatted;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param components
     * @param formatted
     * @param confidence
     * @param bounds
     * @param annotations
     * @param geometry
     */
    public Result(Annotations annotations, Bounds bounds, Components components, Integer confidence, String formatted, Geometry geometry) {
        super();
        this.annotations = annotations;
        this.bounds = bounds;
        this.components = components;
        this.confidence = confidence;
        this.formatted = formatted;
        this.geometry = geometry;
    }

    @JsonProperty("annotations")
    public Annotations getAnnotations() {
        return annotations;
    }

    @JsonProperty("annotations")
    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    @JsonProperty("bounds")
    public Bounds getBounds() {
        return bounds;
    }

    @JsonProperty("bounds")
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    @JsonProperty("components")
    public Components getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(Components components) {
        this.components = components;
    }

    @JsonProperty("confidence")
    public Integer getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("formatted")
    public String getFormatted() {
        return formatted;
    }

    @JsonProperty("formatted")
    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Result{" +
                "annotations=" + annotations +
                ", bounds=" + bounds +
                ", components=" + components +
                ", confidence=" + confidence +
                ", formatted='" + formatted + '\'' +
                ", geometry=" + geometry +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
