package com.ias.restApiCA.domain.model.student.attributes;

public class StudentId {
    private final Long value;

    public StudentId(Long value) {

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
