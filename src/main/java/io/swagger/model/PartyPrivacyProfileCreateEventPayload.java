package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PartyPrivacyProfile;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

public class PartyPrivacyProfileCreateEventPayload   {
  @JsonProperty("partyPrivacyProfile")
  private PartyPrivacyProfile partyPrivacyProfile = null;

  public PartyPrivacyProfileCreateEventPayload partyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return partyPrivacyProfile
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public PartyPrivacyProfile getPartyPrivacyProfile() {
    return partyPrivacyProfile;
  }

  public void setPartyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileCreateEventPayload partyPrivacyProfileCreateEventPayload = (PartyPrivacyProfileCreateEventPayload) o;
    return Objects.equals(this.partyPrivacyProfile, partyPrivacyProfileCreateEventPayload.partyPrivacyProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCreateEventPayload {\n");
    
    sb.append("    partyPrivacyProfile: ").append(toIndentedString(partyPrivacyProfile)).append("\n");
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

