package com.duffel.model.response.offer;

import com.duffel.model.Cabin;
import com.duffel.model.CabinClass;
import com.duffel.model.response.order.metadata.SeatMetadata;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Passenger on a flight segment.
 */
@EqualsAndHashCode
@Getter
@ToString
public class SegmentPassenger {


    /**
     * An object containing metadata about the service, like the designator of the seat.
     */
    @JsonProperty("seat")
    private SeatMetadata seat;

    /**
     * The identifier for the passenger.
     * You may have specified this ID yourself when creating the offer request, or otherwise, Duffel will have
     * generated its own random ID.
     */
    @JsonProperty("passenger_id")
    @JsonAlias("air_order_passenger_id")
    private String passengerId;

    /**
     * The airline's alphanumeric code for the fare that the passenger is using to travel.
     * Where this is null, it means that either the fare basis code is not available or the airline does not use
     * fare basis codes.
     */
    @JsonProperty("fare_basis_code")
    private String fareBasisCode;

    /**
     * The name that the marketing carrier uses to market this cabin class
     * e.g. "Economy Basic"
     */
    @JsonProperty("cabin_class_marketing_name")
    private String cabinClassMarketingName;

    /**
     * The cabin class that the passenger will travel in on this segment
     * Possible values: "first", "business", "premium_economy", or "economy"
     */
    @JsonProperty("cabin_class")
    private CabinClass cabinClass;

    /**
     * The cabin class that the passenger will travel in on this segment
     * Possible values: "first", "business", "premium_economy", or "economy"
     */
    @JsonProperty("cabin")
    private Cabin cabin;

    /**
     * The baggage allowances for the passenger on this segment included in the offer.
     * Some airlines may allow additional baggage to be booked as a service - see the offer's available_services.
     * This property is returned by the API as "baggages"
     */
    @JsonProperty("baggages")
    private List<BaggageAllowance> baggageAllowances;

}
