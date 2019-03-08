package com.javatutorials.dao;
import java.util.ArrayList;
import java.util.List;
import com.javatutorials.domain.Employee;

public class EmployeeDAO {
	
	private List<Employee> testEmployees = new ArrayList<Employee>();

    public void addNewEmployee(Employee employee) {
        testEmployees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<Employee>(testEmployees);
    }

}
