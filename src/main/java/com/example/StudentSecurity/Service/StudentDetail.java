package com.example.StudentSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.StudentSecurity.Model.Student;

@Component
public class StudentDetail implements UserDetailsService {
	@Autowired
    private StudentRepository studentRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Student student= this.studentRepository.findByEmail(username).orElseThrow();
       return student;
    }
}
