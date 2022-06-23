package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Temp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MashtempInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")


public class MashtempInner   {
  @JsonProperty("temp")
  private Temp temp = null;

  @JsonProperty("duration")
  private Integer duration = null;

  public MashtempInner temp(Temp temp) {
    this.temp = temp;
    return this;
  }

  /**
   * Get temp
   * @return temp
   **/
  @Schema(description = "")
  
    @Valid
    public Temp getTemp() {
    return temp;
  }

  public void setTemp(Temp temp) {
    this.temp = temp;
  }

  public MashtempInner duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(description = "")
  
    public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MashtempInner mashtempInner = (MashtempInner) o;
    return Objects.equals(this.temp, mashtempInner.temp) &&
        Objects.equals(this.duration, mashtempInner.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temp, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MashtempInner {\n");
    
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
