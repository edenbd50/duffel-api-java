package com.duffel.model.response;

import com.duffel.model.response.seatmap.Cabin;
import com.duffel.model.response.seatmap.ElementType;
import com.duffel.model.response.seatmap.element.SeatElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Seat map for a segment.
 */
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class IdentityDocument {

    /**
     * Must only be provided for passport type. The date on which the identity document expires
     * Example: "2025-04-25"
     */
    @JsonProperty("expires_on")
    private String expiresOn;

    /**
     * Must only be provided for passport, known_traveler_number, and passenger_redress_number types.
     * The ISO 3166-1 alpha-2 code of the country that issued this identity document
     * Example: "GB"
     */
    @JsonProperty("issuing_country_code")
    private String issuingCountryCode;


    /**
     * The type of the identity document.
     * Currently, the only supported types are passport, tax_id, known_traveler_number,and passenger_redress_number.
     * The identity document's type supported by the airline can be found in the offer's
     * supported_passenger_identity_document_types.
     *
     * Possible values: "passport", "tax_id", "known_traveler_number", or "passenger_redress_number"
     */
    @JsonProperty("type")
    private IdentityDocumentType type;

    /**
     * The unique identifier of the identity document. e.g. the passport number.
     * Example: "19KL56147"
     */
    @JsonProperty("unique_identifier")
    private String uniqueIdentifier;

}
