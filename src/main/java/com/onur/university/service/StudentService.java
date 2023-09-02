package com.onur.university.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.onur.university.model.Student;
import com.onur.university.repository.IStudentRepository;

@Service
public class StudentService {
	
	private IStudentRepository studentRepository;
	

	
	public StudentService(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> getStudentById(int id) {
		return studentRepository.findById(id);
	}
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudentById(int id, Student student) {
		student.setId(id);
		return studentRepository.save(student);			
	}
	
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
}
