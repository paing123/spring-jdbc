package com.techfun.jdbc.service;

import java.sql.SQLException;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;

public interface StaffService {
	public void createStaff(Staff staff,Role role);
	
	public void updateStaff(Staff staff);
	
	public void deleteStaff(Staff staff,Role role);
	
	public void insertStaff(Staff staff);
}
