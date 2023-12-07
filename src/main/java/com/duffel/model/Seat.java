package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Information on the standard seat in this cabin class. Exceptions may apply, such as on exit rows.
 */
@Getter
@EqualsAndHashCode
@ToString
public class Seat {

    /**
     * The distance from a point on a seat to the seat front/behind it, in inches, or "n/a" if not available.
     * Example: "32".
     */
    @JsonProperty("pitch")
    private String pitch;

    /**
     * The available legroom for the passenger.
     * Possible values: "less", "more", "standard", or "n/a".
     */
    @JsonProperty("legroom")
    private LegroomType legroom;
}
