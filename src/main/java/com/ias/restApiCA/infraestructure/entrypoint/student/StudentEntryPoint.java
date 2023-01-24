package com.ias.restApiCA.infraestructure.entrypoint.student;

import com.ias.restApiCA.domain.model.student.dto.StudentDTO;
import com.ias.restApiCA.domain.usecase.student.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentEntryPoint {

    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> saveStudent(StudentDTO studentDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentRepository.save(studentDTO));
    }
}
