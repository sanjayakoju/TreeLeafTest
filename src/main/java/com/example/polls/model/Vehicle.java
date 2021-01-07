package com.example.polls.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_tbl")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;
	
	private int model;
	private String vehicleType;
	private String manufactureDate;
	private String number;
	private String color;
	private String ownerName;
	private String engineCC;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "vehicleId")
	private Set<Location> location;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "vehicleId")
	private Set<Camera> camera;


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getEngineCC() {
		return engineCC;
	}


	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}


	public Set<Location> getLocation() {
		return location;
	}


	public void setLocation(Set<Location> location) {
		this.location = location;
	}


	public Set<Camera> getCamera() {
		return camera;
	}


	public void setCamera(Set<Camera> camera) {
		this.camera = camera;
	}


	public Vehicle(int vehicleId, int model, String vehicleType, String manufactureDate, String number, String color,
			String ownerName, String engineCC, Set<Location> location, Set<Camera> camera) {
		super();
		this.vehicleId = vehicleId;
		this.model = model;
		this.vehicleType = vehicleType;
		this.manufactureDate = manufactureDate;
		this.number = number;
		this.color = color;
		this.ownerName = ownerName;
		this.engineCC = engineCC;
		this.location = location;
		this.camera = camera;
	}


	
	
	public Vehicle() {
		
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", vehicleType=" + vehicleType
				+ ", manufactureDate=" + manufactureDate + ", number=" + number + ", color=" + color + ", ownerName="
				+ ownerName + ", engineCC=" + engineCC + ", location=" + location + ", camera=" + camera + "]";
	}

	
}
