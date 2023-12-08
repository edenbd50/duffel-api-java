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
     * The accommodation associated with the search result.
     */
    @JsonProperty("accommodation")
    private Accommodation accommodation;
}
