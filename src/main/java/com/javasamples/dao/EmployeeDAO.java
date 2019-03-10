package com.javasamples.dao;

import java.util.List;

import com.javasamples.domain.Employee;

public interface EmployeeDAO {
	
	public void addNewEmployee(Employee employee);

	public List<Employee> getAllEmployees();

}
