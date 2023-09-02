package com.onur.university.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.onur.university.model.Department;
import com.onur.university.repository.IDepartmentRepository;

@Service
public class DepartmentService {
	
	private IDepartmentRepository departmentRepository;
	
	public DepartmentService(IDepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}
	
	public Optional<Department> getDepartmentById(int id) {
		return departmentRepository.findById(id);
	}
	
	public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
	
	public Department updateDepartment(int id, Department department) {
		department.setId(id);
		return departmentRepository.save(department);
		
	}
	
	public void deleteDepartment(int id) {
		departmentRepository.deleteById(id);
    }
}
