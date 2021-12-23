package com.spring.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.pojo.College;


public class CollegeInMemoryDao implements ColllegeDao{

	@Autowired
	public College college;
	
	Map<Integer, College> clgMap = new HashMap<>();
	
	public College addDetails(College college) {
		
		College result = clgMap.put(college.getRollNumber(), college);
		
		return result;
		
	}
	
}
