package com.phelim.code_craft_hub_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Integer id;

    @NotBlank(message = "Course name is required")
    private String name;

    @NotBlank(message = "Course description is required")
    private String description;

    @JsonProperty("target_date")
    @NotBlank(message = "Target date is required")
    private String targetDate;

    @NotNull(message = "Course status is required")
    private CourseStatus status;

    @JsonProperty("created_at")
    private String createdAt;

}