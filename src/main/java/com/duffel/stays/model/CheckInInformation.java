package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents check-in and check-out related information for an accommodation.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class CheckInInformation extends Data<CheckInInformation> {

    /**
     * The ISO 8601 format for the earliest time a guest can check in to their room.
     * Example: "14:30"
     */
    @JsonProperty("check_in_after_time")
    private String checkInAfterTime;

    /**
     * The ISO 8601 format for the latest time a guest can check out of their room.
     * Example: "11:30"
     */
    @JsonProperty("check_out_before_time")
    private String checkOutBeforeTime;

}
