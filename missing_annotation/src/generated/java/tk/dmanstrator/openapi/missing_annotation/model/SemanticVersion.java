package tk.dmanstrator.openapi.missing_annotation.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SemanticVersion
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class SemanticVersion implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer major;

  private Integer minor;

  private Integer patch;

  public SemanticVersion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SemanticVersion(Integer major, Integer minor, Integer patch) {
    this.major = major;
    this.minor = minor;
    this.patch = patch;
  }

  public SemanticVersion major(Integer major) {
    this.major = major;
    return this;
  }

  /**
   * Get major
   * @return major
   */
  @NotNull 
  @Schema(name = "major", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("major")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public SemanticVersion minor(Integer minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Get minor
   * @return minor
   */
  @NotNull 
  @Schema(name = "minor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("minor")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public SemanticVersion patch(Integer patch) {
    this.patch = patch;
    return this;
  }

  /**
   * Get patch
   * @return patch
   */
  @NotNull 
  @Schema(name = "patch", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("patch")
  public Integer getPatch() {
    return patch;
  }

  public void setPatch(Integer patch) {
    this.patch = patch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticVersion semanticVersion = (SemanticVersion) o;
    return Objects.equals(this.major, semanticVersion.major) &&
        Objects.equals(this.minor, semanticVersion.minor) &&
        Objects.equals(this.patch, semanticVersion.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, patch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticVersion {\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

