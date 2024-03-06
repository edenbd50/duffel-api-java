package com.duffel.model.response;

import com.duffel.model.Data;
import com.duffel.model.PaymentType;
import com.duffel.model.RefundStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Payment refund response.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString
public class PaymentRefundResponse extends Data<PaymentRefundResponse> {

    /**
     * The amount of the payment intent that will be refunded to the customer.
     * Example: "300.10"
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * When the refund is expected to arrive in the destination.
     * Example: "Credit approximately 5-10 business days later, depending upon the bank."
     */
    @JsonProperty("arrival")
    private String arrival;

    /**
     * The ISO 8601 datetime at which the refund was created.
     * Example: "2020-04-11T15:48:11.642Z"
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * The currency of the amount, as an ISO 4217 currency code.
     * It will always match the currency of the payment intent.
     * Example: "GBP"
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Where the refund amount will be sent to.
     * Possible values: "original_form_of_payment"
     */
    @JsonProperty("destination")
    private String destination;

    /**
     * Duffel's unique identifier for the resource.
     * Example: "ref_00009hthhsUZ8W4LxQgkjo"
     */
    @JsonProperty("id")
    private String id;

    /**
     * Whether the refund was created in live mode. This field will be set to true if the refund was created in live mode, or false if it was created in test mode.
     * Example: true
     */
    @JsonProperty("live_mode")
    private boolean liveMode;

    /**
     * The amount deducted from your balance to cover the refund amount.
     * Example: "300.10"
     */
    @JsonProperty("net_amount")
    private String netAmount;

    /**
     * The currency of the net_amount, as an ISO 4217 currency code.
     * This currency will match your balance currency.
     * Example: "GBP"
     */
    @JsonProperty("net_currency")
    private String netCurrency;

    /**
     * Duffel's unique identifier for the payment intent that the refund is for.
     * Example: "pit_00009hthhsUZ8W4LxQgkjo"
     */
    @JsonProperty("payment_intent_id")
    private String paymentIntentId;

    /**
     * The status of the refund.
     * Possible values: "succeeded", "pending", or "failed"
     */
    @JsonProperty("status")
    private RefundStatusType status;

    /**
     * The ISO 8601 datetime at which the refund was updated.
     * Example: "2020-04-11T15:48:11.642Z"
     */
    @JsonProperty("updated_at")
    private String updatedAt;
}
