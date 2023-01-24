package com.ias.restApiCA.infraestructure.adapters.jpa.course;

import com.ias.restApiCA.domain.model.course.Course;
import com.ias.restApiCA.domain.model.gateway.ICourseRepository;
import com.ias.restApiCA.domain.model.gateway.IStudentRepository;
import com.ias.restApiCA.domain.model.student.Student;
import com.ias.restApiCA.infraestructure.adapters.jpa.course.entity.CourseDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseRepositoryAdapter implements ICourseRepository {

    public final ICourseAdapterRepository repository;

    @Override
    public Course saveCourse(Course course) {
        CourseDBO courseDBO = new CourseDBO().fromDomain(course);
        return courseDBO.toDomain(repository.save(courseDBO));
    }
}
