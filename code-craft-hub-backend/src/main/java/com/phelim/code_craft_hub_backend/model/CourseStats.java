package com.phelim.code_craft_hub_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseStats {

    private int totalCourses;

    private int notStarted;

    private int inProgress;

    private int completed;

}