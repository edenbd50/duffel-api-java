package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
/**
 * Represents a bookable room for an accommodation. A room is a single accommodation unit and might contain multiple beds.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Room extends Data<Room> {

    /**
     * The available rates for a specific room, including commission, distribution, payment, and included services information.
     */
    @JsonProperty("rates")
    private List<Rate> rates;

    /**
     * Supplied photos for the room.
     */
    @JsonProperty("photos")
    private List<Photo> photos;

    /**
     * The room name.
     * Example: "Double Suite"
     */
    @JsonProperty("name")
    private String name;

    /**
     * Available beds in the room.
     */
    @JsonProperty("beds")
    private List<Bed> beds;
}
