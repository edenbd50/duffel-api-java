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
 * The airport at which the stop happens
 */
@EqualsAndHashCode
@Getter
@ToString
public class Airport {


    /**
     * The name of the city (or cities separated by a /) where the airport is located
     */
    @JsonProperty("airports")
    private List<Airport> airports;

    /**
     * The name of the city (or cities separated by a /) where the airport is located
     */
    @JsonProperty("city")
    private Location.CityDetail city;

    /**
     * The name of the city (or cities separated by a /) where the airport is located
     */
    @JsonProperty("city_name")
    private String city_name;

    /**
     * The three-character IATA code for the city where the airport is located
     */
    @JsonProperty("iata_city_code")
    private String iata_city_code;

    /**
     * The three-character IATA code for the airport
     */
    @JsonProperty("iata_code")
    private String iata_code;

    /**
     * The ISO 3166-1 alpha-2 code for the country where the airport is located
     */
    @JsonProperty("iata_country_code")
    private String iataCountryCode;

    /**
     * The four-character ICAO code for the airport
     */
    @JsonProperty("icao_code")
    private String icaoCode;

    /**
     * Duffel's unique identifier for the resource
     */
    @JsonProperty("id")
    private String id;

    /**
     * The latitude position of the airport represented in Decimal degrees with 6 decimal points with a range
     * between -90° and 90°
     */
    @JsonProperty("latitude")
    private Double latitude;


    /**
     * The longitude position of the airport represented in Decimal degrees with 6 decimal points with a range
     * between -180° and 180°
     */
    @JsonProperty("longitude")
    private Double longitude;

    /**
     * The name of the airport
     */
    @JsonProperty("name")
    private String name;


    /**
     * The time zone of the airport, specified by name from the tz database
     */
    @JsonProperty("time_zone")
    private String timeZone;


}
