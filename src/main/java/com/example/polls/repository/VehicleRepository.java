package com.example.polls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.polls.model.Vehicle;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

//	@Query(value = "select * from book_tbl where title like :title%", nativeQuery = true)
//	public List<Book> findByTitle(@Param("title") String title);
//	
	@Query(value = "select * from vehicle_tbl as v inner join location_tbl as l on v.vehicle_id=l.vehicle_id inner join camera_tbl as c on v.vehicle_id=c.vehicle_id where l.location_name = :location and c.camera_location = :cameraLocation",nativeQuery = true)
	public List<Vehicle> findByLocationAndCamera(@Param("location") String location,@Param("cameraLocation") String cameraLocation);

	@Query(value = "select * from vehicle_tbl as v inner join location_tbl as l on v.vehicle_id=l.vehicle_id where l.location_name = :location",nativeQuery = true)
	List<Vehicle> findByLocation(@Param("location") String location);
	
	@Query(value = "select * from vehicle_tbl as v inner join camera_tbl as c on v.vehicle_id=c.vehicle_id where c.camera_location = :cameraLocation",nativeQuery = true)
	List<Vehicle> findByCamera(@Param("cameraLocation") String cameraLocation);
}
