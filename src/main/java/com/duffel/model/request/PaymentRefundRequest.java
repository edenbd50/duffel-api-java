package com.duffel.model.request;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment information for refund.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class PaymentRefundRequest extends Data<PaymentRefundRequest> {

    /**
     * Duffel's unique identifier for the payment intent that the refund is for
     * Example: "pit_00009hthhsUZ8W4LxQgkjo"
     */
    @JsonProperty("paymentIntentId")
    private String paymentIntentId;

    /**
     * The currency of the amount, as an ISO 4217 currency code.
     * It must match the payment intent currency.
     * Example: "GBP"
     */
    @JsonProperty("currency")

    private String currency;
    /**
     * This amount that will be refunded to the customer's card.
     * Example: "30.20"
     */
    @JsonProperty("amount")
    private String amount;

}
