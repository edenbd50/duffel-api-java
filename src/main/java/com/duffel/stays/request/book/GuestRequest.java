package com.duffel.stays.request.book;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Represents a guest request for a hotel booking.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class GuestRequest extends Data<GuestRequest> {

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

    /**
     * The birth date of the guest in ISO 8601 format.
     */
    @JsonProperty("born_on")
    private String bornOn;
}
