package com.duffel.stays.request.search;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class AccommodationSearch extends Data<AccommodationSearch> {
    @JsonProperty("fetch_rates")
    private boolean fetchRates;

    @JsonProperty("ids")
    private List<String> ids;
}