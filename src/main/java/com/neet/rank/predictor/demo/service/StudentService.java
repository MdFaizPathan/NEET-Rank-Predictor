package com.neet.rank.predictor.demo.service;

import com.neet.rank.predictor.demo.model.Student;
import com.neet.rank.predictor.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
