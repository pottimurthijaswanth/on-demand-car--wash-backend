package com.paymentservice.service;




import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/*import com.paymentservice.model.DatabaseSequence;*/
import com.paymentservice.model.PaymentDetails;
import com.paymentservice.repo.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repo;

	public PaymentDetails doPay(PaymentDetails pay) {
		pay.setPaymentStatus(paymentStatus());
		pay.setTxId(UUID.randomUUID().toString());
		return repo.save(pay);
	}

	private String paymentStatus() {
		
		return new Random().nextBoolean()?"success":"failure";
	}
	
	
	 
	/*
	 * @Autowired private MongoOperations mongoOperations;
	 * 
	 * 
	 * 
	 * public long getSequenceNumber(String sequenceName) { //get sequence no Query
	 * query = new Query(Criteria.where("id").is(sequenceName)); //update the
	 * sequence no Update update = new Update().inc("seq", 1); //modify in document
	 * DatabaseSequence counter = mongoOperations.findAndModify(query, update,
	 * options().returnNew(true).upsert(true), DatabaseSequence.class);
	 * 
	 * 
	 * 
	 * return !Objects.isNull(counter) ? counter.getSeq() : 1;
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
}
