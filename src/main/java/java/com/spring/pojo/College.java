package com.spring.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College {

	int rollNumber;
	String address;
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
