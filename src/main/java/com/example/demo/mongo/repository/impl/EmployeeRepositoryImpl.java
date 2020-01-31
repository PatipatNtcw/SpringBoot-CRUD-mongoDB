package com.example.demo.mongo.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.mongo.model.Employee;
import com.example.demo.mongo.repository.EmployeeRepository;
import com.example.demo.mongo.repository.custom.EmployeeRepositoryCustom;
import com.example.demo.rest.model.NameRequest;
import com.mongodb.MongoException;

public  class EmployeeRepositoryImpl implements EmployeeRepositoryCustom{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String insertName(NameRequest nameRequest) {
		try {
			Employee employee = new Employee();
			employee.setFirstName(nameRequest.getFirstName());
			employee.setLastName(nameRequest.getLastName());
			employeeRepository.save(employee);
			return "Success";
		} catch (MongoException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

}
