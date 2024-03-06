package com.duffel.stays.request.book;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


/**
 * Represents a request to create a stay booking.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class BookHotelRequest extends Data<BookHotelRequest> {

    /**
     * Guest's specific requests about this booking to be forwarded to the accommodation.
     * This field should not be used to provide medical or otherwise sensitive information.
     * Example: "2:00 PM early check-in required"
     */
    @JsonProperty("accommodation_special_requests")
    private String accommodationSpecialRequests;

    /**
     * Lead guest's email address.
     * Example: "amelia.earheart@duffel.com"
     */
    @JsonProperty("email")
    private String email;

    /**
     * List of guests that will stay on this booking. A minimum of one guest must be provided.
     * For bookings of more than one room, the reservation will be made under the name of the first guest provided.
     */
    @JsonProperty("guests")
    private List<GuestRequest> guests;

    /**
     * Loyalty account number to associate with this booking. Use this only when the quote has a supported_loyalty_programme indicated.
     * Example: "201154908"
     */
    @JsonProperty("loyalty_programme_account_number")
    private String loyaltyProgrammeAccountNumber;

    /**
     * Lead guest's phone number in E.164 (international) format.
     * Example: "+442080160509"
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * The id of the stay quote you want to book.
     * Example: "quo_0000AS0NZdKjjnnHZmSUbI"
     */
    @JsonProperty("quote_id")
    private String quoteId;

}
