package com.restapi.studentdatabase.service;

import com.restapi.studentdatabase.entity.Student;
import com.restapi.studentdatabase.exception.ResourceNotFoundException;
import com.restapi.studentdatabase.repository.StudentRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Integer id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setName(studentDetails.getName());
        student.setBranch(studentDetails.getBranch());
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}
