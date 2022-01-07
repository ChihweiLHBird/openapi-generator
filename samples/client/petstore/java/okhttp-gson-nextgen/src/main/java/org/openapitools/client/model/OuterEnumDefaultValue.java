/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OuterEnumDefaultValue
 */
@JsonAdapter(OuterEnumDefaultValue.Adapter.class)
public enum OuterEnumDefaultValue {
  
  PLACED("placed"),
  
  APPROVED("approved"),
  
  DELIVERED("delivered");

  private String value;

  OuterEnumDefaultValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OuterEnumDefaultValue fromValue(String value) {
    for (OuterEnumDefaultValue b : OuterEnumDefaultValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OuterEnumDefaultValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final OuterEnumDefaultValue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OuterEnumDefaultValue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OuterEnumDefaultValue.fromValue(value);
    }
  }
}
