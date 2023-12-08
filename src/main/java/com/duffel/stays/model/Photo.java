package com.duffel.stays.model;

import com.duffel.model.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Represents a photo of an accommodation or room.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Photo extends Data<Photo> {

    /**
     * The URL to the photo. Supplied photos of the stay. These may consist of photos of the property,
     * rooms, room amenities, and local attractions.
     * Example: "https://assets.duffel.com/img/stays/image.jpg"
     */
    @JsonProperty("url")
    private String url;
}
