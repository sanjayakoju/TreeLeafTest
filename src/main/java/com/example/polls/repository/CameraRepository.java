package com.example.polls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.polls.model.Camera;



@Repository
public interface CameraRepository extends JpaRepository<Camera, Integer> {

}
