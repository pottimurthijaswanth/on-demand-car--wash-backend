package com.adminservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

import com.adminservice.model.AdminDet;

import com.adminservice.model.OrderDet;

import com.adminservice.model.washerRating;
import com.adminservice.model.washpackages;
import com.adminservice.service.AdminService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/admin")
public class Controller {

	@Autowired
	private AdminService service;

	@Autowired
	private RestTemplate restTemplate;

	// admins

	@PostMapping("/addadmin")
	@ApiOperation(value = "To add admin")
	public String addadmin(@RequestBody AdminDet admin) {
		service.addadmin(admin); // User will save details
		return "Admin saved Successfully with id :" + admin.getId();
	}

	@PutMapping("/update")
	@ApiOperation(value = "To update the admin details")
	public String updateDetails(@RequestBody AdminDet admin) {
		service.updateadmin(admin);
		return "update Succesfully";

	}

	@GetMapping("/alladmin")
	@ApiOperation(value = "To get List of all admins")
	public List<AdminDet> getadmin() {
		return service.findAll();
	}

	@DeleteMapping("/delete")
	@ApiOperation(value = "To delete admin")
	public String deleteadmin(@RequestParam int id) {
		service.deleteadmin(id);
		return "delete Succesfully";
	}

	// washpacks

	@PostMapping("/addpack")
	@ApiOperation(value = "To add packages")
	public String savepack(@RequestBody washpackages wash) {
		service.save(wash);// user will save his details
		return "pack added Succesfully";
	}

	@GetMapping("/allpacks")
	@ApiOperation(value = "To view all packages")
	public List<washpackages> getwashpacks() {
		return service.getwashpack();

	}

	@PutMapping("/packupdate")
	@ApiOperation(value = "To update the package")
	public String updatepacks(@RequestBody washpackages wash, @RequestParam int id) {
		service.updatepacks(wash);
		return "updated pack Succesfully";
	}

	@DeleteMapping("/packdelete")
	@ApiOperation(value = "To delete the package")

	public String deletepack(@RequestBody washpackages wash, @RequestParam int id) {
		service.deletepack(id);
		return "deleted pack Succesfully";
	}

	// ratings

	@PostMapping("/addratings")
	@ApiOperation(value = "To add rating")
	public String saveratings(@RequestBody washerRating rating) {
		service.save(rating);
		return "Thanks for ur valuable feedback!!!";
	}

	@GetMapping("/rating/allratings")
	@ApiOperation(value = "To get all ratings ")
	public List<washerRating> findAllRatings() {
		return service.findAllRatings();
	}

	@GetMapping("/allorders")
	@ApiOperation(value = "To get List of all orders")
	public List<OrderDet> getallorders() {
		String baseurl = "http://localhost:8084/od/allorders";
		OrderDet[] allorders = restTemplate.getForObject(baseurl, OrderDet[].class);

		return Arrays.asList(allorders);
	}

	@GetMapping("/allwashers")
	@ApiOperation(value = "To get List of all washers")
	public List<washpackages> getallwashers() {
		String baseurl = "http://localhost:8083/wash/allwashers";
		washpackages[] allwashers = restTemplate.getForObject(baseurl, washpackages[].class);
		return Arrays.asList(allwashers);
	}

}
