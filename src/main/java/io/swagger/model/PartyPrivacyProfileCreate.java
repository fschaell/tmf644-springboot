package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PartyPrivacyAgreementRef;
import io.swagger.model.PartyPrivacyProfileCharacteristic;
import io.swagger.model.PartyPrivacyProfileSpecificationRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party Skipped properties: id,href
 */
@ApiModel(description = "A Party Privacy Profile represents the set of Privacy settings defined for a Party Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyProfileCreate   {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("agreedByParty")
  private RelatedParty agreedByParty = null;

  @JsonProperty("agreement")
  private PartyPrivacyAgreementRef agreement = null;

  @JsonProperty("applicableForParty")
  private RelatedParty applicableForParty = null;

  @JsonProperty("partyPrivacyProfileCharacteristic")
  @Valid
  private List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();

  @JsonProperty("partyPrivacyProfileSpecification")
  private PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public PartyPrivacyProfileCreate creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date on which the PartyPrivacyProfile was created
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date on which the PartyPrivacyProfile was created")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PartyPrivacyProfileCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the privacy profile
   * @return description
  **/
  @ApiModelProperty(value = "Description of the privacy profile")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyProfileCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the privacy profile
   * @return name
  **/
  @ApiModelProperty(value = "Name of the privacy profile")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileCreate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of this profile (such as agreed, created, terminated, etc.)
   * @return status
  **/
  @ApiModelProperty(value = "The status of this profile (such as agreed, created, terminated, etc.)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyPrivacyProfileCreate agreedByParty(RelatedParty agreedByParty) {
    this.agreedByParty = agreedByParty;
    return this;
  }

  /**
   * The party who agreed to the privacy profile. Not necessarily the party to whom the profile applies.
   * @return agreedByParty
  **/
  @ApiModelProperty(required = true, value = "The party who agreed to the privacy profile. Not necessarily the party to whom the profile applies.")
  @NotNull

  @Valid

  public RelatedParty getAgreedByParty() {
    return agreedByParty;
  }

  public void setAgreedByParty(RelatedParty agreedByParty) {
    this.agreedByParty = agreedByParty;
  }

  public PartyPrivacyProfileCreate agreement(PartyPrivacyAgreementRef agreement) {
    this.agreement = agreement;
    return this;
  }

  /**
   * An agreement under which the privacy profile was produced.
   * @return agreement
  **/
  @ApiModelProperty(value = "An agreement under which the privacy profile was produced.")

  @Valid

  public PartyPrivacyAgreementRef getAgreement() {
    return agreement;
  }

  public void setAgreement(PartyPrivacyAgreementRef agreement) {
    this.agreement = agreement;
  }

  public PartyPrivacyProfileCreate applicableForParty(RelatedParty applicableForParty) {
    this.applicableForParty = applicableForParty;
    return this;
  }

  /**
   * The party to whom the privacy profile applies. Could be a minor where the agreeing party is a parent, an organization where the agreeing party is authorized to make such agreements, or some individual for whom the agreeing party has authorization (e.g. power of attorney). If empty, the agreeing party is the party to whom the profile applies.
   * @return applicableForParty
  **/
  @ApiModelProperty(value = "The party to whom the privacy profile applies. Could be a minor where the agreeing party is a parent, an organization where the agreeing party is authorized to make such agreements, or some individual for whom the agreeing party has authorization (e.g. power of attorney). If empty, the agreeing party is the party to whom the profile applies.")

  @Valid

  public RelatedParty getApplicableForParty() {
    return applicableForParty;
  }

  public void setApplicableForParty(RelatedParty applicableForParty) {
    this.applicableForParty = applicableForParty;
  }

  public PartyPrivacyProfileCreate partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
    return this;
  }

  public PartyPrivacyProfileCreate addPartyPrivacyProfileCharacteristicItem(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristicItem) {
    this.partyPrivacyProfileCharacteristic.add(partyPrivacyProfileCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics of the privacy profile
   * @return partyPrivacyProfileCharacteristic
  **/
  @ApiModelProperty(required = true, value = "List of characteristics of the privacy profile")
  @NotNull

  @Valid
@Size(min=1) 
  public List<PartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristic() {
    return partyPrivacyProfileCharacteristic;
  }

  public void setPartyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
  }

  public PartyPrivacyProfileCreate partyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  /**
   * The specification from which this profile was instantiated
   * @return partyPrivacyProfileSpecification
  **/
  @ApiModelProperty(required = true, value = "The specification from which this profile was instantiated")
  @NotNull

  @Valid

  public PartyPrivacyProfileSpecificationRef getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }

  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }

  public PartyPrivacyProfileCreate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which this profile is valid, depending on regulations or business consideration the profile may expire and need to be renegotiated.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which this profile is valid, depending on regulations or business consideration the profile may expire and need to be renegotiated.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PartyPrivacyProfileCreate baseType(String baseType) {
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

  public PartyPrivacyProfileCreate schemaLocation(String schemaLocation) {
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

  public PartyPrivacyProfileCreate type(String type) {
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
    PartyPrivacyProfileCreate partyPrivacyProfileCreate = (PartyPrivacyProfileCreate) o;
    return Objects.equals(this.creationDate, partyPrivacyProfileCreate.creationDate) &&
        Objects.equals(this.description, partyPrivacyProfileCreate.description) &&
        Objects.equals(this.name, partyPrivacyProfileCreate.name) &&
        Objects.equals(this.status, partyPrivacyProfileCreate.status) &&
        Objects.equals(this.agreedByParty, partyPrivacyProfileCreate.agreedByParty) &&
        Objects.equals(this.agreement, partyPrivacyProfileCreate.agreement) &&
        Objects.equals(this.applicableForParty, partyPrivacyProfileCreate.applicableForParty) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyProfileCreate.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfileCreate.partyPrivacyProfileSpecification) &&
        Objects.equals(this.validFor, partyPrivacyProfileCreate.validFor) &&
        Objects.equals(this.baseType, partyPrivacyProfileCreate.baseType) &&
        Objects.equals(this.schemaLocation, partyPrivacyProfileCreate.schemaLocation) &&
        Objects.equals(this.type, partyPrivacyProfileCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, description, name, status, agreedByParty, agreement, applicableForParty, partyPrivacyProfileCharacteristic, partyPrivacyProfileSpecification, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCreate {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    agreedByParty: ").append(toIndentedString(agreedByParty)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    applicableForParty: ").append(toIndentedString(applicableForParty)).append("\n");
    sb.append("    partyPrivacyProfileCharacteristic: ").append(toIndentedString(partyPrivacyProfileCharacteristic)).append("\n");
    sb.append("    partyPrivacyProfileSpecification: ").append(toIndentedString(partyPrivacyProfileSpecification)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

