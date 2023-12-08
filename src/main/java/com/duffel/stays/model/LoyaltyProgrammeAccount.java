package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a loyalty programme account associated with a rate.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class LoyaltyProgrammeAccount extends Data<LoyaltyProgrammeAccount> {

    /**
     * The account number of the loyalty programme.
     */
    @JsonProperty("account_number")
    private String accountNumber;
}
