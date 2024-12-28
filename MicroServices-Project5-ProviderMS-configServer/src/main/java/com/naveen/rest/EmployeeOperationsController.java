package com.naveen.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationsController {
	
	@Value("${dbuser}")
	private String dbuser;
	
	@Value("${dbpassword}")
	private String dbpwd;
	
	@GetMapping("/details")
	public ResponseEntity<String> getDBDetails(){
		return new ResponseEntity<String>(dbuser+"    "+dbpwd,HttpStatus.OK);
	}

}
