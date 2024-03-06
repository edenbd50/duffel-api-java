package com.duffel.stays.request.search_result;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *  Fetch rates for search results
 *  Returns complete room and rate information for the selected search result for a single search result.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class FetchRatesRequest extends Data<FetchRatesRequest> {

    /**
     * The ID of a Duffel Stay Search Result
     * Example: "ssr_0000ARxBI85qTkbVapZMO2"
     */
    @JsonProperty("search_result_id")
    public String searchResultId;
}
