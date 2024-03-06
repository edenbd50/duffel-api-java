package com.duffel.stays.response.search;

import com.duffel.model.Data;
import com.duffel.stays.model.HotelResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Payment refund response.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class SearchAccommodationsResponse extends Data<SearchAccommodationsResponse> {
    @JsonProperty("created_at")
    String createdAt;

    /**
     * A list of Search Results
     */
    @JsonProperty("results")
    List<HotelResult> results;

}
