package com.restapi.studentdatabase.repository;

import com.restapi.studentdatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    //all crud database methods
}
