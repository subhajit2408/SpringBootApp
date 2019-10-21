package com.org.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Student;
import com.org.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/fetchStudents")
	public List<Student> fetchStudents(){
		return studentService.fetchStudents();
	}
	
	@GetMapping("/fetchStudent/{id}")
	public Optional<Student> fetchStudent(@PathVariable("id") Integer id){
		return studentService.fetchStudent(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable("id") Integer id){
		return studentService.updateStudent(id);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable("id") Integer id){
		 studentService.deleteStudent(id);
	}
	
	@DeleteMapping("/deleteStudents")
	public void deleteStudents(){
		 studentService.deleteStudents();
	}

}
