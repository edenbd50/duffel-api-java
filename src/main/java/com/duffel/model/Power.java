package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * If power (AC and/or USB) is available, information on what is available.
 */
@Getter
@EqualsAndHashCode
@ToString
public class Power {

    /**
     * Whether there is power available or not in this cabin.
     * Example: "true".
     */
    @JsonProperty("available")
    private boolean available;
}
