package com.javatutorials;

import java.util.List;

import com.javatutorials.dao.EmployeeDAO;
import com.javatutorials.domain.Employee;
import com.javatutorials.service.EmployeeServiceDI;

public class MainApplicationDI {

	public static void main(String[] args) {

		EmployeeDAO empDAO = new EmployeeDAO();
		//insert dependency using Constructor injection
		EmployeeServiceDI empService = new EmployeeServiceDI(empDAO);
		Employee emp1 = new Employee("1", "Test1", "Manager", 1000);
		Employee emp2 = new Employee("1", "Test2", "Manager", 1000);
		Employee emp3 = new Employee("1", "Test3", "Manager", 1000);
		Employee emp4 = new Employee("1", "Test4", "Manager", 1000);
		Employee emp5 = new Employee("1", "Test5", "Manager", 1000);

		empService.addNewEmployee(emp1);
		empService.addNewEmployee(emp2);
		empService.addNewEmployee(emp3);
		empService.addNewEmployee(emp4);
		empService.addNewEmployee(emp5);
		List<Employee> employees = empService.getEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}

	}

}
