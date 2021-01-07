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

import com.example.polls.model.Location;
import com.example.polls.service.LocationServiceImpl;

@RestController
@RequestMapping("/api/location")
public class LocationController {

	@Autowired
	LocationServiceImpl locationServiceImpl;
	
	@PostMapping("/add")
	public ResponseEntity<String> saveLocation(@RequestBody Location location)
	{
		locationServiceImpl.save(location);
		return ResponseEntity.ok("Location Save Successfully");
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Location> getLocationById(@PathVariable int id)
	{
		Location location=locationServiceImpl.getById(id);
		return ResponseEntity.ok().body(location);
	}
	
	@GetMapping("/getAllLocation")
	public ResponseEntity<List<Location>> getAllLocation()
	{
		List<Location> locationList=locationServiceImpl.getAllLocation();
		return ResponseEntity.ok().body(locationList);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		locationServiceImpl.deleteById(id);
		return ResponseEntity.ok("Location Delete Successfully");
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateLocation(@RequestBody Location location)
	{
		locationServiceImpl.update(location);
		return ResponseEntity.ok("Location Update Successfully");
	}
}
