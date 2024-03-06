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
public class PaymentIntentConfirmRequest extends Data<PaymentIntentConfirmRequest> {

}
