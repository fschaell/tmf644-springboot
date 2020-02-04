package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PartyPrivacyProfileSpecificationCharacteristic;
import io.swagger.model.PartyPrivacyRoleSpecification;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners.
 */
@ApiModel(description = "Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyProfileSpecification   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("applicableRole")
  @Valid
  private List<PartyPrivacyRoleSpecification> applicableRole = null;

  @JsonProperty("partyPrivacyProfileSpecCharacteristic")
  @Valid
  private List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic = null;

  @JsonProperty("productOffering")
  @Valid
  private List<ProductOfferingRef> productOffering = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public PartyPrivacyProfileSpecification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the specification
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the specification")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyProfileSpecification href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI reference of the specification allowing navigation to the resource
   * @return href
  **/
  @ApiModelProperty(value = "URI reference of the specification allowing navigation to the resource")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyPrivacyProfileSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the specification
   * @return description
  **/
  @ApiModelProperty(value = "Description of the specification")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyProfileSpecification lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time when the specification was last updated
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "Date and time when the specification was last updated")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public PartyPrivacyProfileSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the specification
   * @return name
  **/
  @ApiModelProperty(value = "Name of the specification")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileSpecification status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Lifecycle status of the specification (e.g. In Design, Active, Rejected, Retired)
   * @return status
  **/
  @ApiModelProperty(value = "Lifecycle status of the specification (e.g. In Design, Active, Rejected, Retired)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyPrivacyProfileSpecification version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the specification, in case it is desired to maintain multiple versions of profile specifications
   * @return version
  **/
  @ApiModelProperty(value = "The version of the specification, in case it is desired to maintain multiple versions of profile specifications")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PartyPrivacyProfileSpecification applicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
    return this;
  }

  public PartyPrivacyProfileSpecification addApplicableRoleItem(PartyPrivacyRoleSpecification applicableRoleItem) {
    if (this.applicableRole == null) {
      this.applicableRole = new ArrayList<PartyPrivacyRoleSpecification>();
    }
    this.applicableRole.add(applicableRoleItem);
    return this;
  }

  /**
   * A list of roles to which this specification can apply. For example: Shop Agent, Call Center Agent.
   * @return applicableRole
  **/
  @ApiModelProperty(value = "A list of roles to which this specification can apply. For example: Shop Agent, Call Center Agent.")

  @Valid

  public List<PartyPrivacyRoleSpecification> getApplicableRole() {
    return applicableRole;
  }

  public void setApplicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
  }

  public PartyPrivacyProfileSpecification partyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
    return this;
  }

  public PartyPrivacyProfileSpecification addPartyPrivacyProfileSpecCharacteristicItem(PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecCharacteristicItem) {
    if (this.partyPrivacyProfileSpecCharacteristic == null) {
      this.partyPrivacyProfileSpecCharacteristic = new ArrayList<PartyPrivacyProfileSpecificationCharacteristic>();
    }
    this.partyPrivacyProfileSpecCharacteristic.add(partyPrivacyProfileSpecCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated
   * @return partyPrivacyProfileSpecCharacteristic
  **/
  @ApiModelProperty(value = "List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated")

  @Valid

  public List<PartyPrivacyProfileSpecificationCharacteristic> getPartyPrivacyProfileSpecCharacteristic() {
    return partyPrivacyProfileSpecCharacteristic;
  }

  public void setPartyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
  }

  public PartyPrivacyProfileSpecification productOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  public PartyPrivacyProfileSpecification addProductOfferingItem(ProductOfferingRef productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<ProductOfferingRef>();
    }
    this.productOffering.add(productOfferingItem);
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductOfferingRef> getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
  }

  public PartyPrivacyProfileSpecification relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyPrivacyProfileSpecification addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties or party roles involved in the definition or management of the specification
   * @return relatedParty
  **/
  @ApiModelProperty(value = "List of parties or party roles involved in the definition or management of the specification")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PartyPrivacyProfileSpecification validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which the specification is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which the specification is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PartyPrivacyProfileSpecification baseType(String baseType) {
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

  public PartyPrivacyProfileSpecification schemaLocation(String schemaLocation) {
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

  public PartyPrivacyProfileSpecification type(String type) {
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
    PartyPrivacyProfileSpecification partyPrivacyProfileSpecification = (PartyPrivacyProfileSpecification) o;
    return Objects.equals(this.id, partyPrivacyProfileSpecification.id) &&
        Objects.equals(this.href, partyPrivacyProfileSpecification.href) &&
        Objects.equals(this.description, partyPrivacyProfileSpecification.description) &&
        Objects.equals(this.lastUpdate, partyPrivacyProfileSpecification.lastUpdate) &&
        Objects.equals(this.name, partyPrivacyProfileSpecification.name) &&
        Objects.equals(this.status, partyPrivacyProfileSpecification.status) &&
        Objects.equals(this.version, partyPrivacyProfileSpecification.version) &&
        Objects.equals(this.applicableRole, partyPrivacyProfileSpecification.applicableRole) &&
        Objects.equals(this.partyPrivacyProfileSpecCharacteristic, partyPrivacyProfileSpecification.partyPrivacyProfileSpecCharacteristic) &&
        Objects.equals(this.productOffering, partyPrivacyProfileSpecification.productOffering) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileSpecification.relatedParty) &&
        Objects.equals(this.validFor, partyPrivacyProfileSpecification.validFor) &&
        Objects.equals(this.baseType, partyPrivacyProfileSpecification.baseType) &&
        Objects.equals(this.schemaLocation, partyPrivacyProfileSpecification.schemaLocation) &&
        Objects.equals(this.type, partyPrivacyProfileSpecification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, lastUpdate, name, status, version, applicableRole, partyPrivacyProfileSpecCharacteristic, productOffering, relatedParty, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    applicableRole: ").append(toIndentedString(applicableRole)).append("\n");
    sb.append("    partyPrivacyProfileSpecCharacteristic: ").append(toIndentedString(partyPrivacyProfileSpecCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

