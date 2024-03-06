package com.duffel.model.response;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Payment refund response.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString
public class PaymentIntentConfirmResponse extends Data<PaymentIntentConfirmResponse> {
    /**
     * The amount of the payment intent that covers the cost of the flight being sold and any additional markup.
     * The card payment will be charged this amount.
     * Example: "300.10"
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * The ISO 3166-1 alpha-2 code of the country that issued the card used to confirm the payment intent.
     * It will be null until the payment intent is confirmed.
     * Example: "GB"
     */
    @JsonProperty("card_country_code")
    private String cardCountryCode;

    /**
     * The last four digits of the card used to confirm the payment intent.
     * It will be null until the payment intent is confirmed.
     * Example: "4242"
     */
    @JsonProperty("card_last_four_digits")
    private String cardLastFourDigits;

    /**
     * The card network in which the payment intent was processed on.
     * It will be null until the payment intent is confirmed.
     * Possible values: "amex", "cartes_bancaires", "diners", "discover", "interac", "jcb", "mastercard", "unionpay", "visa", or "unknown"
     */
    @JsonProperty("card_network")
    private String cardNetwork;

    /**
     * This value is used when displaying the payment collection form to securely identify and transmit the values to Duffel.
     * Example: "eyJjbGllbnRfc2VjcmV0IjoicGlfMUl5YTBiQW5rMVRkeXJvRE1iWkJPN0ZSX3NlY3JldF9TbGFrYnJjYnFHZGZha2VrcjdCNE5jZWVyIiwicHVibGlzaGFibGVfa2V5IjoicGtfbGl2ZV81MUl0Q3YwQW5rMUdkeXJvRFlFU3M3RnBTUEdrNG9kbDhneDF3Y1RBNVEzaUcyWEFWVEhxdFlKSVhWMUxoSU5GQUtFMjA1dFdmRGVIcXhwUVdnYkIzTkVFbzAwMmdVY1hzR0YifQ=="
     */
    @JsonProperty("client_token")
    private String clientToken;

    /**
     * The ISO 8601 datetime at which the payment intent was confirmed.
     * It will be null until the payment intent is confirmed.
     * Example: "2020-04-11T15:49:02.642Z"
     */
    @JsonProperty("confirmed_at")
    private String confirmedAt;

    /**
     * The ISO 8601 datetime at which the payment intent was created.
     * Example: "2020-04-11T15:48:11.642Z"
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * The currency of the amount, as an ISO 4217 currency code.
     * The card payment will be charged in this currency.
     * Example: "GBP"
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * The amount of the fees to process the payment intent.
     * It will be null until the payment intent is confirmed.
     * Example: "3.00"
     */
    @JsonProperty("fees_amount")
    private String feesAmount;

    /**
     * The currency of the fees_amount, as an ISO 4217 currency code.
     * This currency will match your balance currency.
     * It will be null until the payment intent is confirmed.
     * Example: "GBP"
     */
    @JsonProperty("fees_currency")
    private String feesCurrency;

    /**
     * Duffel's unique identifier for the resource.
     * Example: "pit_00009hthhsUZ8W4LxQgkjo"
     */
    @JsonProperty("id")
    private String id;

    /**
     * Whether the payment intent was created in live mode. This field will be set to true if the payment intent was created in live mode, or false if it was created in test mode.
     * Example: true
     */
    @JsonProperty("live_mode")
    private boolean liveMode;

    /**
     * The amount of the payment intent that was added to the balance.
     * It'll be amount (in the balance currency) less the fees_amount.
     * It will be null until the payment intent is confirmed.
     * Example: "297.10"
     */
    @JsonProperty("net_amount")
    private String netAmount;

    /**
     * The currency of the net_amount, as an ISO 4217 currency code.
     * This currency will match your balance currency.
     * It will be null until the payment intent is confirmed.
     * Example: "GBP"
     */
    @JsonProperty("net_currency")
    private String netCurrency;

    /**
     * The refunds for this payment intent.
     */
    @JsonProperty("refunds")
    private List<PaymentRefundResponse> refunds;

    /**
     * The status of this Payment Intent.
     * Possible values: "requires_payment_method", "requires_confirmation", "requires_action", "processing", "requires_capture", "cancelled", or "succeeded"
     */
    @JsonProperty("status")
    private String status;

    /**
     * The ISO 8601 datetime at which the payment intent was updated.
     * Example: "2020-04-11T15:48:11.642Z"
     */
    @JsonProperty("updated_at")
    private String updatedAt;
}
