package com.example.polls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polls.model.Camera;
import com.example.polls.repository.CameraRepository;

@Service
public class CameraServiceImpl implements CameraService {
	
	@Autowired
	CameraRepository cameraRepository;

	@Override
	public Camera saveCamera(Camera camera) {
		return cameraRepository.save(camera);
		
	}

	@Override
	public List<Camera> getAllCamera() {
		List<Camera> cameraList;
		cameraList = cameraRepository.findAll();
		return cameraList;
	}

	@Override
	public void deleteById(int id) {
		cameraRepository.deleteById(id);
		
	}

	@Override
	public Camera getById(int id) {
		Camera camera=cameraRepository.findById(id).get();
		return camera;
	}

	@Override
	public Camera update(Camera camera) {
		
		return cameraRepository.save(camera);
	}

}
