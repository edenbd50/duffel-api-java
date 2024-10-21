package com.duffel.stays.response.quotes;

import com.duffel.model.Data;
import com.duffel.stays.model.Accommodation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Represents a hotel quote result.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class QuoteResponse extends Data<QuoteResponse> {

    /**
     * The ID for this hotel quote result.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The ISO 8601 date on which the guest wants to check out.
     */
    @JsonProperty("check_out_date")
    private String checkOutDate;

    /**
     * The ISO 8601 date on which the guest wants to check in.
     */
    @JsonProperty("check_in_date")
    private String checkInDate;

    /**
     * The number of rooms required
     * Example: 1
     */
    @JsonProperty("rooms")
    private int rooms;

    /**
     * The currency of the total amount, as an ISO 4217 currency code.
     */
    @JsonProperty("total_currency")
    private String totalCurrency;

    /**
     * The total price for the accommodation.
     */
    @JsonProperty("total_amount")
    private String totalAmount;

    /**
     * The tax amount for this accommodation.
     */
    @JsonProperty("tax_amount")
    private String taxAmount;

    /**
     * The currency of the tax amount, as an ISO 4217 currency code.
     */
    @JsonProperty("tax_currency")
    private String taxCurrency;

    /**
     * The loyalty programme that this rate supports, if any.
     */
    @JsonProperty("supported_loyalty_programme")
    private String supportedLoyaltyProgramme;

    /**
     * The currency of the fee amount, if applicable.
     */
    @JsonProperty("fee_currency")
    private String feeCurrency;

    /**
     * The fee amount for this accommodation, if applicable.
     */
    @JsonProperty("fee_amount")
    private String feeAmount;

    /**
     * The currency of the amount due at accommodation, as an ISO 4217 currency code.
     */
    @JsonProperty("due_at_accommodation_currency")
    private String dueAtAccommodationCurrency;

    /**
     * The amount due at the accommodation, if applicable.
     */
    @JsonProperty("due_at_accommodation_amount")
    private String dueAtAccommodationAmount;

    /**
     * The currency of the base amount, as an ISO 4217 currency code.
     */
    @JsonProperty("base_currency")
    private String baseCurrency;

    /**
     * The base amount for this accommodation, excluding taxes and fees.
     */
    @JsonProperty("base_amount")
    private String baseAmount;

    /**
     * The accommodation associated with this quote.
     */
    @JsonProperty("accommodation")
    private Accommodation accommodation;

    /**
     * The list of guests travelling for this quote.
     */
    @JsonProperty("guests")
    private List<GuestQuoteResponse> guests;


}
