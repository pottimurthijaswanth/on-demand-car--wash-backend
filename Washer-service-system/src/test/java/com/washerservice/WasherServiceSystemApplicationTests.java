package com.washerservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import com.washerservice.Model.Washerdetails;
import com.washerservice.Repository.WasherRepo;
import com.washerservice.service.WashService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WasherServiceSystemApplicationTests {

	@Autowired
	private WashService serv;
	
	@MockBean
	private WasherRepo repos;
	
	 @Test public void getUsersTest() { 
	       when(repos.findAll()).thenReturn(Stream
				  .of(new Washerdetails("jaswanth","srpt"),
				            new Washerdetails("munna","hyd")).collect(Collectors.toList()));
                 assertEquals(2, serv.getwashers().size());
				  }
	 
	 @Test public void getUserByAddressTest() { 
	       String location="cc";
	       when(repos.findBylocation(location))
				  .thenReturn(Stream.of(new Washerdetails("munna","hyd")).collect(Collectors.toList()));
						 
               assertEquals(1, serv.getwasherbylocation(location).size());
				  }
	 
	 @Test public void saveUserTest() {
		 Washerdetails washer = new Washerdetails("sathvik","USA");
		 when (repos.save(washer)).thenReturn(washer);
		 assertEquals(washer, serv.addWasher(washer));
	 }
	 
	 @Test public void deleteUserTest() {
		 Washerdetails washer = new Washerdetails("sathvik","USA");
		 serv.deletewasher(washer);
		 verify(repos,times(1)).delete(washer);
}
}
