package com.duffel.stays.model;

import com.duffel.model.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment refund response.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class Bed extends Data<Bed> {
    private String type;
    private int count;
}
