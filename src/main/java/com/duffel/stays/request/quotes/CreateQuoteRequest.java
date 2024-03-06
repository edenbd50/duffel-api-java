package com.duffel.stays.request.quotes;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *  Create a quote for a rate
 *  Creates a ready-to-book Duffel Stay Quote — a prospective booking — from a given room rate
 *  This step confirms availability of the rate and total pricing of the booking.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class CreateQuoteRequest extends Data<CreateQuoteRequest> {

    /**
     * The id of the rate you want to book.
     * Example: "rat_0000ARxBI85qTkbVapZDD2"
     */
    @JsonProperty("rate_id")
    private String rateId;
}
