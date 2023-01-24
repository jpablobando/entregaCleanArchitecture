package com.ias.restApiCA.domain.model.gateway;


import com.ias.restApiCA.domain.model.student.Student;

public interface IStudentRepository{
    Student saveStudent(Student student);


}
