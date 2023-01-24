package com.ias.restApiCA.infraestructure.adapters.jpa.student;

import com.ias.restApiCA.domain.model.gateway.IStudentRepository;
import com.ias.restApiCA.domain.model.student.Student;
import com.ias.restApiCA.infraestructure.adapters.jpa.student.entity.StudentDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class StudentRepositoryAdapter implements IStudentRepository {

    public final IStudentAdapterRepository repository;
    @Override
    public Student saveStudent(Student student) {
        StudentDBO studentDBO = new StudentDBO().fromDomain(student);
        return studentDBO.toDomain(repository.save(studentDBO));
    }
}
