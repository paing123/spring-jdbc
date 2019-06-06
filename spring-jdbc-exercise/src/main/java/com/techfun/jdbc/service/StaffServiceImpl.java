package com.techfun.jdbc.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.repository.StaffRepository;

@Service("staffService")
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepository;

	public void createStaff(Staff staff,Role role) {
		staffRepository.createStaff(staff, role);
	}
	
	public void updateStaff(Staff staff) {
		staffRepository.updateStaff(staff);
	}
	
	public void deleteStaff(Staff staff,Role role) {
		staffRepository.deleteStaff(staff, role);
	}
	
	public void insertStaff(Staff staff){
		staffRepository.insertStaffByID(staff);
	}
}
