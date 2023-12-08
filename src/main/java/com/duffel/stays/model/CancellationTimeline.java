package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a timeline that contains policies, such as possible refunds, once this rate has been booked.
 * This is sorted in ascending chronological order.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class CancellationTimeline extends Data<CancellationTimeline> {

    /**
     * The ISO 8601 datetime for the deadline of a refund.
     * Example: "2023-05-23T13:00:00Z"
     */
    @JsonProperty("before")
    private String before;

    /**
     * The currency of the amount, as an ISO 4217 currency code.
     * Example: "GBP"
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * The amount refundable up until the specified before date.
     * Example: "799.00"
     */
    @JsonProperty("refund_amount")
    private String refundAmount;
}
