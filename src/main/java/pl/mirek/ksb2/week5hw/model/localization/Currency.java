
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alternate_symbols",
    "decimal_mark",
    "html_entity",
    "iso_code",
    "iso_numeric",
    "name",
    "smallest_denomination",
    "subunit",
    "subunit_to_unit",
    "symbol",
    "symbol_first",
    "thousands_separator"
})
public class Currency {

    @JsonProperty("alternate_symbols")
    private List<Object> alternateSymbols = null;
    @JsonProperty("decimal_mark")
    private String decimalMark;
    @JsonProperty("html_entity")
    private String htmlEntity;
    @JsonProperty("iso_code")
    private String isoCode;
    @JsonProperty("iso_numeric")
    private String isoNumeric;
    @JsonProperty("name")
    private String name;
    @JsonProperty("smallest_denomination")
    private Integer smallestDenomination;
    @JsonProperty("subunit")
    private String subunit;
    @JsonProperty("subunit_to_unit")
    private Integer subunitToUnit;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("symbol_first")
    private Integer symbolFirst;
    @JsonProperty("thousands_separator")
    private String thousandsSeparator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Currency() {
    }

    /**
     * 
     * @param alternateSymbols
     * @param symbol
     * @param htmlEntity
     * @param isoNumeric
     * @param smallestDenomination
     * @param isoCode
     * @param name
     * @param subunitToUnit
     * @param decimalMark
     * @param subunit
     * @param symbolFirst
     * @param thousandsSeparator
     */
    public Currency(List<Object> alternateSymbols, String decimalMark, String htmlEntity, String isoCode, String isoNumeric, String name, Integer smallestDenomination, String subunit, Integer subunitToUnit, String symbol, Integer symbolFirst, String thousandsSeparator) {
        super();
        this.alternateSymbols = alternateSymbols;
        this.decimalMark = decimalMark;
        this.htmlEntity = htmlEntity;
        this.isoCode = isoCode;
        this.isoNumeric = isoNumeric;
        this.name = name;
        this.smallestDenomination = smallestDenomination;
        this.subunit = subunit;
        this.subunitToUnit = subunitToUnit;
        this.symbol = symbol;
        this.symbolFirst = symbolFirst;
        this.thousandsSeparator = thousandsSeparator;
    }

    @JsonProperty("alternate_symbols")
    public List<Object> getAlternateSymbols() {
        return alternateSymbols;
    }

    @JsonProperty("alternate_symbols")
    public void setAlternateSymbols(List<Object> alternateSymbols) {
        this.alternateSymbols = alternateSymbols;
    }

    @JsonProperty("decimal_mark")
    public String getDecimalMark() {
        return decimalMark;
    }

    @JsonProperty("decimal_mark")
    public void setDecimalMark(String decimalMark) {
        this.decimalMark = decimalMark;
    }

    @JsonProperty("html_entity")
    public String getHtmlEntity() {
        return htmlEntity;
    }

    @JsonProperty("html_entity")
    public void setHtmlEntity(String htmlEntity) {
        this.htmlEntity = htmlEntity;
    }

    @JsonProperty("iso_code")
    public String getIsoCode() {
        return isoCode;
    }

    @JsonProperty("iso_code")
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @JsonProperty("iso_numeric")
    public String getIsoNumeric() {
        return isoNumeric;
    }

    @JsonProperty("iso_numeric")
    public void setIsoNumeric(String isoNumeric) {
        this.isoNumeric = isoNumeric;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("smallest_denomination")
    public Integer getSmallestDenomination() {
        return smallestDenomination;
    }

    @JsonProperty("smallest_denomination")
    public void setSmallestDenomination(Integer smallestDenomination) {
        this.smallestDenomination = smallestDenomination;
    }

    @JsonProperty("subunit")
    public String getSubunit() {
        return subunit;
    }

    @JsonProperty("subunit")
    public void setSubunit(String subunit) {
        this.subunit = subunit;
    }

    @JsonProperty("subunit_to_unit")
    public Integer getSubunitToUnit() {
        return subunitToUnit;
    }

    @JsonProperty("subunit_to_unit")
    public void setSubunitToUnit(Integer subunitToUnit) {
        this.subunitToUnit = subunitToUnit;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("symbol_first")
    public Integer getSymbolFirst() {
        return symbolFirst;
    }

    @JsonProperty("symbol_first")
    public void setSymbolFirst(Integer symbolFirst) {
        this.symbolFirst = symbolFirst;
    }

    @JsonProperty("thousands_separator")
    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    @JsonProperty("thousands_separator")
    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
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
