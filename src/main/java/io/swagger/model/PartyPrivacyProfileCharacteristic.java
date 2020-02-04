package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Any;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic
 */
@ApiModel(description = "A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyProfileCharacteristic   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("privacyUsagePurpose")
  private String privacyUsagePurpose = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("value")
  private Any value = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public PartyPrivacyProfileCharacteristic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyProfileCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the characteristic")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileCharacteristic privacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
    return this;
  }

  /**
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH, etc.
   * @return privacyUsagePurpose
  **/
  @ApiModelProperty(value = "Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH, etc.")


  public String getPrivacyUsagePurpose() {
    return privacyUsagePurpose;
  }

  public void setPrivacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
  }

  public PartyPrivacyProfileCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Data type of the value of the characteristic
   * @return valueType
  **/
  @ApiModelProperty(value = "Data type of the value of the characteristic")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public PartyPrivacyProfileCharacteristic relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyPrivacyProfileCharacteristic addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of parties to which the allowed use of the characteristic applies.
   * @return relatedParty
  **/
  @ApiModelProperty(value = "A list of parties to which the allowed use of the characteristic applies.")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PartyPrivacyProfileCharacteristic value(Any value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the characteristic
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the characteristic")
  @NotNull

  @Valid

  public Any getValue() {
    return value;
  }

  public void setValue(Any value) {
    this.value = value;
  }

  public PartyPrivacyProfileCharacteristic baseType(String baseType) {
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

  public PartyPrivacyProfileCharacteristic schemaLocation(String schemaLocation) {
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

  public PartyPrivacyProfileCharacteristic type(String type) {
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
    PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic = (PartyPrivacyProfileCharacteristic) o;
    return Objects.equals(this.id, partyPrivacyProfileCharacteristic.id) &&
        Objects.equals(this.name, partyPrivacyProfileCharacteristic.name) &&
        Objects.equals(this.privacyUsagePurpose, partyPrivacyProfileCharacteristic.privacyUsagePurpose) &&
        Objects.equals(this.valueType, partyPrivacyProfileCharacteristic.valueType) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileCharacteristic.relatedParty) &&
        Objects.equals(this.value, partyPrivacyProfileCharacteristic.value) &&
        Objects.equals(this.baseType, partyPrivacyProfileCharacteristic.baseType) &&
        Objects.equals(this.schemaLocation, partyPrivacyProfileCharacteristic.schemaLocation) &&
        Objects.equals(this.type, partyPrivacyProfileCharacteristic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, privacyUsagePurpose, valueType, relatedParty, value, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyUsagePurpose: ").append(toIndentedString(privacyUsagePurpose)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

