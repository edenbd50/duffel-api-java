package com.duffel.stays.request.book;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * Gets a specific booking made by your organisation.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class OrderCancellationRequest extends Data<OrderCancellationRequest> {

    /**
     * The id of the booking
     * Example: "bok_0000BTVRuKZTavzrZDJ4cb"
     */
    @JsonProperty("id")
    public String id;

}
