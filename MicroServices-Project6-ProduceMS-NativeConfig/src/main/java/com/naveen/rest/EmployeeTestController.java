package com.naveen.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeTestController {
	@Value("${dbuser}")
	private String user;
	
	@Value("${dbpassword}")
	private String password;
	
	@GetMapping("/info")
	public ResponseEntity<String> getConfigInfo(){
		
		return new ResponseEntity<String>(user+"  "+password,HttpStatus.OK);
		
		
	}

}
