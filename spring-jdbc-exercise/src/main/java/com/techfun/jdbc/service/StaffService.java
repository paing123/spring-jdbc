package com.techfun.jdbc.service;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;

public interface StaffService {
	public void createStaff(Staff staff,Role role);
}
