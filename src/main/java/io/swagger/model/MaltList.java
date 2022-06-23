package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Malt;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MaltList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")


public class MaltList   {
  @JsonProperty("malts")
  @Valid
  private List<Malt> malts = null;

  public MaltList malts(List<Malt> malts) {
    this.malts = malts;
    return this;
  }

  public MaltList addMaltsItem(Malt maltsItem) {
    if (this.malts == null) {
      this.malts = new ArrayList<Malt>();
    }
    this.malts.add(maltsItem);
    return this;
  }

  /**
   * Get malts
   * @return malts
   **/
  @Schema(description = "")
      @Valid
    public List<Malt> getMalts() {
    return malts;
  }

  public void setMalts(List<Malt> malts) {
    this.malts = malts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaltList maltList = (MaltList) o;
    return Objects.equals(this.malts, maltList.malts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(malts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaltList {\n");
    
    sb.append("    malts: ").append(toIndentedString(malts)).append("\n");
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
