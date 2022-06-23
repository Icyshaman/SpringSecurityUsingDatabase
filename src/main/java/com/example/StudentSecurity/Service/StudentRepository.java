package com.example.StudentSecurity.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentSecurity.Model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	Optional<Student> findByEmail(String email);
}
