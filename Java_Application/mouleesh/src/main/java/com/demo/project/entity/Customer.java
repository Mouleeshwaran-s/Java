package com.demo.project.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Customer")
public class Customer {
	@Id
	private long id;
	private String custName;
	private String custGender;
	private LocalDate custDob;
	private int custAge;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long id, String custName, String custGender, LocalDate custDob, int custAge) {
		super();
		this.id = id;
		this.custName = custName;
		this.custGender = custGender;
		this.custDob = custDob;
		this.custAge = custAge;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustGender() {
		return custGender;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	public LocalDate getCustDob() {
		return custDob;
	}
	public void setCustDob(LocalDate custDob) {
		this.custDob = custDob;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", custGender=" + custGender + ", custDob=" + custDob
				+ ", custAge=" + custAge + "]";
	}


}
