package com.example.polls.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "location_tbl")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;
	private String locationName;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "vehicleId")
	private Vehicle vehicle;
	
	public Location()
	{
		
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	

}
