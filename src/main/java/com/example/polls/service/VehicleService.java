package com.example.polls.service;

import java.util.List;

import com.example.polls.model.Vehicle;


public interface VehicleService {
	
	Vehicle addVehicle(Vehicle vehicle);
	void deleteById(int id);
	Vehicle getById(int id);
	public Vehicle update(Vehicle vehicle);
	List<Vehicle> getAll();
	
	List<Vehicle> getVehicleByLocationAndCamera(String location, String cameraLocation);
	List<Vehicle> getByLocation(String location);
	List<Vehicle> getByCamera(String camera);
}
