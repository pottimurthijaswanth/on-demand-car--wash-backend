package com.washerservice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washerservice.Model.Washerdetails;

public interface WasherRepo extends MongoRepository<Washerdetails, Integer> {

	List<Washerdetails> findBylocation(String location);
	
	Washerdetails findByName(String name);

	boolean save(int id);
	
}
