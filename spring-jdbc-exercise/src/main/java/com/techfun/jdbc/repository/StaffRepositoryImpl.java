
package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;

@Repository("staffRepository")
public class StaffRepositoryImpl implements StaffRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void createStaff(Staff staff, Role role) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				PreparedStatement ps = con.prepareStatement("insert into staff (staffname,age,position) values (?,?,?)",
						new String[] { "staffid" });
				ps.setString(1, staff.getStaffName());
				ps.setInt(2, staff.getAge());
				ps.setString(3, staff.getPosition());
				return ps;
			}
		}, keyHolder);

		jdbcTemplate.update("insert into role(staffid,rolename) values(?,?) ", keyHolder.getKey(), role.getRoleName());
	}

	@Transactional
	public void deleteStaff(Staff staff, Role role) {
		jdbcTemplate.update("DELETE from staff WHERE staffid = ?", staff.getStaffId());
		jdbcTemplate.update("DELETE from role WHERE staffid = ?", staff.getStaffId());
	}

	public void updateStaff(Staff staff) {
		jdbcTemplate.update("UPDATE staff SET staffname = ?,  age = ?, position = ? WHERE staffid = ?",
				staff.getStaffName(), staff.getAge(), staff.getPosition(), staff.getStaffId());
	}
	
	public void insertStaffByID(Staff staff){
		try {
		jdbcTemplate.update("insert into staff (staffid,staffname,age,position) values (?.?,?,?)", staff.getStaffId(),
				staff.getStaffName(), staff.getAge(), staff.getPosition());
		}catch(Exception e)
		{
			System.out.print("Duplicate! Can't inset!");
		}
	}
}