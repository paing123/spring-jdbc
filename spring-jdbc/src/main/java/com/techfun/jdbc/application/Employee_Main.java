package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.service.EmployeeService;
import com.techfun.jdbc.service.EmployeeServiceImpl;

public class Employee_Main {
	public static void main(String args[]) {
		Employee employee = new Employee();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService service = appContext.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		//testCreateEmployee(employee, service);
		//testUpdateEmployee(employee, service);
		testDeleteEmployee(employee, service);
	}

	private static void testCreateEmployee(Employee employee, EmployeeService service) {
		employee.setName("Phyo Paing");
		employee.setAddress("Bago-Hnin thar Gonne");
		employee.setAge(22);

		service.createEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testUpdateEmployee(Employee employee, EmployeeService service) {
		employee.setName("Pyae Phyo");
		employee.setAddress("Yangon");
		employee.setAge(30);
		employee.setId(1);

		// RideService rideService = new RideServiceImpl();
		service.updateEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testDeleteEmployee(Employee employee, EmployeeService service) {
		employee.setId(2);

		// RideService rideService = new RideServiceImpl();
		service.deleteEmployee(employee);
		System.out.println("Process Successful completed!");
	}
}
