package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum for types of legroom.
 */
public enum WiFiCost {
    free,
    @JsonProperty("free or paid")
    free_or_paid,
    paid,
    @JsonProperty("n/a")
    na
}
