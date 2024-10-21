package com.duffel.model;

import com.duffel.model.response.ChangeSlice;
import com.duffel.model.response.order.OrderSlice;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Change to a flight, made by the airline.
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString
public class AirlineInitiatedChange extends Data<AirlineInitiatedChange> {

    /**
     * The action taken in response to this airline-initiated change.
     * <p>
     * Accepted, cancelled and changed reflect your action in accepting the change, cancelling the order or
     * changing the order respectively.
     */
    @JsonProperty("action_taken")
    private AirlineInitiatedChangeActionTaken actionTaken;

    /**
     * The ISO 8601 datetime at which an action was taken
     */
    @JsonProperty("action_taken_at")
    private LocalDateTime actionTakenAt;

    /**
     * List of updated slices and segments following the change. These slices and segments may each have a new ID
     * as a result of the changes.
     */
    @JsonProperty("added")
    private List<ChangeSlice> added;

    /**
     * The available actions you can take on this Airline-Initiated Change through our API.
     * <p>
     * "update" means that you can use the update endpoint for an Airline-Initiated Change.
     * <p>
     * Possible values in array: "accept", "cancel", "change", or "update"
     * Example: ["accept","cancel","change"]
     */
    @JsonProperty("available_actions")
    private List<AirlineInitiatedChangeActions> availableActions;

    /**
     * The ISO 8601 datetime at which we detected the airline-initiated change
     */
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    /**
     * Duffel's unique identifier for the airline-initiated change
     */
    @JsonProperty("aic_id")
    private String aicId;

    /**
     * Duffel's unique identifier for the order
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * List of slices and segments as they were before the change.
     */
    @JsonProperty("removed")
    private List<ChangeSlice> removed;

    /**
     * The associated Travel Agent Ticket, if any, for this Airline-Initiated Change. This value will be present for
     * Airline-Initiated changes that take some time to be processed.
     */
    @JsonProperty("travel_agent_ticket")
    private String travelAgentTicket;

    /**
     * The ISO 8601 datetime at which the airline-initiated change was last updated
     */
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    /**
     * Actions that can be taken for this change.
     */
    public enum AirlineInitiatedChangeActions {
        accept,
        cancel,
        change,
        update
    }

}
