package com.ias.restApiCA.domain.model.course.attributes;

public class CourseId {

    private final Long value;

    public CourseId(Long value) {
        if(value == null) {
            throw new IllegalArgumentException("Value must not be null");
        } else {
            this.value = value;
        }

    }

    public Long getValue() {
        return value;
    }
}
