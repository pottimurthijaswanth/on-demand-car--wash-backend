package com.adminservice.service;

import java.util.List;

import com.adminservice.model.AdminDet;

import com.adminservice.model.washerRating;
import com.adminservice.model.washpackages;

public interface AdminService {

	//Admin
	public List<AdminDet> findAll();
	 public void updateadmin(AdminDet admin);
	    public void deleteadmin(int id);
	    public void addadmin(AdminDet admin);

	//packs
	    
	    public void save(washpackages wash);
	    public List<washpackages> getwashpack();
	    public void deletepack(int id);
		public void updatepacks(washpackages wash);

		//ratings
		public void save(washerRating ratings);
		public List<washerRating> findAllRatings();
	    
}
