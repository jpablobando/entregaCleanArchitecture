package com.ias.restApiCA.domain.model.course.attributes;

public class CourseName {

    private final String value;

    public CourseName(String value) {
        if(value == null) {
            throw new IllegalArgumentException("Value must not be null");
        } else {
            this.value = value;
        }
    }

    public String getValue() {
        return value;
    }
}
