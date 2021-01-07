package com.example.polls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polls.model.Vehicle;
import com.example.polls.service.VehicleServiceImpl;



@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;
	
	@PostMapping("/add")
	public String add(@RequestBody Vehicle vehicle)
	{
		vehicleServiceImpl.addVehicle(vehicle);
		return "Vehicle Added successFully";
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Vehicle vehicle)
	{
		vehicleServiceImpl.update(vehicle);
		return ResponseEntity.ok("Vehicle Updated Successfully");
	}
	
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Vehicle> getById(@PathVariable int id)
	{
		Vehicle vehicle=vehicleServiceImpl.getById(id);
		return ResponseEntity.ok().body(vehicle);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteVehicle(@PathVariable int id)
	{
		vehicleServiceImpl.deleteById(id);
		return ResponseEntity.ok("Vehicle Delete Successfully");
	}
	
	@GetMapping("/getAllVehicle")
	public ResponseEntity<List<Vehicle>> getAllVehicle()
	{
		List<Vehicle> listVehicle = vehicleServiceImpl.getAll();
		return ResponseEntity.ok().body(listVehicle);
	}
	
	@GetMapping("/getVehicleByLocationAndCamera/{location}/{camera}")
	public ResponseEntity<List<Vehicle>> getVehicleByLocationAndCamera(@PathVariable String location, @PathVariable String camera)
	{
		List<Vehicle> listVehicle = vehicleServiceImpl.getVehicleByLocationAndCamera(location, camera);
		return ResponseEntity.ok().body(listVehicle);
	}
	
	@GetMapping("/getByLocation/{location}")
	public ResponseEntity<List<Vehicle>> getByLocation(@PathVariable String location)
	{
		List<Vehicle> listVehicle = vehicleServiceImpl.getByLocation(location);
		return ResponseEntity.ok().body(listVehicle);
	}
	
	@GetMapping("/getByCamera/{cameraLocation}")
	public ResponseEntity<List<Vehicle>> getByCameraLocation(@PathVariable String cameraLocation)
	{
		List<Vehicle> listVehicle = vehicleServiceImpl.getByCamera(cameraLocation);
		return ResponseEntity.ok().body(listVehicle);
	}

}
