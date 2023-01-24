package com.ias.restApiCA.domain.model.student.attributes;

public class StudentName {

    private final String value;

    public StudentName(String value) {

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
