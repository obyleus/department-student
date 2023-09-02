package com.onur.university.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onur.university.dto.StudentDTO;
import com.onur.university.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
	
	//@Query("SELECT NEW com.onur.university.dto.StudentDTO(s.id, s.departmentId, s.name, s.surname, s.department.department, s.number, s.birthYear, s.city) FROM Student s WHERE s.id = :id")
	//StudentDTO findStudentWithDepartment(@Param("id") int id);
}