package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Ingredients;
import io.swagger.model.Method;
import io.swagger.model.Volume;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")


public class Beer   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tagline")
  private String tagline = null;

  @JsonProperty("firs_brewed")
  private String firsBrewed = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("abv")
  private Float abv = null;

  @JsonProperty("ibu")
  private Float ibu = null;

  @JsonProperty("target_fg")
  private Float targetFg = null;

  @JsonProperty("target_og")
  private Float targetOg = null;

  @JsonProperty("ebc")
  private Float ebc = null;

  @JsonProperty("srm")
  private Float srm = null;

  @JsonProperty("ph")
  private Float ph = null;

  @JsonProperty("attenuation_level")
  private Float attenuationLevel = null;

  @JsonProperty("volume")
  private Volume volume = null;

  @JsonProperty("boil_volume")
  private Volume boilVolume = null;

  @JsonProperty("method")
  private Method method = null;

  @JsonProperty("ingredients")
  private Ingredients ingredients = null;

  public Beer id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Beer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Buzz", description = "")
  
  @Size(max=100)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Beer tagline(String tagline) {
    this.tagline = tagline;
    return this;
  }

  /**
   * Get tagline
   * @return tagline
   **/
  @Schema(example = "A real Bitter Experience.", description = "")
  
  @Size(max=255)   public String getTagline() {
    return tagline;
  }

  public void setTagline(String tagline) {
    this.tagline = tagline;
  }

  public Beer firsBrewed(String firsBrewed) {
    this.firsBrewed = firsBrewed;
    return this;
  }

  /**
   * Get firsBrewed
   * @return firsBrewed
   **/
  @Schema(example = "09/2007", description = "")
  
  @Pattern(regexp="[0-1][0-9]/[1-2][0-9]{3}") @Size(min=7,max=7)   public String getFirsBrewed() {
    return firsBrewed;
  }

  public void setFirsBrewed(String firsBrewed) {
    this.firsBrewed = firsBrewed;
  }

  public Beer description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "\"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.\" ", description = "")
  
  @Size(max=1000)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Beer imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   **/
  @Schema(example = "https://images.punkapi.com/v2/keg.png", description = "")
  
  @Size(max=1000)   public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Beer abv(Float abv) {
    this.abv = abv;
    return this;
  }

  /**
   * Get abv
   * @return abv
   **/
  @Schema(example = "4.5", description = "")
  
    public Float getAbv() {
    return abv;
  }

  public void setAbv(Float abv) {
    this.abv = abv;
  }

  public Beer ibu(Float ibu) {
    this.ibu = ibu;
    return this;
  }

  /**
   * Get ibu
   * @return ibu
   **/
  @Schema(example = "60", description = "")
  
    public Float getIbu() {
    return ibu;
  }

  public void setIbu(Float ibu) {
    this.ibu = ibu;
  }

  public Beer targetFg(Float targetFg) {
    this.targetFg = targetFg;
    return this;
  }

  /**
   * Get targetFg
   * @return targetFg
   **/
  @Schema(example = "1010", description = "")
  
    public Float getTargetFg() {
    return targetFg;
  }

  public void setTargetFg(Float targetFg) {
    this.targetFg = targetFg;
  }

  public Beer targetOg(Float targetOg) {
    this.targetOg = targetOg;
    return this;
  }

  /**
   * Get targetOg
   * @return targetOg
   **/
  @Schema(example = "1044", description = "")
  
    public Float getTargetOg() {
    return targetOg;
  }

  public void setTargetOg(Float targetOg) {
    this.targetOg = targetOg;
  }

  public Beer ebc(Float ebc) {
    this.ebc = ebc;
    return this;
  }

  /**
   * Get ebc
   * @return ebc
   **/
  @Schema(example = "20", description = "")
  
    public Float getEbc() {
    return ebc;
  }

  public void setEbc(Float ebc) {
    this.ebc = ebc;
  }

  public Beer srm(Float srm) {
    this.srm = srm;
    return this;
  }

  /**
   * Get srm
   * @return srm
   **/
  @Schema(example = "10", description = "")
  
    public Float getSrm() {
    return srm;
  }

  public void setSrm(Float srm) {
    this.srm = srm;
  }

  public Beer ph(Float ph) {
    this.ph = ph;
    return this;
  }

  /**
   * Get ph
   * @return ph
   **/
  @Schema(example = "4.4", description = "")
  
    public Float getPh() {
    return ph;
  }

  public void setPh(Float ph) {
    this.ph = ph;
  }

  public Beer attenuationLevel(Float attenuationLevel) {
    this.attenuationLevel = attenuationLevel;
    return this;
  }

  /**
   * Get attenuationLevel
   * @return attenuationLevel
   **/
  @Schema(example = "75", description = "")
  
    public Float getAttenuationLevel() {
    return attenuationLevel;
  }

  public void setAttenuationLevel(Float attenuationLevel) {
    this.attenuationLevel = attenuationLevel;
  }

  public Beer volume(Volume volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
   **/
  @Schema(description = "")
  
    @Valid
    public Volume getVolume() {
    return volume;
  }

  public void setVolume(Volume volume) {
    this.volume = volume;
  }

  public Beer boilVolume(Volume boilVolume) {
    this.boilVolume = boilVolume;
    return this;
  }

  /**
   * Get boilVolume
   * @return boilVolume
   **/
  @Schema(description = "")
  
    @Valid
    public Volume getBoilVolume() {
    return boilVolume;
  }

  public void setBoilVolume(Volume boilVolume) {
    this.boilVolume = boilVolume;
  }

  public Beer method(Method method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   **/
  @Schema(description = "")
  
    @Valid
    public Method getMethod() {
    return method;
  }

  public void setMethod(Method method) {
    this.method = method;
  }

  public Beer ingredients(Ingredients ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  /**
   * Get ingredients
   * @return ingredients
   **/
  @Schema(description = "")
  
    @Valid
    public Ingredients getIngredients() {
    return ingredients;
  }

  public void setIngredients(Ingredients ingredients) {
    this.ingredients = ingredients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beer beer = (Beer) o;
    return Objects.equals(this.id, beer.id) &&
        Objects.equals(this.name, beer.name) &&
        Objects.equals(this.tagline, beer.tagline) &&
        Objects.equals(this.firsBrewed, beer.firsBrewed) &&
        Objects.equals(this.description, beer.description) &&
        Objects.equals(this.imageUrl, beer.imageUrl) &&
        Objects.equals(this.abv, beer.abv) &&
        Objects.equals(this.ibu, beer.ibu) &&
        Objects.equals(this.targetFg, beer.targetFg) &&
        Objects.equals(this.targetOg, beer.targetOg) &&
        Objects.equals(this.ebc, beer.ebc) &&
        Objects.equals(this.srm, beer.srm) &&
        Objects.equals(this.ph, beer.ph) &&
        Objects.equals(this.attenuationLevel, beer.attenuationLevel) &&
        Objects.equals(this.volume, beer.volume) &&
        Objects.equals(this.boilVolume, beer.boilVolume) &&
        Objects.equals(this.method, beer.method) &&
        Objects.equals(this.ingredients, beer.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tagline, firsBrewed, description, imageUrl, abv, ibu, targetFg, targetOg, ebc, srm, ph, attenuationLevel, volume, boilVolume, method, ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
    sb.append("    firsBrewed: ").append(toIndentedString(firsBrewed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    abv: ").append(toIndentedString(abv)).append("\n");
    sb.append("    ibu: ").append(toIndentedString(ibu)).append("\n");
    sb.append("    targetFg: ").append(toIndentedString(targetFg)).append("\n");
    sb.append("    targetOg: ").append(toIndentedString(targetOg)).append("\n");
    sb.append("    ebc: ").append(toIndentedString(ebc)).append("\n");
    sb.append("    srm: ").append(toIndentedString(srm)).append("\n");
    sb.append("    ph: ").append(toIndentedString(ph)).append("\n");
    sb.append("    attenuationLevel: ").append(toIndentedString(attenuationLevel)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    boilVolume: ").append(toIndentedString(boilVolume)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
