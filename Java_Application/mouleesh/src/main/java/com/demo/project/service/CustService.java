package com.demo.project.service;

import java.util.List;
import com.demo.project.entity.Customer;

public interface CustService {
	
	public List<Customer> getDetails();
	public Customer getDetails (long customerId); 
	public Customer updateDetails (Customer customer); 
	public Customer addDetails (Customer customer);
	public void deleteDetails (long parseLong);

}
	
