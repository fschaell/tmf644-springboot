package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A business participant that is responsible for approving the agreement.
 */
@ApiModel(description = "A business participant that is responsible for approving the agreement.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class AgreementAuthorization   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("signatureRepresentation")
  private String signatureRepresentation = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public AgreementAuthorization date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date associated with the authorization state.
   * @return date
  **/
  @ApiModelProperty(value = "The date associated with the authorization state.")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public AgreementAuthorization signatureRepresentation(String signatureRepresentation) {
    this.signatureRepresentation = signatureRepresentation;
    return this;
  }

  /**
   * Indication that represents whether the signature is a physical paper signature or a digital signature.
   * @return signatureRepresentation
  **/
  @ApiModelProperty(value = "Indication that represents whether the signature is a physical paper signature or a digital signature.")


  public String getSignatureRepresentation() {
    return signatureRepresentation;
  }

  public void setSignatureRepresentation(String signatureRepresentation) {
    this.signatureRepresentation = signatureRepresentation;
  }

  public AgreementAuthorization state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Current status of the authorization, for example in process, approved, rejected.
   * @return state
  **/
  @ApiModelProperty(value = "Current status of the authorization, for example in process, approved, rejected.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AgreementAuthorization baseType(String baseType) {
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

  public AgreementAuthorization schemaLocation(String schemaLocation) {
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

  public AgreementAuthorization type(String type) {
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
    AgreementAuthorization agreementAuthorization = (AgreementAuthorization) o;
    return Objects.equals(this.date, agreementAuthorization.date) &&
        Objects.equals(this.signatureRepresentation, agreementAuthorization.signatureRepresentation) &&
        Objects.equals(this.state, agreementAuthorization.state) &&
        Objects.equals(this.baseType, agreementAuthorization.baseType) &&
        Objects.equals(this.schemaLocation, agreementAuthorization.schemaLocation) &&
        Objects.equals(this.type, agreementAuthorization.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, signatureRepresentation, state, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAuthorization {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    signatureRepresentation: ").append(toIndentedString(signatureRepresentation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

