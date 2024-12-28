package com.naveen.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/billing")
public class BillingOperationsController {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/getBill")
	public ResponseEntity<String> calculateBillAmount(){
		
		return new  ResponseEntity<String>("Total Bill =6000 "+port+" "+instanceId,HttpStatus.OK);
	}
	

}
