package com.paymentservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paymentservice.model.PaymentDetails;

public interface PaymentRepository extends MongoRepository<PaymentDetails, Long>{
	

}
