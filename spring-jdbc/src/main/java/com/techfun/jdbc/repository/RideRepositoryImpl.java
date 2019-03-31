package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.util.EmployeeRowMapper;
import com.techfun.jdbc.repository.util.RideRowMapper;

@Repository("rideRepository")
public class RideRepositoryImpl implements RideRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createRide(Ride ride) {
		jdbcTemplate.update("insert into ride(name,duration) values(?,?) ", ride.getName(), ride.getDuration());
		System.out.println("Test Transaction");
	}

	public void updateRide(Ride ride) {
		jdbcTemplate.update("UPDATE ride SET name = ?,duration = ? WHERE id = ?", ride.getName(), ride.getDuration(),
				ride.getId());
	}

	public void deleteRide(Ride ride) {
		jdbcTemplate.update("DELETE from ride WHERE id = ?",ride.getId());
	}
	
	@Override
	public List<Ride> selectRide() {
		List<Ride> ride = jdbcTemplate.query("select * from ride",new RideRowMapper());	
		return ride;
	}
	
	public int totalRideCount() {
		String sql = "select count(*) from ride";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	@Override
	public Ride selectRideID(Ride r) {
		String sql = "select * from ride where id = ?";
		Ride ride = (Ride)jdbcTemplate.queryForObject(sql,new RideRowMapper(),r.getId());
		return ride;
	}
}
