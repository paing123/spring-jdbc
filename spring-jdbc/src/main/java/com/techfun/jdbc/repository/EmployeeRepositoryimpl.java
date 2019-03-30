package com.techfun.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.repository.util.EmployeeRowMapper;

@Repository("employeeRepository")
public class EmployeeRepositoryimpl implements EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createEmployee(Employee employee) {
		jdbcTemplate.update("insert into employee(name,address,age) values(?,?,?) ", employee.getName(),
				employee.getAddress(), employee.getAge());
	}

	public void updateEmployee(Employee employee) {
		jdbcTemplate.update("UPDATE employee SET name = ?,address = ?,age = ? WHERE employeeid = ?", employee.getName(),
				employee.getAddress(), employee.getAge(), employee.getId());
	}

	public void deleteEmployee(Employee employee) {
		jdbcTemplate.update("DELETE from employee WHERE employeeid = ?", employee.getId());
	}
	
	@Override
	public List<Employee> selectEmployee() {
		List<Employee> employee = jdbcTemplate.query("select * from employee",new EmployeeRowMapper());	
		return employee;
	}
}
