package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.service.StaffService;


public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		StaffService service = appContext.getBean("staffService", StaffService.class); 
		//testCreateStaff(service);
		//testUpdateStaff(service);
		testDelectStaff(service);
		//testCreateStaffID(service);
	}
	
	private static void testCreateStaff(StaffService service) {
		Staff staff = new Staff();
		Role role = new Role();
		staff.setStaffName("Phyo Paing");
		staff.setAge(21);
		staff.setPosition("Senior Instructor");
		role.setRoleName("Staff");

		service.createStaff(staff,role);
		System.out.println("Create Process Successful completed!");
	}
	
	private static void testCreateStaffID(StaffService service) {
		Staff staff = new Staff();
		staff.setStaffId(4);
		staff.setStaffName("Phyo Paing");
		staff.setAge(21);
		staff.setPosition("Senior Instructor");

		service.insertStaff(staff);
		System.out.println("Create Process Successful completed!");
	}
	
	private static void testDelectStaff(StaffService service) {
		Staff staff = new Staff();
		Role role = new Role();
		staff.setStaffId(8);
		service.deleteStaff(staff, role);
		System.out.println("Delete Process Successful completed!");
	}
	
	private static void testUpdateStaff(StaffService service) {
		Staff staff = new Staff();
		staff.setStaffName("Pyae Phyo Paing");
		staff.setAge(22);
		staff.setPosition("SI");
		staff.setStaffId(4);
		
		service.updateStaff(staff);
		System.out.println("Process Successful completed!");
	}	
}
