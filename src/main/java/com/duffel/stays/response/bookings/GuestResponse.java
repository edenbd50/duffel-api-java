package com.duffel.stays.response.bookings;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a guest response for a hotel booking.
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@Setter
@ToString
public class GuestResponse extends Data<GuestResponse> {

    /**
     * The given (first) name of the guest.
     * Example: "Amelia"
     */
    @JsonProperty("given_name")
    private String givenName;

    /**
     * The family (last) name of the guest.
     * Example: "Earhart"
     */
    @JsonProperty("family_name")
    private String familyName;
}
