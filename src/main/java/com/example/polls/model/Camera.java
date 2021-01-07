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
@Table(name = "camera_tbl")
public class Camera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cameraId;
	
	private String cameraType;
	private String cameraLocation;
	
	public String getCameraLocation() {
		return cameraLocation;
	}

	public void setCameraLocation(String cameraLocation) {
		this.cameraLocation = cameraLocation;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "vehicleId")
	private Vehicle vehicle;

	public int getCameraId() {
		return cameraId;
	}

	public void setCameraId(int cameraId) {
		this.cameraId = cameraId;
	}

	public String getCameraType() {
		return cameraType;
	}

	public void setCameraType(String cameraType) {
		this.cameraType = cameraType;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Camera()
	{
		
	}

}
