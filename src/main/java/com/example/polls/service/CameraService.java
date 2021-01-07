package com.example.polls.service;

import java.util.List;

import com.example.polls.model.Camera;

public interface CameraService {
	
	public Camera saveCamera(Camera camera);
	public List<Camera> getAllCamera();
	public void deleteById(int id);
	public Camera getById(int id);
	public Camera update(Camera camera);

}
