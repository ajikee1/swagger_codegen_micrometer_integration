package io.tej.SwaggerCodgen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Count
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-12T12:31:21.933472-04:00[America/New_York]")

public class Count   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("baseUnit")
  private String baseUnit;

  @JsonProperty("description")
  private String description;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = new ArrayList<>();

  public Count name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Count baseUnit(String baseUnit) {
    this.baseUnit = baseUnit;
    return this;
  }

  /**
   * Get baseUnit
   * @return baseUnit
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBaseUnit() {
    return baseUnit;
  }

  public void setBaseUnit(String baseUnit) {
    this.baseUnit = baseUnit;
  }

  public Count description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Count tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Count addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Count count = (Count) o;
    return Objects.equals(this.name, count.name) &&
        Objects.equals(this.baseUnit, count.baseUnit) &&
        Objects.equals(this.description, count.description) &&
        Objects.equals(this.tags, count.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, baseUnit, description, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Count {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseUnit: ").append(toIndentedString(baseUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

