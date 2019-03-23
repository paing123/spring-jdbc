package com.techfun.jdbc.application;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride ride = new Ride();
		testCreateRide(ride);
		
	}
	
	private static void testCreateRide(Ride ride) {
		ride.setName("Pyae Phyo Paing");
		ride.setDuration(12);
		
		RideService rideService = new RideServiceImpl();
		rideService.createRide(ride);
		System.out.println("Successful inserted!");
	}
}
