package com.onur.university.repository;


import org.springframework.data.jpa.repository.JpaRepository;



import com.onur.university.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {}
