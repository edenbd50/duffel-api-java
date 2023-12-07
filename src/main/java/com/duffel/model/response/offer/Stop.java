package com.duffel.model.response.offer;

import com.duffel.model.CabinClass;
import com.duffel.model.Location;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Additional segment-specific information about the stops, if any, included in the segment
 */
@EqualsAndHashCode
@Getter
@ToString
public class Stop {

    /**
     * Duffel's unique identifier for the resource
     */
    @JsonProperty("id")
    private String id;

    /**
     * The duration of the slice, represented as a ISO 8601 duration
     */
    @JsonProperty("duration")
    private Duration duration;

    /**
     * The ISO 8601 datetime at which the segment is scheduled to depart, in the origin airport timezone
     * (see origin.timezone)
     */
    @JsonProperty("departing_at")
    private LocalDateTime departingAt;
    /**
     * The ISO 8601 datetime at which the segment is scheduled to depart, in the origin airport timezone
     * (see origin.timezone)
     */
    @JsonProperty("arriving_at")
    private LocalDateTime arrivingAt;


    /**
     * The baggage allowances for the passenger on this segment included in the offer.
     * Some airlines may allow additional baggage to be booked as a service - see the offer's available_services.
     * This property is returned by the API as "baggages"
     */
    @JsonProperty("airport")
    private Airport airport;

}
