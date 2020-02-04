package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgreementAuthorization;
import io.swagger.model.AgreementItem;
import io.swagger.model.AgreementRef;
import io.swagger.model.AgreementSpecificationRef;
import io.swagger.model.Characteristic;
import io.swagger.model.PartyPrivacyProfileCharacteristic;
import io.swagger.model.PartyPrivacyProfileRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A specific type of agreement that formalizes the privacy profiles requested for a party
 */
@ApiModel(description = "A specific type of agreement that formalizes the privacy profiles requested for a party")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyAgreement   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("agreementType")
  private String agreementType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("documentNumber")
  private Integer documentNumber = null;

  @JsonProperty("initialDate")
  private OffsetDateTime initialDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("statementOfIntent")
  private String statementOfIntent = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("agreementAuthorization")
  @Valid
  private List<AgreementAuthorization> agreementAuthorization = null;

  @JsonProperty("agreementItem")
  @Valid
  private List<AgreementItem> agreementItem = new ArrayList<AgreementItem>();

  @JsonProperty("agreementPeriod")
  private TimePeriod agreementPeriod = null;

  @JsonProperty("agreementSpecification")
  private AgreementSpecificationRef agreementSpecification = null;

  @JsonProperty("associatedAgreement")
  @Valid
  private List<AgreementRef> associatedAgreement = null;

  @JsonProperty("characteristic")
  @Valid
  private List<Characteristic> characteristic = null;

  @JsonProperty("completionDate")
  private TimePeriod completionDate = null;

  @JsonProperty("engagedPartyRole")
  @Valid
  private List<RelatedParty> engagedPartyRole = new ArrayList<RelatedParty>();

  @JsonProperty("partyPrivacyProfile")
  @Valid
  private List<PartyPrivacyProfileRef> partyPrivacyProfile = null;

  @JsonProperty("partyPrivacyProfileCharacteristic")
  @Valid
  private List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public PartyPrivacyAgreement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the agreement
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the agreement")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyAgreement href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Unique url identifying the agreement as a resource
   * @return href
  **/
  @ApiModelProperty(value = "Unique url identifying the agreement as a resource")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyPrivacyAgreement agreementType(String agreementType) {
    this.agreementType = agreementType;
    return this;
  }

  /**
   * The type of the agreement. For example commercial
   * @return agreementType
  **/
  @ApiModelProperty(required = true, value = "The type of the agreement. For example commercial")
  @NotNull


  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }

  public PartyPrivacyAgreement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Narrative that explains the agreement and details about the it , such as why the agreement is taking place.
   * @return description
  **/
  @ApiModelProperty(value = "Narrative that explains the agreement and details about the it , such as why the agreement is taking place.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyAgreement documentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * A reference number assigned to an Agreement that follows a prescribed numbering system.
   * @return documentNumber
  **/
  @ApiModelProperty(value = "A reference number assigned to an Agreement that follows a prescribed numbering system.")


  public Integer getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
  }

  public PartyPrivacyAgreement initialDate(OffsetDateTime initialDate) {
    this.initialDate = initialDate;
    return this;
  }

  /**
   * Date at which the agreement was initialized
   * @return initialDate
  **/
  @ApiModelProperty(value = "Date at which the agreement was initialized")

  @Valid

  public OffsetDateTime getInitialDate() {
    return initialDate;
  }

  public void setInitialDate(OffsetDateTime initialDate) {
    this.initialDate = initialDate;
  }

  public PartyPrivacyAgreement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for the agreement
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-readable name for the agreement")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyAgreement statementOfIntent(String statementOfIntent) {
    this.statementOfIntent = statementOfIntent;
    return this;
  }

  /**
   * An overview and goals of the Agreement
   * @return statementOfIntent
  **/
  @ApiModelProperty(value = "An overview and goals of the Agreement")


  public String getStatementOfIntent() {
    return statementOfIntent;
  }

  public void setStatementOfIntent(String statementOfIntent) {
    this.statementOfIntent = statementOfIntent;
  }

  public PartyPrivacyAgreement status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the agreement. Typical values are: in process, approved and rejected
   * @return status
  **/
  @ApiModelProperty(value = "The current status of the agreement. Typical values are: in process, approved and rejected")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyPrivacyAgreement version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A string identifying the version of the agreement
   * @return version
  **/
  @ApiModelProperty(value = "A string identifying the version of the agreement")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PartyPrivacyAgreement agreementAuthorization(List<AgreementAuthorization> agreementAuthorization) {
    this.agreementAuthorization = agreementAuthorization;
    return this;
  }

  public PartyPrivacyAgreement addAgreementAuthorizationItem(AgreementAuthorization agreementAuthorizationItem) {
    if (this.agreementAuthorization == null) {
      this.agreementAuthorization = new ArrayList<AgreementAuthorization>();
    }
    this.agreementAuthorization.add(agreementAuthorizationItem);
    return this;
  }

  /**
   * Get agreementAuthorization
   * @return agreementAuthorization
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementAuthorization> getAgreementAuthorization() {
    return agreementAuthorization;
  }

  public void setAgreementAuthorization(List<AgreementAuthorization> agreementAuthorization) {
    this.agreementAuthorization = agreementAuthorization;
  }

  public PartyPrivacyAgreement agreementItem(List<AgreementItem> agreementItem) {
    this.agreementItem = agreementItem;
    return this;
  }

  public PartyPrivacyAgreement addAgreementItemItem(AgreementItem agreementItemItem) {
    this.agreementItem.add(agreementItemItem);
    return this;
  }

  /**
   * Get agreementItem
   * @return agreementItem
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<AgreementItem> getAgreementItem() {
    return agreementItem;
  }

  public void setAgreementItem(List<AgreementItem> agreementItem) {
    this.agreementItem = agreementItem;
  }

  public PartyPrivacyAgreement agreementPeriod(TimePeriod agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

  /**
   * The time period during which the Agreement is in effect.
   * @return agreementPeriod
  **/
  @ApiModelProperty(value = "The time period during which the Agreement is in effect.")

  @Valid

  public TimePeriod getAgreementPeriod() {
    return agreementPeriod;
  }

  public void setAgreementPeriod(TimePeriod agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  public PartyPrivacyAgreement agreementSpecification(AgreementSpecificationRef agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  /**
   * Get agreementSpecification
   * @return agreementSpecification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgreementSpecificationRef getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(AgreementSpecificationRef agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  public PartyPrivacyAgreement associatedAgreement(List<AgreementRef> associatedAgreement) {
    this.associatedAgreement = associatedAgreement;
    return this;
  }

  public PartyPrivacyAgreement addAssociatedAgreementItem(AgreementRef associatedAgreementItem) {
    if (this.associatedAgreement == null) {
      this.associatedAgreement = new ArrayList<AgreementRef>();
    }
    this.associatedAgreement.add(associatedAgreementItem);
    return this;
  }

  /**
   * Get associatedAgreement
   * @return associatedAgreement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementRef> getAssociatedAgreement() {
    return associatedAgreement;
  }

  public void setAssociatedAgreement(List<AgreementRef> associatedAgreement) {
    this.associatedAgreement = associatedAgreement;
  }

  public PartyPrivacyAgreement characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public PartyPrivacyAgreement addCharacteristicItem(Characteristic characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<Characteristic>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * Get characteristic
   * @return characteristic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public PartyPrivacyAgreement completionDate(TimePeriod completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date at which the agreement is completed
   * @return completionDate
  **/
  @ApiModelProperty(value = "Date at which the agreement is completed")

  @Valid

  public TimePeriod getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(TimePeriod completionDate) {
    this.completionDate = completionDate;
  }

  public PartyPrivacyAgreement engagedPartyRole(List<RelatedParty> engagedPartyRole) {
    this.engagedPartyRole = engagedPartyRole;
    return this;
  }

  public PartyPrivacyAgreement addEngagedPartyRoleItem(RelatedParty engagedPartyRoleItem) {
    this.engagedPartyRole.add(engagedPartyRoleItem);
    return this;
  }

  /**
   * Get engagedPartyRole
   * @return engagedPartyRole
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<RelatedParty> getEngagedPartyRole() {
    return engagedPartyRole;
  }

  public void setEngagedPartyRole(List<RelatedParty> engagedPartyRole) {
    this.engagedPartyRole = engagedPartyRole;
  }

  public PartyPrivacyAgreement partyPrivacyProfile(List<PartyPrivacyProfileRef> partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
    return this;
  }

  public PartyPrivacyAgreement addPartyPrivacyProfileItem(PartyPrivacyProfileRef partyPrivacyProfileItem) {
    if (this.partyPrivacyProfile == null) {
      this.partyPrivacyProfile = new ArrayList<PartyPrivacyProfileRef>();
    }
    this.partyPrivacyProfile.add(partyPrivacyProfileItem);
    return this;
  }

  /**
   * The privacy profiles that are the subject of the agreement
   * @return partyPrivacyProfile
  **/
  @ApiModelProperty(value = "The privacy profiles that are the subject of the agreement")

  @Valid

  public List<PartyPrivacyProfileRef> getPartyPrivacyProfile() {
    return partyPrivacyProfile;
  }

  public void setPartyPrivacyProfile(List<PartyPrivacyProfileRef> partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
  }

  public PartyPrivacyAgreement partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
    return this;
  }

  public PartyPrivacyAgreement addPartyPrivacyProfileCharacteristicItem(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristicItem) {
    if (this.partyPrivacyProfileCharacteristic == null) {
      this.partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();
    }
    this.partyPrivacyProfileCharacteristic.add(partyPrivacyProfileCharacteristicItem);
    return this;
  }

  /**
   * A list of (typically) high criticality characteristics whose chosen privacy rules are included in the agreement
   * @return partyPrivacyProfileCharacteristic
  **/
  @ApiModelProperty(value = "A list of (typically) high criticality characteristics whose chosen privacy rules are included in the agreement")

  @Valid

  public List<PartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristic() {
    return partyPrivacyProfileCharacteristic;
  }

  public void setPartyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
  }

  public PartyPrivacyAgreement baseType(String baseType) {
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

  public PartyPrivacyAgreement schemaLocation(String schemaLocation) {
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

  public PartyPrivacyAgreement type(String type) {
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
    PartyPrivacyAgreement partyPrivacyAgreement = (PartyPrivacyAgreement) o;
    return Objects.equals(this.id, partyPrivacyAgreement.id) &&
        Objects.equals(this.href, partyPrivacyAgreement.href) &&
        Objects.equals(this.agreementType, partyPrivacyAgreement.agreementType) &&
        Objects.equals(this.description, partyPrivacyAgreement.description) &&
        Objects.equals(this.documentNumber, partyPrivacyAgreement.documentNumber) &&
        Objects.equals(this.initialDate, partyPrivacyAgreement.initialDate) &&
        Objects.equals(this.name, partyPrivacyAgreement.name) &&
        Objects.equals(this.statementOfIntent, partyPrivacyAgreement.statementOfIntent) &&
        Objects.equals(this.status, partyPrivacyAgreement.status) &&
        Objects.equals(this.version, partyPrivacyAgreement.version) &&
        Objects.equals(this.agreementAuthorization, partyPrivacyAgreement.agreementAuthorization) &&
        Objects.equals(this.agreementItem, partyPrivacyAgreement.agreementItem) &&
        Objects.equals(this.agreementPeriod, partyPrivacyAgreement.agreementPeriod) &&
        Objects.equals(this.agreementSpecification, partyPrivacyAgreement.agreementSpecification) &&
        Objects.equals(this.associatedAgreement, partyPrivacyAgreement.associatedAgreement) &&
        Objects.equals(this.characteristic, partyPrivacyAgreement.characteristic) &&
        Objects.equals(this.completionDate, partyPrivacyAgreement.completionDate) &&
        Objects.equals(this.engagedPartyRole, partyPrivacyAgreement.engagedPartyRole) &&
        Objects.equals(this.partyPrivacyProfile, partyPrivacyAgreement.partyPrivacyProfile) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyAgreement.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.baseType, partyPrivacyAgreement.baseType) &&
        Objects.equals(this.schemaLocation, partyPrivacyAgreement.schemaLocation) &&
        Objects.equals(this.type, partyPrivacyAgreement.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, agreementType, description, documentNumber, initialDate, name, statementOfIntent, status, version, agreementAuthorization, agreementItem, agreementPeriod, agreementSpecification, associatedAgreement, characteristic, completionDate, engagedPartyRole, partyPrivacyProfile, partyPrivacyProfileCharacteristic, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statementOfIntent: ").append(toIndentedString(statementOfIntent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreementAuthorization: ").append(toIndentedString(agreementAuthorization)).append("\n");
    sb.append("    agreementItem: ").append(toIndentedString(agreementItem)).append("\n");
    sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
    sb.append("    associatedAgreement: ").append(toIndentedString(associatedAgreement)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    engagedPartyRole: ").append(toIndentedString(engagedPartyRole)).append("\n");
    sb.append("    partyPrivacyProfile: ").append(toIndentedString(partyPrivacyProfile)).append("\n");
    sb.append("    partyPrivacyProfileCharacteristic: ").append(toIndentedString(partyPrivacyProfileCharacteristic)).append("\n");
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

