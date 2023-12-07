package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * If Wi-Fi is available, information on its cost, availability, etc.
 */
@Getter
@EqualsAndHashCode
@ToString
public class WiFi {

    /**
     * Whether Wi-Fi is available in this cabin.
     * Example: "true".
     */
    @JsonProperty("available")
    private boolean available;

    /**
     * The cost, if any, to use the Wi-Fi.
     * Possible values: "free", "free or paid", "paid", or "n/a".
     */
    @JsonProperty("cost")
    private WiFiCost cost;
}
