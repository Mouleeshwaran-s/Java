package com.demo.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.entity.Customer;

public interface CustRepo extends JpaRepository<Customer, Long> {

}
