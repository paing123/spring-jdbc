package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.repository.EmployeeRepository;
import com.techfun.jdbc.repository.util.EmployeeRowMapper;

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
}
