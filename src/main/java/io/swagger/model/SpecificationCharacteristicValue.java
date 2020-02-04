package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Any;
import io.swagger.model.TimePeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A number or text that can be assigned to a SpecificationCharacteristic
 */
@ApiModel(description = "A number or text that can be assigned to a SpecificationCharacteristic")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class SpecificationCharacteristicValue   {
  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("rangeInterval")
  private String rangeInterval = null;

  @JsonProperty("regex")
  private String regex = null;

  @JsonProperty("unitOfMeasure")
  private String unitOfMeasure = null;

  @JsonProperty("valueFrom")
  private Integer valueFrom = null;

  @JsonProperty("valueTo")
  private Integer valueTo = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("value")
  private Any value = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public SpecificationCharacteristicValue isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * If true, the Boolean Indicates if the value is the default value for a characteristic
   * @return isDefault
  **/
  @ApiModelProperty(value = "If true, the Boolean Indicates if the value is the default value for a characteristic")


  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SpecificationCharacteristicValue rangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
    return this;
  }

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".
   * @return rangeInterval
  **/
  @ApiModelProperty(value = "An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".")


  public String getRangeInterval() {
    return rangeInterval;
  }

  public void setRangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
  }

  public SpecificationCharacteristicValue regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A regular expression constraint for given value
   * @return regex
  **/
  @ApiModelProperty(value = "A regular expression constraint for given value")


  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public SpecificationCharacteristicValue unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * unit of measure for the valueCould be minutes, GB, etc
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "unit of measure for the valueCould be minutes, GB, etc")


  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public SpecificationCharacteristicValue valueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * The low range value that a characteristic can take on
   * @return valueFrom
  **/
  @ApiModelProperty(value = "The low range value that a characteristic can take on")


  public Integer getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
  }

  public SpecificationCharacteristicValue valueTo(Integer valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  /**
   * The upper range value that a characteristic can take on
   * @return valueTo
  **/
  @ApiModelProperty(value = "The upper range value that a characteristic can take on")


  public Integer getValueTo() {
    return valueTo;
  }

  public void setValueTo(Integer valueTo) {
    this.valueTo = valueTo;
  }

  public SpecificationCharacteristicValue valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic value can take on, such as numeric, text and so forth
   * @return valueType
  **/
  @ApiModelProperty(value = "A kind of value that the characteristic value can take on, such as numeric, text and so forth")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public SpecificationCharacteristicValue validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this object is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this object is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public SpecificationCharacteristicValue value(Any value) {
    this.value = value;
    return this;
  }

  /**
   * the  value that the characteristic can take on.
   * @return value
  **/
  @ApiModelProperty(value = "the  value that the characteristic can take on.")

  @Valid

  public Any getValue() {
    return value;
  }

  public void setValue(Any value) {
    this.value = value;
  }

  public SpecificationCharacteristicValue baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public SpecificationCharacteristicValue schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public SpecificationCharacteristicValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificationCharacteristicValue specificationCharacteristicValue = (SpecificationCharacteristicValue) o;
    return Objects.equals(this.isDefault, specificationCharacteristicValue.isDefault) &&
        Objects.equals(this.rangeInterval, specificationCharacteristicValue.rangeInterval) &&
        Objects.equals(this.regex, specificationCharacteristicValue.regex) &&
        Objects.equals(this.unitOfMeasure, specificationCharacteristicValue.unitOfMeasure) &&
        Objects.equals(this.valueFrom, specificationCharacteristicValue.valueFrom) &&
        Objects.equals(this.valueTo, specificationCharacteristicValue.valueTo) &&
        Objects.equals(this.valueType, specificationCharacteristicValue.valueType) &&
        Objects.equals(this.validFor, specificationCharacteristicValue.validFor) &&
        Objects.equals(this.value, specificationCharacteristicValue.value) &&
        Objects.equals(this.baseType, specificationCharacteristicValue.baseType) &&
        Objects.equals(this.schemaLocation, specificationCharacteristicValue.schemaLocation) &&
        Objects.equals(this.type, specificationCharacteristicValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rangeInterval, regex, unitOfMeasure, valueFrom, valueTo, valueType, validFor, value, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificationCharacteristicValue {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rangeInterval: ").append(toIndentedString(rangeInterval)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

