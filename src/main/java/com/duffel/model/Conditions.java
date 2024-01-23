package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Conditions associated with an offer, determining change or refund rules.
 */
@EqualsAndHashCode
@Getter
@ToString
public class Conditions {

    /**
     * Whether the whole offer can be changed before the departure of the first slice. If all the slices on the
     * offer can be changed then the allowed property will be true. Refer to the slices for information about change
     * penalties. If any of the slices on the offer can't be changed then the allowed property will be false. In this
     * case you should refer to the slices conditions to determine if any part of the offer is changeable. If the
     * airline hasn't provided any information about whether this offer can be changed then this property will be null.
     */
    @JsonProperty("change_before_departure")
    private Condition changeBeforeDeparture;

    /**
     * Whether the whole offer can be refunded before the departure of the first slice. If all the slices on the offer
     * can be refunded then the allowed property will be true and information will be provided about any penalties. If
     * any of the slices on the offer can't be refunded then the allowed property will be false. If the airline hasn't
     * provided any information about whether this offer can be refunded then this property will be null.
     */
    @JsonProperty("refund_before_departure")
    private Condition refundBeforeDeparture;

    /**
     * Condition detail.
     */
    @EqualsAndHashCode
    @Getter
    @ToString
    public static class Condition {
        /**
         * Whether this kind of modification is allowed post-booking
         */
        @JsonProperty("allowed")
        private boolean allowed;

        /**
         * If the modification is allowed then this is the amount payable to apply the modification to all passengers.
         * If there is no penalty, the value will be zero. If the modification isn't allowed or the penalty is not
         * known then this field will be null. If this is null then the penalty_currency will also be null.
         */
        @JsonProperty("penalty_amount")
        private BigDecimal penaltyAmount;

        /**
         * The currency of the penalty_amount as an ISO 4217 currency code. This will be in a currency determined by
         * the airline, which is not necessarily the same as the currency of the offer or order. If this is null then
         * penalty_amount will also be null.
         */
        @JsonProperty("penalty_currency")
        private String penaltyCurrency;

        /**
         * The type of the condition.
         * For now we only return conditions of type change_before_departure
         * but we will return other types in the future.
         * Possible values: "change_before_departure"
         */
        @JsonProperty("type")
        private String type;
    }
}
