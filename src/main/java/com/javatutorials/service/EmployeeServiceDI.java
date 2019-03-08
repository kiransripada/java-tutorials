package com.javatutorials.service;

import java.util.List;

import com.javatutorials.dao.EmployeeDAO;
import com.javatutorials.domain.Employee;

public class EmployeeServiceDI {
	EmployeeDAO empDAO;

	public EmployeeServiceDI() {
	}
	
	//Constructor for EmployeeService for constructor injection
	public EmployeeServiceDI(EmployeeDAO empDAO) {
		super();
		this.empDAO = empDAO;
	}

	public void addNewEmployee(Employee emp) {
		empDAO.addNewEmployee(emp);
	}

	public List<Employee> getEmployees() {
		return empDAO.getAllEmployees();
	}

}
