package com.example.StudentSecurity.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.StudentSecurity.Model.Student;

@Service
public class StudentServiceImplementation implements StudentService {
	private StudentRepository studentRepository;

	public StudentServiceImplementation(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student saveEmployee(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).orElseThrow();
	}

	@Override
	public Student updateStudent(Student student, int id) {
		Student existingStudent= studentRepository.findById(id).orElseThrow();

		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		// save existing employee to DB
		studentRepository.save(existingStudent);
		return existingStudent;
	}
	
	public void deleteStudent(int id) {
		studentRepository.findById(id).orElseThrow();
		studentRepository.deleteById(id);
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
