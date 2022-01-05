package com.washerservice.Model;



import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Washdata")
public class Washerdetails {

	@Id
	private Long id;
	private String name;
	private String location;
	
	
	
	 @Transient
	    public static final String SEQUENCE_NAME = "users_sequence"; 
	
	public Washerdetails() {
		super();
	}
	public Washerdetails(String name, String location) {
		super();
		
		this.name = name;
		this.location = location;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	
	
	
	@Override
	public String toString() {
		return "Washerdetails [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
}
