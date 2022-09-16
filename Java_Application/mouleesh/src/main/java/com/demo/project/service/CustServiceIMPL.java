package com.demo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.Customer;
import com.demo.project.repo.CustRepo1;
@Service
public class CustServiceIMPL implements CustService {
	@Autowired
	private CustRepo1 custRepo;
	@Override
	public List<Customer> getDetails() {
		return custRepo.findAll();
	}

	@Override
	public Customer getDetails(long customerId) {
		return custRepo.getOne(customerId);
	}

	@Override
	public Customer updateDetails(Customer customer) {
		custRepo.save(customer);
		return customer;
	}

	@Override
	public Customer addDetails(Customer customer) {
		custRepo.save(customer);
		return customer;
	}

	@Override
	public void deleteDetails(long id) {
		Customer ent =custRepo.getOne(id);
		custRepo.delete(ent);
	}

}
