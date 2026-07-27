package com.phelim.code_craft_hub_backend.controller;

import com.phelim.code_craft_hub_backend.model.Course;
import com.phelim.code_craft_hub_backend.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * GET /api/courses
     */
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {

        return ResponseEntity.ok(courseService.getAllCourses());

    }

    /**
     * GET /api/courses/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Integer id) {

        Course course = courseService.findById(id);

        if (course == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(course);

    }

    /**
     * POST /api/courses
     */
    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {

        course.setCreatedAt(LocalDateTime.now().toString());

        Course savedCourse = courseService.createCourse(course);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedCourse);

    }

    /**
     * PUT /api/courses/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(
            @PathVariable Integer id,
            @RequestBody Course course) {

        Course updatedCourse = courseService.updateCourse(id, course);

        if (updatedCourse == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedCourse);

    }

    /**
     * DELETE /api/courses/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Integer id) {

        boolean deleted = courseService.deleteCourse(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();

    }

}