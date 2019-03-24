package com.techfun.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.repository.EmployeeRepository;

@Service("employeeServiceImpl")
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
}
