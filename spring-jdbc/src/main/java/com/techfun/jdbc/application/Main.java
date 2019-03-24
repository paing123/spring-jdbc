package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride ride = new Ride();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		RideService service = appContext.getBean("rideServiceImpl",RideServiceImpl.class);
		//testCreateRide(ride,service);
		//testUpdateRide(ride,service);
		testDeleteRide(ride,service);
		//testSelectRide(ride,service);
	}
	
	private static void testCreateRide(Ride ride,RideService service) {
		ride.setName("Phyo Paing");
		ride.setDuration(15);
		
		service.createRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testUpdateRide(Ride ride,RideService service) {
		ride.setName("Pyae Phyo");
		ride.setDuration(11);
		ride.setId(3);
		
		//RideService rideService = new RideServiceImpl();
		service.updateRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testDeleteRide(Ride ride,RideService service) {
		ride.setId(3);
		
		//RideService rideService = new RideServiceImpl();
		service.deleteRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testSelectRide(Ride ride,RideService service) {
		//RideService rideService = new RideServiceImpl();
		service.selectRide(ride);
		System.out.println("Process Successful completed!");
	}
}
