package com.userservice;

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

import com.userservice.model.Signup;
import com.userservice.repo.userRepository;
import com.userservice.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
class UserservicesApplicationTests {

	  @Autowired
	   private UserService serv;
	   
	   @MockBean
	   private userRepository repo;
		
		
		
		  @Test 
		  public void getUsersTest() { 
		       when(repo.findAll()).thenReturn(Stream
					  .of(new Signup("sai","jash","S1234","S1234","123242" ,"sai@1234"),
					            new Signup("jash","p","J2345","J2345","123242","jas@7865")).collect(Collectors.toList()));

					  assertEquals(2, serv.getuser().size());
					  }
		  
		  
		@Test
		public void saveuserTest() {
			Signup user = new Signup("jahn","boss","J4567","J4567","612312421" ,"jahn@4321");
			when(repo.save(user)).thenReturn(user);
			assertEquals(user,serv.addUser(user));
		}


		
		
		  @Test public void deleteUserTest(){ 
		  Signup user = new Signup("jahn","boss","J4567","J4567", "612312421" ,"jahn@4321");
		  serv.deleteUser(user); verify(repo,times(1)).delete(user);
		  
		  
		  }
		 

	}

