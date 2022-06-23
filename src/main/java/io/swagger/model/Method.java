package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MashTemp;
import io.swagger.model.Temp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Method
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")


public class Method   {
  @JsonProperty("mash-temps")
  private MashTemp mashTemps = null;

  @JsonProperty("fermentation")
  private Temp fermentation = null;

  @JsonProperty("twist")
  private String twist = null;

  public Method mashTemps(MashTemp mashTemps) {
    this.mashTemps = mashTemps;
    return this;
  }

  /**
   * Get mashTemps
   * @return mashTemps
   **/
  @Schema(description = "")
  
    @Valid
    public MashTemp getMashTemps() {
    return mashTemps;
  }

  public void setMashTemps(MashTemp mashTemps) {
    this.mashTemps = mashTemps;
  }

  public Method fermentation(Temp fermentation) {
    this.fermentation = fermentation;
    return this;
  }

  /**
   * Get fermentation
   * @return fermentation
   **/
  @Schema(description = "")
  
    @Valid
    public Temp getFermentation() {
    return fermentation;
  }

  public void setFermentation(Temp fermentation) {
    this.fermentation = fermentation;
  }

  public Method twist(String twist) {
    this.twist = twist;
    return this;
  }

  /**
   * Get twist
   * @return twist
   **/
  @Schema(description = "")
  
  @Size(max=255)   public String getTwist() {
    return twist;
  }

  public void setTwist(String twist) {
    this.twist = twist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Method method = (Method) o;
    return Objects.equals(this.mashTemps, method.mashTemps) &&
        Objects.equals(this.fermentation, method.fermentation) &&
        Objects.equals(this.twist, method.twist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mashTemps, fermentation, twist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Method {\n");
    
    sb.append("    mashTemps: ").append(toIndentedString(mashTemps)).append("\n");
    sb.append("    fermentation: ").append(toIndentedString(fermentation)).append("\n");
    sb.append("    twist: ").append(toIndentedString(twist)).append("\n");
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
