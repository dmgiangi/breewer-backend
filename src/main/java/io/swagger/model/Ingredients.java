package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.HopList;
import io.swagger.model.MaltList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ingredients
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")


public class Ingredients   {
  @JsonProperty("malts")
  private MaltList malts = null;

  @JsonProperty("hops")
  private HopList hops = null;

  @JsonProperty("yeast")
  private String yeast = null;

  public Ingredients malts(MaltList malts) {
    this.malts = malts;
    return this;
  }

  /**
   * Get malts
   * @return malts
   **/
  @Schema(description = "")
  
    @Valid
    public MaltList getMalts() {
    return malts;
  }

  public void setMalts(MaltList malts) {
    this.malts = malts;
  }

  public Ingredients hops(HopList hops) {
    this.hops = hops;
    return this;
  }

  /**
   * Get hops
   * @return hops
   **/
  @Schema(description = "")
  
    @Valid
    public HopList getHops() {
    return hops;
  }

  public void setHops(HopList hops) {
    this.hops = hops;
  }

  public Ingredients yeast(String yeast) {
    this.yeast = yeast;
    return this;
  }

  /**
   * Get yeast
   * @return yeast
   **/
  @Schema(example = "Wyeast 1056 - American Ale™", description = "")
  
  @Size(max=100)   public String getYeast() {
    return yeast;
  }

  public void setYeast(String yeast) {
    this.yeast = yeast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ingredients ingredients = (Ingredients) o;
    return Objects.equals(this.malts, ingredients.malts) &&
        Objects.equals(this.hops, ingredients.hops) &&
        Objects.equals(this.yeast, ingredients.yeast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(malts, hops, yeast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ingredients {\n");
    
    sb.append("    malts: ").append(toIndentedString(malts)).append("\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
    sb.append("    yeast: ").append(toIndentedString(yeast)).append("\n");
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
