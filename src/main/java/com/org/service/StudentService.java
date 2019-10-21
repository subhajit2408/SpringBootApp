package com.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.StudentRepository;
import com.org.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> fetchStudents() {
		return studentRepository.findAll();
	}

	public Optional<Student> fetchStudent(Integer id) {
		return studentRepository.findById(id);
	}

	public Student updateStudent(Integer id) {
		Optional<Student> studentList = studentRepository.findById(id);
		Student student = studentList.get();
		return studentRepository.save(student);
	}

	public void deleteStudent(Integer id) {
		Optional<Student> studentList = studentRepository.findById(id);
		Student student = studentList.get();
		 studentRepository.delete(student);
	}

	public void deleteStudents() {
		studentRepository.deleteAll();
		
	}

}
