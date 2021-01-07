package com.example.polls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.polls.model.Location;



@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
