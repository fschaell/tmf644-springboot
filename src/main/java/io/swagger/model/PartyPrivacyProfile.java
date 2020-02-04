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
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party
 */
@ApiModel(description = "A Party Privacy Profile represents the set of Privacy settings defined for a Party")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyProfile   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

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
  private List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = null;

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

  public PartyPrivacyProfile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the privacy profile
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the privacy profile")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyProfile href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI reference of the privacy profile allowing navigation to the resource
   * @return href
  **/
  @ApiModelProperty(value = "URI reference of the privacy profile allowing navigation to the resource")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyPrivacyProfile creationDate(OffsetDateTime creationDate) {
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

  public PartyPrivacyProfile description(String description) {
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

  public PartyPrivacyProfile name(String name) {
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

  public PartyPrivacyProfile status(String status) {
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

  public PartyPrivacyProfile agreedByParty(RelatedParty agreedByParty) {
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

  public PartyPrivacyProfile agreement(PartyPrivacyAgreementRef agreement) {
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

  public PartyPrivacyProfile applicableForParty(RelatedParty applicableForParty) {
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

  public PartyPrivacyProfile partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
    return this;
  }

  public PartyPrivacyProfile addPartyPrivacyProfileCharacteristicItem(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristicItem) {
    if (this.partyPrivacyProfileCharacteristic == null) {
      this.partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();
    }
    this.partyPrivacyProfileCharacteristic.add(partyPrivacyProfileCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics of the privacy profile
   * @return partyPrivacyProfileCharacteristic
  **/
  @ApiModelProperty(value = "List of characteristics of the privacy profile")

  @Valid

  public List<PartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristic() {
    return partyPrivacyProfileCharacteristic;
  }

  public void setPartyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
  }

  public PartyPrivacyProfile partyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  /**
   * The specification from which this profile was instantiated
   * @return partyPrivacyProfileSpecification
  **/
  @ApiModelProperty(value = "The specification from which this profile was instantiated")

  @Valid

  public PartyPrivacyProfileSpecificationRef getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }

  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }

  public PartyPrivacyProfile validFor(TimePeriod validFor) {
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

  public PartyPrivacyProfile baseType(String baseType) {
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

  public PartyPrivacyProfile schemaLocation(String schemaLocation) {
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

  public PartyPrivacyProfile type(String type) {
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
    PartyPrivacyProfile partyPrivacyProfile = (PartyPrivacyProfile) o;
    return Objects.equals(this.id, partyPrivacyProfile.id) &&
        Objects.equals(this.href, partyPrivacyProfile.href) &&
        Objects.equals(this.creationDate, partyPrivacyProfile.creationDate) &&
        Objects.equals(this.description, partyPrivacyProfile.description) &&
        Objects.equals(this.name, partyPrivacyProfile.name) &&
        Objects.equals(this.status, partyPrivacyProfile.status) &&
        Objects.equals(this.agreedByParty, partyPrivacyProfile.agreedByParty) &&
        Objects.equals(this.agreement, partyPrivacyProfile.agreement) &&
        Objects.equals(this.applicableForParty, partyPrivacyProfile.applicableForParty) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyProfile.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfile.partyPrivacyProfileSpecification) &&
        Objects.equals(this.validFor, partyPrivacyProfile.validFor) &&
        Objects.equals(this.baseType, partyPrivacyProfile.baseType) &&
        Objects.equals(this.schemaLocation, partyPrivacyProfile.schemaLocation) &&
        Objects.equals(this.type, partyPrivacyProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, creationDate, description, name, status, agreedByParty, agreement, applicableForParty, partyPrivacyProfileCharacteristic, partyPrivacyProfileSpecification, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

