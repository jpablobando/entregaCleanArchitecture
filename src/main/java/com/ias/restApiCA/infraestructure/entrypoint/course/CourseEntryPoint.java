package com.ias.restApiCA.infraestructure.entrypoint.course;

import com.ias.restApiCA.domain.model.course.dto.CourseDTO;
import com.ias.restApiCA.domain.usecase.course.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseEntryPoint {

    private final CourseRepository courseRepository;

    @PostMapping
    public ResponseEntity<?> saveCourse(CourseDTO courseDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(courseRepository.save(courseDTO));
    }
}
