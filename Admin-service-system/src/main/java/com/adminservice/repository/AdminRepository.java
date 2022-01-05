package com.adminservice.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adminservice.model.AdminDet;



@Repository
public interface AdminRepository extends MongoRepository<AdminDet, Integer> {
	

}