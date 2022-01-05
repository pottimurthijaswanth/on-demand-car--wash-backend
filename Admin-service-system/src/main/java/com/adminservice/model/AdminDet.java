package com.adminservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Admindata")
public class AdminDet {

	@Id
	private int id;
	private String name;

	
	public AdminDet() {
		super();
	}
	
	
	
	public AdminDet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "AdminDet [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
