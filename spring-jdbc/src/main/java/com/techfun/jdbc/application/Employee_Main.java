package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.EmployeeService;

public class Employee_Main {
	public static void main(String args[]) {
		// Employee employee = new Employee();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService service = appContext.getBean("employeeService", EmployeeService.class);
		// testCreateEmployee(service);
		// testUpdateEmployee(service);
		//testDeleteEmployee(service);
		//testSelectEmployee(service);
		//testCreateEmployeeAndRide(service);
		//testCountEmployee(service);
		testEmployeeID(service);
	}

	private static void testCreateEmployee(EmployeeService service) {
		Employee employee = new Employee();
		employee.setName("Phyo Paing");
		employee.setAddress("Bago-Hnin thar Gonne");
		employee.setAge(22);

		service.createEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testUpdateEmployee(EmployeeService service) {
		Employee employee = new Employee();
		employee.setName("Pyae Phyo Paing");
		employee.setAddress("Bago");
		employee.setAge(20);
		employee.setId(1);

		service.updateEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testDeleteEmployee(EmployeeService service) {
		Employee employee = new Employee();
		employee.setId(5);
		service.deleteEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testSelectEmployee(EmployeeService service) {
		List<Employee> employees = service.selectEmployee();
		for (Employee emp : employees) {
			System.out.println("ID is " + emp.getId());
			System.out.println("Name is " + emp.getName());
			System.out.println("Address is " + emp.getAddress());
			System.out.println("Age is " + emp.getAge());
			System.out.println("--------------------------");
		}
	}
	
	private static void testEmployeeID(EmployeeService service) {
		Employee employee = new Employee();
		employee.setId(1);
		
		Employee emp = service.selectEmployeeID(employee);
		System.out.println("ID is " + emp.getId());
		System.out.println("Name is " + emp.getName());
		System.out.println("Address is " + emp.getAddress());
		System.out.println("Age is " + emp.getAge());
	}
	
	private static void testCreateEmployeeAndRide(EmployeeService service) {
		Employee employee = new Employee();
		Ride ride = new Ride();
		employee.setName("Paing");
		employee.setAddress("Bago-Hnin thar Gone");
		employee.setAge(22);
		
		ride.setName("PPP123");
		ride.setDuration(15);

		service.createEmployeeAndRide(employee, ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testCountEmployee(EmployeeService service) {
		System.out.println("The number of row is "+service.totalEmployeeCount());
	}
}
