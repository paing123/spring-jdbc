
package com.techfun.jdbc.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.techfun.jdbc.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("employeeid"));
		employee.setName(rs.getString("name"));
		employee.setAddress(rs.getString("address"));
		employee.setAge(rs.getInt("age"));
		
		return employee;
	}
	
}