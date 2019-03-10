package com.javasamples.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javasamples.dao.EmployeeDAO;
import com.javasamples.domain.Employee;
import com.javasamples.service.EmployeeService;

public class MainApplication {

	public static void main(String[] args) {
		// Load the Spring conatiner using the Spring Configuration File
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService empService = container.getBean(EmployeeService.class);
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