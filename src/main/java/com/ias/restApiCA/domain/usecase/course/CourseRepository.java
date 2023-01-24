package com.ias.restApiCA.domain.usecase.course;

import com.ias.restApiCA.domain.model.course.dto.CourseDTO;
import com.ias.restApiCA.domain.model.gateway.ICourseRepository;

public class CourseRepository {

    private final ICourseRepository repository;

    public CourseRepository(ICourseRepository repository) { this.repository = repository; }

    public CourseDTO save(CourseDTO courseDTO){
        return courseDTO.fromDomain(
                repository.saveCourse(
                        courseDTO.toDomain(
                                courseDTO
                        )
                )
        );
    }
}
