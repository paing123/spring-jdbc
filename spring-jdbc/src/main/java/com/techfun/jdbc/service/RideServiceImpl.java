package com.techfun.jdbc.service;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepositoryImpl;

public class RideServiceImpl implements RideService {
	
	public void createRide(Ride ride) {
		RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepositoryImpl.createRide(ride);
	}
	
	public void updateRide(Ride ride) {
		RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepositoryImpl.updateRide(ride);
	}
	
	public void deleteRide(Ride ride) {
		RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepositoryImpl.deleteRide(ride);
	}
}
