package com.duffel.stays.model;

import com.duffel.model.Data;
import com.duffel.stays.response.LocationResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


/**
 * Represents the accommodation associated with the search result.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Accommodation extends Data<Accommodation> {

    /**
     * The unique ID for this accommodation. This ID stays consistent between searches —
     * the same accommodation will always have the same ID.
     * Example: "acc_0000AWr2IgADo2rTllJJhI"
     */
    @JsonProperty("id")
    private String id;

    /**
     * The accommodation's name.
     * Example: "The Ritz London"
     */
    @JsonProperty("name")
    private String name;

    /**
     * Description of the accommodation.
     * Example: "Ornate quarters, some with grand pianos, in a luxurious hotel offering acclaimed dining & a spa."
     */
    @JsonProperty("description")
    private String description;

    /**
     * The ISO 8601 datetime at which the search request was created.
     * Example: "2022-12-20T15:21:01Z"
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * The accommodation email address. This field can only be populated on the accommodation for a completed booking.
     * Note that this data may differ from the accommodation records if it was updated directly by the accommodation after the booking was created.
     * Example: "reservations@theritzlondon.com"
     */
    @JsonProperty("email")
    private String email;

    /**
     * The accommodation phone number. This field can only be populated on the accommodation for a completed booking.
     * This is provided directly by the accommodation and the format is not guaranteed.
     * Note that this data may differ from the accommodation records if it was updated directly by the accommodation after the booking was created.
     * Example: "+442074938181"
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * The key collection details for the accommodation. This field is deprecated and will be removed in a future version.
     * Please use Accommodation.check_in_information.key_collection instead.
     * Example: "Please collect the keys from accommodation's reception."
     */
    @JsonProperty("key_collection")
    private KeyCollection keyCollection;

    /**
     * Information on the accommodation's location.
     */
    @JsonProperty("location")
    private LocationResponse location;

    /**
     * Photos of the accommodation.
     */
    @JsonProperty("photos")
    private List<Photo> photos;

    /**
     * The amenities for this accommodation. This can be null when we are unable to retrieve amenity data.
     * Accommodation amenities aid guests in identifying the accommodation that suits their needs.
     * These are intended for programmatic use to support filtering or promoting specific accommodation attributes.
     */
    @JsonProperty("amenities")
    private List<Amenity> amenities;

    /**
     * The chain or group brand the accommodation is a member of.
     */
    @JsonProperty("chain")
    private Chain chain;

    /**
     * Check in and check out related information.
     */
    @JsonProperty("check_in_information")
    private CheckInInformation checkInInformation;

    /**
     * Ratings given to an accommodation by a rating source.
     * This can be empty if the accommodation does not have any ratings. This can also be null if we are unable to retrieve ratings.
     * These are commonly represented as "stars". In Duffel Stays, they have a 1-5 scale.
     * They can come from multiple sources. Currently available rating sources are:
     * "priceline": Priceline.com star rating.
     * "aaa": American Automobile Association Diamonds.
     * "northstar": Northstar Travel Media Hotel Crown Rating.
     */
    @JsonProperty("ratings")
    private List<Rating> ratings;

    /**
     * A "star rating" of this accommodation. If available, this is an integer from 1 to 5 "stars".
     * This value is consolidated by Duffel based on data provided by our sources and accommodation providers. F
     * or more detailed rating information, see ratings.
     */
    @JsonProperty("rating")
    private int rating;

    /**
     *  A review score of this accommodation, aggregated from guest reviews.
     *  If available, the value is a score from the 1.0-10.0 range. T
     *  his value is consolidated by Duffel based on user review data from multiple sources.
     *
     *  Example: 8.8
     */
    @JsonProperty("review_score")
    private int reviewScore;

    /**
     * Bookable rooms for this accommodation. A room is a single accommodation unit. It might contain multiple beds.
     */
    @JsonProperty("rooms")
    private List<Room> rooms;
}
