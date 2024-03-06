package com.duffel.stays.response;

import com.duffel.model.Data;
import com.duffel.stays.model.Address;
import com.duffel.stays.model.GeographicCoordinates;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents information on the accommodation's location.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class LocationResponse extends Data<LocationResponse> {

    /**
     * The accommodation's address.
     */
    @JsonProperty("address")
    private Address address;

    /**
     * The exact latitude-longitude position of the accommodation.
     * Useful for map views.
     */
    @JsonProperty("geographic_coordinates")
    private GeographicCoordinates geographicCoordinates;
}
