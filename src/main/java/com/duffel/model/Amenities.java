package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * The amenities specific to this cabin class on this plane.
 */
@Getter
@EqualsAndHashCode
@ToString
public class Amenities {

    /**
     * If power (AC and/or USB) is available, information on what is available.
     */
    @JsonProperty("power")
    private Power power;

    /**
     * Information on the standard seat in this cabin class. Exceptions may apply, such as on exit rows.
     */
    @JsonProperty("seat")
    private Seat seat;

    /**
     * If Wi-Fi is available, information on its cost, availability, etc.
     */
    @JsonProperty("wifi")
    private WiFi wifi;
}
