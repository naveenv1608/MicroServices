package com.naveen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/api/shopping")
public class ShoppingOperationsController {
	
	@Autowired
	private BillingServiceConsumerClient client;
	
	@GetMapping("/generateBill")
	public ResponseEntity<String> generateBill(){
		
		String fetchBillingAmount = client.fetchBillingAmount();
		
		return new ResponseEntity<String>(fetchBillingAmount,HttpStatus.OK);
	}

}
