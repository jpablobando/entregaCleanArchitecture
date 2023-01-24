package com.ias.restApiCA.domain.usecase.student;

import com.ias.restApiCA.domain.model.gateway.IStudentRepository;
import com.ias.restApiCA.domain.model.student.dto.StudentDTO;

public class StudentRepository {

    private final IStudentRepository repository;

    public StudentRepository(IStudentRepository repository){
        this.repository = repository;
    }

    public StudentDTO save(StudentDTO studentDTO){
        return studentDTO.fromDomain(
                repository.saveStudent(
                        studentDTO.toDomain(
                                studentDTO
                        )
                )
        );
    }
}
