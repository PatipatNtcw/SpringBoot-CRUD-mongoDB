package com.example.demo.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.mongo.model.Employee;
import com.example.demo.mongo.repository.custom.EmployeeRepositoryCustom;

public interface EmployeeRepository extends MongoRepository<Employee, String>,EmployeeRepositoryCustom{

}
