package com.duffel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum for types of legroom.
 */
public enum LegroomType {
    less,
    more,
    standard,
    @JsonProperty("n/a")
    na
}
