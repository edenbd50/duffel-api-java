package com.duffel.stays.response.search_result;

import com.duffel.model.Data;
import com.duffel.stays.model.Accommodation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a hotel result in the search stays rates response.
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@Setter
@ToString
public class FetchRatesResponse extends Data<FetchRatesResponse> {

    /**
     * The ID for this search result.
     * Example: "ssr_0000ASVBuJVLdmqtZDJ4ca"
     */
    @JsonProperty("id")
    private String id;

    /**
     * The ISO 8601 date on which the guest wants to check out.
     * Example: "2023-05-28"
     */
    @JsonProperty("check_out_date")
    private String checkOutDate;

    /**
     * The ISO 8601 date on which the guest wants to check in.
     * Example: "2023-05-24"
     */
    @JsonProperty("check_in_date")
    private String checkInDate;

    /**
     * The number of adult guests travelling
     * Example: 2
     */
    @JsonProperty("adults")
    private int adults;
    /**
     * The number of rooms required
     * Example: 1
     */
    @JsonProperty("rooms")
    private int rooms;

    /**
     * The accommodation associated with the search result.
     */
    @JsonProperty("accommodation")
    private Accommodation accommodation;

    /**
     * The currency for cheapest_rate_total_amount for this accommodation, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("cheapest_rate_currency")
    private String cheapestRateCurrency;

    /**
     * The cheapest_rate_total_amount is for search result display purposes. It is equivalent to the cheapest rate total_amount for the cheapest room at this accommodation.
     * The rate amount is a best effort computation during the time a search is made, and can change when fetching the rates.
     * It is not guaranteed to be accurate. It will always show a value, even when rooms data is empty in the initial Search response.
     * Example: "799.00"
     */
    @JsonProperty("cheapest_rate_total_amount")
    private String cheapestRateTotalAmount;
}
