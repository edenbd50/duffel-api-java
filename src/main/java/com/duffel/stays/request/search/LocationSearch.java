package com.duffel.stays.request.search;

import com.duffel.model.Data;
import com.duffel.stays.model.GeographicCoordinates;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * Descriptor for an area to search for a stay.
 * Accepts latitude-longitude paired with radius.
 * You must use either this object or the accommodation object in your request
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class LocationSearch extends Data<LocationSearch> {

    /**
     * The center of the search criteria's radius, represented by an object containing latitude and longitude.
     */
    @JsonProperty("geographic_coordinates")
    private GeographicCoordinates geographicCoordinates;

    /**
     * The search area's extent from the provided coordinates in kilometers.
     * Can only be between 1 and 100. Default of 5km is subject to change.
     * Example: 5
     * Default value: 5
     */
    @JsonProperty("radius")
    private int radius;

}
