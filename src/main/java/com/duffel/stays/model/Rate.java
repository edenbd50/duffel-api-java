package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jfr.Description;
import jdk.jfr.Experimental;
import jdk.jfr.Label;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.List;

/**
 * Represents the available rates for a specific room, including commission, distribution, payment, and included services information.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Rate extends Data<Rate> {

    /**
     * The base amount for this rate, excluding taxes and fees. Will be null if the base amount is unknown.
     * Example: "665.83"
     */
    @JsonProperty("base_amount")
    private String baseAmount;

    /**
     * The currency of the base_amount, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("base_currency")
    private String baseCurrency;

    /**
     * The type of boarding offered by this rate.
     * Possible values: "room_only", "breakfast", or "all_inclusive"
     */
    @JsonProperty("board_type")
    private String boardType;

    /**
     * A timeline that contains policies, such as possible refunds, once this rate has been booked.
     * This is sorted in ascending chronological order.
     */
    @JsonProperty("cancellation_timeline")
    private List<CancellationTimeline> cancellationTimeline;

    /**
     * The conditions or policies that apply to the rate.
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;

    /**
     * Mandatory fees or taxes that are due by the guest at the accommodation.
     * Example: "39.95"
     */
    @JsonProperty("due_at_accommodation_amount")
    private String dueAtAccommodationAmount;

    /**
     * The currency of the due_at_accommodation_amount, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("due_at_accommodation_currency")
    private String dueAtAccommodationCurrency;

    /**
     * The fee amount for this rate.
     * Example: "50.94"
     */
    @JsonProperty("fee_amount")
    private String feeAmount;

    /**
     * The currency of the fee_amount, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("fee_currency")
    private String feeCurrency;

    /**
     * The id of a given rate.
     * Example: "rat_0000BTVRuKZTavzrZDJ4cb"
     */
    @JsonProperty("id")
    private String id;

    /**
     * The payment method is the form of payment supported for this rate.
     * Possible values: "balance" or "card"
     */
    @Label("Experimental")
    @Description("Element is not to be shown to a user by default")
    @JsonProperty("available_payment_methods")
    private String paymentMethod;

    /**
     * The payment type for this rate. It describes how and when the payment_method will be charged.
     * Possible values: "pay_now" or "guarantee"
     */
    @JsonProperty("payment_type")
    private String paymentType;

    /**
     * The quantity of rooms available to be booked at this rate.
     * Example: 12
     */
    @JsonProperty("quantity_available")
    private Integer quantityAvailable;

    /**
     * The source provider of this rate
     * Possible values: "bookingcom", "travelport", "priceline", or "duffel_hotel_group"
     */
    @JsonProperty("source")
    private Source source;

    /**
     * The loyalty programme that this rate supports.
     */
    @JsonProperty("supported_loyalty_programme")
    private String supportedLoyaltyProgramme;

    /**
     * The tax amount for this rate.
     * Example: "82.23"
     */
    @JsonProperty("tax_amount")
    private String taxAmount;

    /**
     * The currency of the tax_amount, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("tax_currency")
    private String taxCurrency;

    /**
     * The total price for the room for all nights and for all guests.
     * Example: "799.00"
     */
    @JsonProperty("total_amount")
    private String totalAmount;

    /**
     * The currency of the total_amount, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("total_currency")
    private String totalCurrency;
}
