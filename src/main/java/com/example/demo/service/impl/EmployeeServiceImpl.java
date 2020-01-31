package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mongo.repository.EmployeeRepository;
import com.example.demo.rest.model.NameRequest;
import com.example.demo.service.EmployeeService;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String insertNmae(NameRequest nameRequest) {
		String result;
		result = employeeRepository.insertName(nameRequest);
		return result;
	}

}
