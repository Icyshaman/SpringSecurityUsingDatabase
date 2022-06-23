package com.example.StudentSecurity.Service;

import java.util.List;

import com.example.StudentSecurity.Model.Student;

public interface StudentService {
	Student saveStudent(Student student);

	List<Student> getAllStudent();

	Student getStudentById(int id);

	Student updateStudent(Student student, int id);

	void deleteStudent(int id);
}
