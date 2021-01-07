package com.example.polls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polls.model.Location;
import com.example.polls.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location save(Location location) {
		return locationRepository.save(location);
		
	}

	@Override
	public List<Location> getAllLocation() {
		List<Location> locationList;
		locationList = locationRepository.findAll();
		return locationList;
	}

	@Override
	public void deleteById(int id) {
		locationRepository.deleteById(id);
		
	}

	@Override
	public Location getById(int id) {
		return locationRepository.findById(id).get();
	
	}

	@Override
	public Location update(Location location) {
		
		return locationRepository.save(location);
	}

}
