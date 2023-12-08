package com.duffel.stays.response.bookings;

import com.duffel.model.Data;
import com.duffel.stays.model.Accommodation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Represents the data response for a hotel booking.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class BookHotelResponse extends Data<BookHotelResponse> {

    /**
     * The loyalty programme that this booking supports, if any.
     */
    @JsonProperty("supported_loyalty_programme")
    private String supportedLoyaltyProgramme;

    /**
     * The number of rooms booked.
     */
    @JsonProperty("rooms")
    private int rooms;

    /**
     * The status of the booking.
     */
    @JsonProperty("status")
    private String status;

    /**
     * The reference number for the booking, if applicable.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * The account number of the loyalty programme, if applicable.
     */
    @JsonProperty("loyalty_programme_account_number")
    private String loyaltyProgrammeAccountNumber;

    /**
     * The unique ID for this booking.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The list of guests associated with this booking.
     */
    @JsonProperty("guests")
    private List<GuestResponse> guests;

    /**
     * The ISO 8601 datetime at which the booking was confirmed.
     */
    @JsonProperty("confirmed_at")
    private String confirmedAt;

    /**
     * The ISO 8601 date on which the guests will check out.
     */
    @JsonProperty("check_out_date")
    private String checkOutDate;

    /**
     * The ISO 8601 date on which the guests will check in.
     */
    @JsonProperty("check_in_date")
    private String checkInDate;

    /**
     * The ISO 8601 datetime at which the booking was cancelled, if applicable.
     */
    @JsonProperty("cancelled_at")
    private String cancelledAt;

    /**
     * The accommodation associated with this booking.
     */
    @JsonProperty("accommodation")
    private Accommodation accommodation;
}
