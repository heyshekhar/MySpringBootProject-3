package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.CollegeInMemoryDao;
import com.spring.dao.ColllegeDao;
import com.spring.pojo.College;

@Service
public class CollegeIMPL implements CollegeOperation{
	
	@Autowired
	private ColllegeDao collegeDao;
	
	@Autowired
	private College college;
	
	public int addDetails(int rollnumber, String address) {
		
		college.setRollNumber(rollnumber);
		college.setAddress(address);
		College result = collegeDao.addDetails(college);
		return result.getRollNumber();
	}

}
