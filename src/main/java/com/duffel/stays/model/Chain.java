package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * Represents the chain or group brand the accommodation is a member of.
 */
@Getter
@Setter
@ToString
public class Chain {

    /**
     * The accommodation chain’s or group brand name.
     * Example: "The Ritz-Carlton"
     */
    @JsonProperty("name")
    private String name;
}