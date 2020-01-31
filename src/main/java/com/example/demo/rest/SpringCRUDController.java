/**
 * 
 */
package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Apiurl;
import com.example.demo.rest.model.NameRequest;
import com.example.demo.service.EmployeeService;

/**
 * @author patin457
 *
 */
@Controller
@RequestMapping(Apiurl.REST_HOME)
public class SpringCRUDController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(path = "/insertNmae",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
	public String insert(@RequestBody NameRequest nameRequest) {
		return employeeService.insertNmae(nameRequest);
	}
}
