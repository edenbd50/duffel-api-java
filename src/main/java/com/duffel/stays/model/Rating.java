package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents ratings given to an accommodation by a rating source.
 * These are commonly represented as "stars". In Duffel Stays, they have a 1-5 scale.
 * They can come from multiple sources, such as "priceline", "aaa", or "northstar".
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Rating extends Data<Rating> {

    /**
     * The source of this rating.
     * Possible values: "priceline", "aaa", or "northstar"
     */
    @JsonProperty("source")
    private String source;

    /**
     * The value of this rating.
     * Possible values: 1, 2, 3, 4, or 5
     */
    @JsonProperty("value")
    private double value;
}
