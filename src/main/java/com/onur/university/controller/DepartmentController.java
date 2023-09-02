package com.onur.university.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onur.university.model.Department;
import com.onur.university.service.DepartmentService;

@RestController
@RequestMapping("/api/university")
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@GetMapping("/department")
	public List<Department> getAllDepartment() {
		return departmentService.getAllDepartment();
	}
	
	@GetMapping("/department/{id}")
	public Optional<Department> getDepartmentById(@PathVariable int id) {
		return departmentService.getDepartmentById(id);
	}
	
	@PostMapping("/department")
	public Department createDepartment(@RequestBody Department newDepartment) {
		return departmentService.createDepartment(newDepartment);
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartmentById(@PathVariable int id, @RequestBody Department department) {
		return departmentService.updateDepartment(id, department);
	}
	
	@DeleteMapping("/department/{id}")
	public void deleteDepartment(@PathVariable int id) {
		departmentService.deleteDepartment(id);
	}

}
