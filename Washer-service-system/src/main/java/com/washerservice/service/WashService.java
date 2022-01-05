package com.washerservice.service;

import java.util.List;



import com.washerservice.Model.Washerdetails;



public interface WashService {

	
	
	public Washerdetails addWasher(Washerdetails washer);

	public List<Washerdetails> getwashers();

	public List<Washerdetails> getwasherbylocation(String location);

	public void deletewasher(Washerdetails washer);

	public Long getSequenceNumber(String sequenceName); 

}
