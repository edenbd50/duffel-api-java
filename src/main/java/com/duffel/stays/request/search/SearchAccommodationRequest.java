package com.duffel.stays.request.search;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Search for accommodation
 * Returns all available accommodations that match your search criteria.
 * You can search either by location or accommodation, but not both.
 * Each accommodation is returned with information on the cheapest available rate.
 * The room and rate information is not guaranteed to be complete or accurate
 * on this endpoint and can vary across different accommodations.
 * cheapest_rate_total_amount will always be accurate.
 *
 * Stays is only available today for customers with closed user groups,
 * i.e. only accessible to registered and authenticated users.
 * If you want to sell to the public, please contact stays@duffel.com.
 *
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class SearchAccommodationRequest extends Data<SearchAccommodationRequest> {

    /**
     * The accommodation to search for. You must use either this object or the location object in your request.
     */
    @JsonProperty("accommodation")
    private AccommodationSearch accommodation;

    /**
     * The number of adult guests travelling.
     * Example: 2
     */
    @JsonProperty("adults")
    private int adults;

    /**
     * The ISO 8601 date on which the guest wants to check in.
     * Example: "2023-06-04"
     */
    @JsonProperty("check_in_date")
    private String checkInDate;

    /**
     * The ISO 8601 date on which the guest wants to check out.
     * Example: "2023-06-07"
     */
    @JsonProperty("check_out_date")
    private String checkOutDate;

    /**
     * Descriptor for an area to search for a stay. Accepts latitude-longitude paired with radius.
     * You must use either this object or the accommodation object in your request.
     */
    @JsonProperty("location")
    private LocationSearch location;

    /**
     * The number of rooms required.
     * Example: 1
     */
    @JsonProperty("rooms")
    private int rooms;
}
