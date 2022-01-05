package com.adminservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adminservice.model.washerRating;




@Repository
public interface RatingRepository extends MongoRepository<washerRating, String>{

}
