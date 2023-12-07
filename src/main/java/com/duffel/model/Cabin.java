package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Data about the cabin that the passenger will be flying in for this segment.
 */
@Getter
@EqualsAndHashCode
@ToString
public class Cabin {

    /**
     * The name of the cabin class.
     * Possible values: "first", "business", "premium_economy", or "economy".
     */
    @JsonProperty("name")
    private CabinClass name;

    /**
     * The name that the marketing carrier uses to market this cabin class.
     * Example: "Economy Basic".
     */
    @JsonProperty("marketing_name")
    private String marketingName;

    /**
     * The amenities specific to this cabin class on this plane.
     */
    @JsonProperty("amenities")
    private Amenities amenities;
}
