package com.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminservice.model.AdminDet;

import com.adminservice.model.washerRating;
import com.adminservice.model.washpackages;
import com.adminservice.repository.AdminRepository;
import com.adminservice.repository.RatingRepository;
import com.adminservice.repository.WashRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repo;
	@Autowired
	private WashRepository repo1;
	@Autowired
	private RatingRepository repo2;

	@Override
	public List<AdminDet> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateadmin(AdminDet admin) {
		// TODO Auto-generated method stub
		repo.save(admin);
	}

	@Override
	public void deleteadmin(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void addadmin(AdminDet admin) {
		// TODO Auto-generated method stub
		repo.save(admin);
	}

//pack washers

	
	@Override
	public void save(washpackages wash) {
		// TODO Auto-generated method stub
		repo1.save(wash);
	}

	@Override
	public void updatepacks(washpackages wash) {
		// TODO Auto-generated method stub
		repo1.save(wash);
	}
	
	
	
	
	
	
	
	
	@Override
	public List<washpackages> getwashpack() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}

	@Override
	public void deletepack(int id) {
		// TODO Auto-generated method stub
		repo1.deleteById(id);
	}

	
	

//ratings

	@Override
	public void save(washerRating ratings) {
		// TODO Auto-generated method stub
		repo2.save(ratings);
	}

	@Override
	public List<washerRating> findAllRatings() {
		// TODO Auto-generated method stub
		return repo2.findAll();
	}


}