package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgreementSpecificationRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A PartyPrivacyRoleSpecification represents a specification of a role defined in the context of a given privacy spesification, such as Customer, User.
 */
@ApiModel(description = "A PartyPrivacyRoleSpecification represents a specification of a role defined in the context of a given privacy spesification, such as Customer, User.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyRoleSpecification   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("agreementSpecification")
  @Valid
  private List<AgreementSpecificationRef> agreementSpecification = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public PartyPrivacyRoleSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explanatory text documenting the role specification
   * @return description
  **/
  @ApiModelProperty(value = "An explanatory text documenting the role specification")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyRoleSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the role specification. This name uniquely identifies the role specification
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the role specification. This name uniquely identifies the role specification")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyRoleSpecification agreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  public PartyPrivacyRoleSpecification addAgreementSpecificationItem(AgreementSpecificationRef agreementSpecificationItem) {
    if (this.agreementSpecification == null) {
      this.agreementSpecification = new ArrayList<AgreementSpecificationRef>();
    }
    this.agreementSpecification.add(agreementSpecificationItem);
    return this;
  }

  /**
   * Get agreementSpecification
   * @return agreementSpecification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementSpecificationRef> getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  public PartyPrivacyRoleSpecification baseType(String baseType) {
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

  public PartyPrivacyRoleSpecification schemaLocation(String schemaLocation) {
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

  public PartyPrivacyRoleSpecification type(String type) {
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
    PartyPrivacyRoleSpecification partyPrivacyRoleSpecification = (PartyPrivacyRoleSpecification) o;
    return Objects.equals(this.description, partyPrivacyRoleSpecification.description) &&
        Objects.equals(this.name, partyPrivacyRoleSpecification.name) &&
        Objects.equals(this.agreementSpecification, partyPrivacyRoleSpecification.agreementSpecification) &&
        Objects.equals(this.baseType, partyPrivacyRoleSpecification.baseType) &&
        Objects.equals(this.schemaLocation, partyPrivacyRoleSpecification.schemaLocation) &&
        Objects.equals(this.type, partyPrivacyRoleSpecification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, agreementSpecification, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyRoleSpecification {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
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

