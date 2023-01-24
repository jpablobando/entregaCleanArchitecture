package com.ias.restApiCA.domain.model.gateway;

import com.ias.restApiCA.domain.model.course.Course;

public interface ICourseRepository {

    Course saveCourse(Course course);
}
