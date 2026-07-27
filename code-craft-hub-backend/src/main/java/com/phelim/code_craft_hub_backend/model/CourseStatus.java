package com.phelim.code_craft_hub_backend.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CourseStatus {

    NOT_STARTED("Not Started"),
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed");

    private final String value;

    CourseStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}