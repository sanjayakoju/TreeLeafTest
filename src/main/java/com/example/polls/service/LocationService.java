package com.example.polls.service;

import java.util.List;


import com.example.polls.model.Location;

public interface LocationService {

	public Location save(Location location);
	public List<Location> getAllLocation();
	public void deleteById(int id);
	public Location getById(int id);
	public Location update(Location location);
}
