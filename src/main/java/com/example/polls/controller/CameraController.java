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

import com.example.polls.model.Camera;
import com.example.polls.service.CameraServiceImpl;

@RestController
@RequestMapping("/api/camera")
public class CameraController {
	
	@Autowired
	CameraServiceImpl cameraServiceImpl;

	
	@PostMapping("/add")
	public ResponseEntity<String> saveCamera(@RequestBody Camera camera)
	{
		cameraServiceImpl.saveCamera(camera);
		return ResponseEntity.ok("Camera Save Successfully");
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Camera> getCameraById(@PathVariable int id)
	{
		Camera camera=cameraServiceImpl.getById(id);
		return ResponseEntity.ok().body(camera);
	}
	
	@GetMapping("/getAllCamera")
	public ResponseEntity<List<Camera>> getAllCamera()
	{
		List<Camera> cameraList=cameraServiceImpl.getAllCamera();
		return ResponseEntity.ok().body(cameraList);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		cameraServiceImpl.deleteById(id);
		return ResponseEntity.ok("Camera Delete Successfully");
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCamera(@RequestBody Camera camera)
	{
		cameraServiceImpl.update(camera);
		return ResponseEntity.ok("Camera Update Successfully");
	}
}
