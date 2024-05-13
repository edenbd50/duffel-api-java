package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The key collection details for the accommodation.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class KeyCollection extends Data<KeyCollection> {

    /**
     * The key collection instructions for the accommodation.
     * Example: "Please collect the keys from accommodation's reception."
     */
    @JsonProperty("instructions")
    private String instructions;
}
