package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepository;

@Service("rideService")
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
	
	@Override
	public List<Ride> selectRide() {
		return rideRepository.selectRide();
	}
	
	public int totalRideCount() {
		return rideRepository.totalRideCount();
	}
	
	public Ride selectRideID(Ride ride) {
		return rideRepository.selectRideID(ride);
	}
	
}
