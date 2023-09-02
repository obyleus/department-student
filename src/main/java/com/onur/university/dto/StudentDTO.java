package com.onur.university.dto;


import jakarta.persistence.Column;

public class StudentDTO {
	
	private int id;
	@Column(name = "department_id")
	private int departmentId;
    private String name;
    private String surname;
    private String department; 
    private int number;
    private int birthYear;
    private String city;
    
	public StudentDTO() {
	
	}

	public StudentDTO(int id, int departmentId, String name, String surname, String department, int number,
			int birthYear, String city) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.number = number;
		this.birthYear = birthYear;
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
	
}
