package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PartyPrivacyAgreement;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyAgreementCreateEventPayload   {
  @JsonProperty("partyPrivacyAgreement")
  private PartyPrivacyAgreement partyPrivacyAgreement = null;

  public PartyPrivacyAgreementCreateEventPayload partyPrivacyAgreement(PartyPrivacyAgreement partyPrivacyAgreement) {
    this.partyPrivacyAgreement = partyPrivacyAgreement;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return partyPrivacyAgreement
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public PartyPrivacyAgreement getPartyPrivacyAgreement() {
    return partyPrivacyAgreement;
  }

  public void setPartyPrivacyAgreement(PartyPrivacyAgreement partyPrivacyAgreement) {
    this.partyPrivacyAgreement = partyPrivacyAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyAgreementCreateEventPayload partyPrivacyAgreementCreateEventPayload = (PartyPrivacyAgreementCreateEventPayload) o;
    return Objects.equals(this.partyPrivacyAgreement, partyPrivacyAgreementCreateEventPayload.partyPrivacyAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementCreateEventPayload {\n");
    
    sb.append("    partyPrivacyAgreement: ").append(toIndentedString(partyPrivacyAgreement)).append("\n");
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

