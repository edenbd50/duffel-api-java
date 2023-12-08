package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents the exact latitude-longitude position of the accommodation.
 * Useful for map views.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class GeographicCoordinates extends Data<GeographicCoordinates> {

    /**
     * The latitude position of the accommodation represented in Decimal degrees
     * with 6 decimal points with a range between -90° and 90°.
     * Example: 51.5071
     */
    @JsonProperty("latitude")
    private double latitude;

    /**
     * The longitude position of the accommodation represented in Decimal degrees
     * with 6 decimal points with a range between -180° and 180°.
     * Example: -0.1416
     */
    @JsonProperty("longitude")
    private double longitude;
}
