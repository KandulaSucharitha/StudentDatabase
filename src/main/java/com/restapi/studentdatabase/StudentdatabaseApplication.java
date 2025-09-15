package com.restapi.studentdatabase;

import com.restapi.studentdatabase.entity.Student;
import com.restapi.studentdatabase.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentdatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentdatabaseApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Ramu", "75.5F", "CSE");
		Student student2 = new Student("Sonu","65.3F", "ECE");

	}
}
