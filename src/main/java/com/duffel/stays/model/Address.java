package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment refund response.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class Address extends Data<Address> {
    @JsonProperty("region")
    private String region;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("line_one")
    private String lineOne;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("city_name")
    private String cityName;

}
