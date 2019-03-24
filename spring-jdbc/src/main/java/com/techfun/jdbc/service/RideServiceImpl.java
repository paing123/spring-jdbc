package com.techfun.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepository;

@Service("rideServiceImpl")
public class RideServiceImpl implements RideService {
	
	@Autowired
	private RideRepository rideRepository;
	
	public void createRide(Ride ride) {
		
		//RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepository.createRide(ride);
	}
	
	public void updateRide(Ride ride) {
		//RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepository.updateRide(ride);
	}
	
	public void deleteRide(Ride ride) {
		//RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepository.deleteRide(ride);
	}
	
	public void selectRide(Ride ride) {
		//RideRepositoryImpl rideRepositoryImpl = new RideRepositoryImpl();
		rideRepository.selectRide(ride);
	}
}
