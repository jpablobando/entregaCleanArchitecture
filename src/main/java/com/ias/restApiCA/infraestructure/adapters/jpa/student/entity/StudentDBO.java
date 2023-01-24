package com.ias.restApiCA.infraestructure.adapters.jpa.student.entity;


import com.ias.restApiCA.domain.model.student.Student;
import com.ias.restApiCA.domain.model.student.attributes.StudentEmail;
import com.ias.restApiCA.domain.model.student.attributes.StudentId;
import com.ias.restApiCA.domain.model.student.attributes.StudentName;
import com.ias.restApiCA.domain.model.student.attributes.StudentPhone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class StudentDBO {

    @Id
    private Long id;
    private String name;
    private String phone;
    private String email;

    public Student toDomain(StudentDBO studentDBO){
        return new Student(
                new StudentId(studentDBO.getId()),
                new StudentName(studentDBO.getName()),
                new StudentPhone(studentDBO.getPhone()),
                new StudentEmail(studentDBO.getEmail())
        );
    }

    public StudentDBO fromDomain(Student student){
        return new StudentDBO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getValue()
        );
    }
}
