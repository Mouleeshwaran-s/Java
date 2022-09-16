package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Customer;
import com.demo.project.service.CustService;

@RestController
public class MyController {
	@Autowired
	private CustService cs;
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home Page";
	}
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return this.cs.getDetails();
	}
	@GetMapping("/customer/{customerid}")
	public Customer getCustomer(@PathVariable String customerid) {
		return this.cs.getDetails(Long.parseLong(customerid));
	}
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.cs.addDetails(customer);
	}
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.cs.updateDetails(customer);
	}
	@DeleteMapping("/customer/{customerid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String customerid){
		try {
			this.cs.deleteDetails(Long.parseLong(customerid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

}
