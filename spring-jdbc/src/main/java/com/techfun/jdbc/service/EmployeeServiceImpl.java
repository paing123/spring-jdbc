package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void createEmployee(Employee employee) {

		// RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		employeeRepository.createEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		// RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		employeeRepository.updateEmployee(employee);
	}

	public void deleteEmployee(Employee employee) {
		// RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		employeeRepository.deleteEmployee(employee);
	}
	
	@Override
	public List<Employee> selectEmployee() {
		return employeeRepository.selectEmployee();
	}
	
	public void createEmployeeAndRide(Employee employee,Ride ride) {

		// RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		employeeRepository.createEmployeeAndRide(employee, ride);
	}

}
