package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Represents the conditions or policies that apply to the rate.
 * The information provided should be treated as mandatory and displayed to the guest during and after the booking process.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Condition extends Data<Condition> {

    /**
     * The condition title.
     * Example: "Parking"
     */
    @JsonProperty("title")
    private String title;

    /**
     * One or more paragraphs that outline policy, amenity or refundability conditions for the rate.
     * Take note that this may contain links expressed as HTML tags.
     * Example: "Public parking is available nearby for £15 per day"
     */
    @JsonProperty("description")
    private String description;
}
