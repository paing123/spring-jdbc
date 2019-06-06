package com.techfun.jdbc.repository;

import java.sql.SQLException;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;

public interface StaffRepository {
	public void createStaff(Staff staff,Role role);
	
	void updateStaff(Staff staff);
	
	void deleteStaff(Staff staff,Role role);
	
	void insertStaffByID(Staff staff);
}
