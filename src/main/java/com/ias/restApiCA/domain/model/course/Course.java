package com.ias.restApiCA.domain.model.course;

import com.ias.restApiCA.domain.model.course.attributes.CourseId;
import com.ias.restApiCA.domain.model.course.attributes.CourseName;

public class Course {

    private final CourseId id;
    private final CourseName name;

    public Course(CourseId id, CourseName name) {
        this.id = id;
        this.name = name;
    }

    public CourseId getId() {
        return id;
    }

    public CourseName getName() {
        return name;
    }
}
