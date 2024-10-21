package com.duffel.stays.response.quotes;

import com.duffel.model.Data;
import com.duffel.stays.model.GuestType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The list of guests travelling for this quote.
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@Setter
@ToString
public class GuestQuoteResponse extends Data<GuestQuoteResponse> {

    /**
     * The age of the guest at the time of booking.
     * Required for guests of type child. Child age must be between 0 and 17.
     * Example:
     */
    @JsonProperty("age")
    private String givenName;

    /**
     * The type of guest. An age is required for guests with a type child. Do not supply an age for guests of type adult.
     */
    @JsonProperty("type")
    private GuestType type;
}
