package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import com.spring.business.CollegeOperation;

@Controller
public class CollegeUI {

	@Value("${student.name}")
	private String studentName;
	
	@Autowired
	private CollegeOperation collegeOperation;
	
	public void display()	{
		
	}
	
	public void addCollegeDetails(int rollnumber, String address) { 
		
		int rollnum = collegeOperation.addDetails(rollnumber, address);
		System.out.println("added new college details with roll number : " +rollnum);
		
		
	}
}
