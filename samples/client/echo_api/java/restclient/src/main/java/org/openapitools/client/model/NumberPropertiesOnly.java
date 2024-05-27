/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NumberPropertiesOnly
 */
@JsonPropertyOrder({
  NumberPropertiesOnly.JSON_PROPERTY_NUMBER,
  NumberPropertiesOnly.JSON_PROPERTY_FLOAT,
  NumberPropertiesOnly.JSON_PROPERTY_DOUBLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class NumberPropertiesOnly {
  public static final String JSON_PROPERTY_NUMBER = "number";
  private BigDecimal number;

  public static final String JSON_PROPERTY_FLOAT = "float";
  private Float _float;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  private Double _double;

  public NumberPropertiesOnly() {
  }

  public NumberPropertiesOnly number(BigDecimal number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public NumberPropertiesOnly _float(Float _float) {
    
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * @return _float
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getFloat() {
    return _float;
  }


  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloat(Float _float) {
    this._float = _float;
  }

  public NumberPropertiesOnly _double(Double _double) {
    
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * minimum: 0.8
   * maximum: 50.2
   * @return _double
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDouble() {
    return _double;
  }


  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDouble(Double _double) {
    this._double = _double;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberPropertiesOnly numberPropertiesOnly = (NumberPropertiesOnly) o;
    return Objects.equals(this.number, numberPropertiesOnly.number) &&
        Objects.equals(this._float, numberPropertiesOnly._float) &&
        Objects.equals(this._double, numberPropertiesOnly._double);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, _float, _double);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberPropertiesOnly {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
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

