package com.duffel.model.response.order.metadata;

import com.duffel.model.response.MealType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


/**
 * Meal specifications.
 */
@EqualsAndHashCode
@Getter
@ToString
public class MealMetadata implements Metadata {

    /**
     * An object containing metadata about the service
     */
    @JsonProperty("meal")
    private MealType meal;


}
