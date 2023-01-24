package com.ias.restApiCA.application;

import com.ias.restApiCA.domain.model.gateway.ICourseRepository;
import com.ias.restApiCA.domain.model.gateway.IStudentRepository;
import com.ias.restApiCA.domain.usecase.course.CourseRepository;
import com.ias.restApiCA.domain.usecase.student.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public StudentRepository studentRepository(IStudentRepository iStudentRepository){
        return new StudentRepository(iStudentRepository);
    }

    @Bean
    public CourseRepository courseRepository(ICourseRepository iCourseRepository){
        return new CourseRepository(iCourseRepository);
    }
}
