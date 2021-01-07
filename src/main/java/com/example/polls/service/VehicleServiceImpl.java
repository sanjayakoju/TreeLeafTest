package com.example.polls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polls.model.Vehicle;
import com.example.polls.repository.VehicleRepository;



@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		
		return vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteById(int id) {
		vehicleRepository.deleteById(id);
		
	}

	@Override
	public Vehicle getById(int id) {
		Vehicle vehicle = vehicleRepository.findById(id).get();
		return vehicle;
	}

	@Override
	public Vehicle update(Vehicle vehicle) {
		
		return vehicleRepository.save(vehicle);
	}

	@Override
	public List<Vehicle> getAll() {
		List<Vehicle> vehicleList;
		vehicleList = vehicleRepository.findAll();
		return vehicleList;
	}

	@Override
	public List<Vehicle> getVehicleByLocationAndCamera(String location, String cameraLocation) {
		return vehicleRepository.findByLocationAndCamera(location, cameraLocation);
	}

	@Override
	public List<Vehicle> getByLocation(String location) {
		
		return vehicleRepository.findByLocation(location);
	}

	@Override
	public List<Vehicle> getByCamera(String camera) {
		
		return vehicleRepository.findByCamera(camera);
	}

}
