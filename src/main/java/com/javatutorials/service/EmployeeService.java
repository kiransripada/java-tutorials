package com.javatutorials.service;

import java.util.List;
import com.javatutorials.dao.EmployeeDAO;
import com.javatutorials.domain.Employee;
public class EmployeeService {
	//insert dependency using new keyword
    EmployeeDAO empDAO = new EmployeeDAO();    

    public void addNewEmployee(Employee emp) {
        empDAO.addNewEmployee(emp);
    }

    public List<Employee> getEmployees() {
        return empDAO.getAllEmployees();
    }

}
