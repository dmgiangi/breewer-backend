package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Hop
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")


public class Hop   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("amount")
  private Amount amount = null;

  @JsonProperty("add")
  private String add = null;

  /**
   * Gets or Sets attribute
   */
  public enum AttributeEnum {
    TWIST("Twist"),
    
    BITTERING("Bittering"),
    
    BITTER("Bitter"),
    
    WOOD_AGEING("Wood Ageing"),
    
    AROMA("Aroma"),
    
    FLAVOUR("Flavour"),
    
    AROMA_BITTER("Aroma / Bitter");

    private String value;

    AttributeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AttributeEnum fromValue(String text) {
      for (AttributeEnum b : AttributeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("attribute")
  private AttributeEnum attribute = null;

  public Hop name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Fuggles", description = "")
  
  @Size(max=50)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hop amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    @Valid
    public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Hop add(String add) {
    this.add = add;
    return this;
  }

  /**
   * Get add
   * @return add
   **/
  @Schema(example = "start", description = "")
  
  @Size(max=50)   public String getAdd() {
    return add;
  }

  public void setAdd(String add) {
    this.add = add;
  }

  public Hop attribute(AttributeEnum attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
   **/
  @Schema(example = "Bitter", description = "")
  
  @Size(max=50)   public AttributeEnum getAttribute() {
    return attribute;
  }

  public void setAttribute(AttributeEnum attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hop hop = (Hop) o;
    return Objects.equals(this.name, hop.name) &&
        Objects.equals(this.amount, hop.amount) &&
        Objects.equals(this.add, hop.add) &&
        Objects.equals(this.attribute, hop.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount, add, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hop {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
