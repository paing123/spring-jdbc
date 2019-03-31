package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.EmployeeService;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		RideService service = appContext.getBean("rideService",RideService.class);
		//testCreateRide(service);
		//testUpdateRide(service);
		//testDeleteRide(service);
		//selectRide(service);
		//testCountRide(service);
		testRideID(service);
	}
	
	private static void testCreateRide(RideService service) {
		Ride ride = new Ride();
		ride.setName("Phyo Paing");
		ride.setDuration(15);
		
		service.createRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testUpdateRide(RideService service) {
		Ride ride = new Ride();
		ride.setName("Pyae Phyo");
		ride.setDuration(11);
		ride.setId(3);
		
		service.updateRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testDeleteRide(RideService service) {
		Ride ride = new Ride();
		ride.setId(3);
		
		service.deleteRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void selectRide(RideService service) {
		List<Ride> rides = service.selectRide();
		for (Ride ride : rides) {
			System.out.println("ID is " + ride.getId());
			System.out.println("Name is " + ride.getName());
			System.out.println("Duration is " + ride.getDuration());
		}
	}
	
	private static void testRideID(RideService service) {
		Ride r = new Ride();
		r.setId(1);
		
		Ride ride = service.selectRideID(r);
		System.out.println("ID is " + ride.getId());
		System.out.println("Name is " + ride.getName());
		System.out.println("Duration is " + ride.getDuration());
	}
	
	private static void testCountRide(RideService service) {
		System.out.println("The number of row is "+service.totalRideCount());
	}
	
}
