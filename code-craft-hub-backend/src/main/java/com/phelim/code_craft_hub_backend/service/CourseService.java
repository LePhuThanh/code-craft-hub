package com.phelim.code_craft_hub_backend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.phelim.code_craft_hub_backend.model.Course;
import org.springframework.stereotype.Service;
import com.phelim.code_craft_hub_backend.exception.BadRequestException;
import com.phelim.code_craft_hub_backend.exception.ResourceNotFoundException;
import java.nio.file.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private static final String DATA_FILE = "courses.json";

    private final ObjectMapper objectMapper;

    public CourseService() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Read all courses from JSON file.
     */
    public List<Course> getAllCourses() {

        File file = new File(DATA_FILE);

        if (!file.exists()) {
            createEmptyDataFile(file);
            return new ArrayList<>();
        }

        try {

            String content = java.nio.file.Files.readString(file.toPath());

            if (content.isBlank()) {
                return new ArrayList<>();
            }

            return objectMapper.readValue(
                    file,
                    new TypeReference<List<Course>>() {
                    });

        } catch (IOException e) {
            throw new RuntimeException("Failed to read courses.json", e);
        }

    }

    /**
     * Save all courses to JSON file.
     */
    public void saveCourses(List<Course> courses) {

        try {

            objectMapper.writeValue(new File(DATA_FILE), courses);

        } catch (IOException e) {
            throw new RuntimeException("Failed to save courses.json", e);
        }

    }

    /**
     * Generate next id.
     */
    public Integer generateNextId(List<Course> courses) {

        return courses.stream()
                .map(Course::getId)
                .max(Integer::compareTo)
                .orElse(0) + 1;

    }

    /**
     * Create empty JSON file automatically.
     */
    private void createEmptyDataFile(File file) {

        try {

            objectMapper.writeValue(file, new ArrayList<>());

        } catch (IOException e) {

            throw new RuntimeException("Unable to create courses.json", e);

        }

    }

    /**
     * Find course by id.
     */
    public Course findById(Integer id) {

        return getAllCourses().stream()
                .filter(course -> course.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course not found with id: " + id));

    }

    /**
     * Create new course.
     */
    public Course createCourse(Course course) {

        List<Course> courses = getAllCourses();

        course.setId(generateNextId(courses));

        courses.add(course);

        saveCourses(courses);

        return course;

    }

    /**
     * Update existing course.
     */
    public Course updateCourse(Integer id, Course updatedCourse) {

        List<Course> courses = getAllCourses();

        for (int i = 0; i < courses.size(); i++) {

            if (courses.get(i).getId().equals(id)) {

                Course existingCourse = courses.get(i);

                updatedCourse.setId(id);
                updatedCourse.setCreatedAt(existingCourse.getCreatedAt());

                courses.set(i, updatedCourse);

                saveCourses(courses);

                return updatedCourse;

            }

        }

        throw new ResourceNotFoundException("Course not found with id: " + id);

    }

    /**
     * Delete course by id.
     */
    public void deleteCourse(Integer id) {

        List<Course> courses = getAllCourses();

        boolean removed = courses.removeIf(course -> course.getId().equals(id));

        if (!removed) {
            throw new ResourceNotFoundException("Course not found with id: " + id);
        }

        saveCourses(courses);

    }

}