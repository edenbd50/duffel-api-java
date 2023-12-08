package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents the amenities for an accommodation.
 * These amenities aid guests in identifying the accommodation that suits their needs and are intended for programmatic use to support filtering or promoting specific accommodation attributes.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Amenity extends Data<Amenity> {

    /**
     * The amenity type. NOTE: wi-fi has now been superseded by wifi.
     * Possible values: "parking", "gym", "wifi", "24_hour_front_desk", "accessibility_hearing",
     * "accessibility_mobility", "adult_only", "business_centre", "cash_machine",
     * "childcare_service", "concierge", "laundry", "lounge", "pets_allowed", "pool",
     * "restaurant", "room_service", or "spa"
     */
    @JsonProperty("type")
    private String type;

    /**
     * Label-friendly description of the amenity type.
     * Example: "Parking"
     */
    @JsonProperty("description")
    private String description;
}
