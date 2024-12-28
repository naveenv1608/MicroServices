package com.naveen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.client.IBillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingOperationsController {
	@Autowired
	private IBillingServiceConsumerClient client;
	
	@GetMapping("/generateBill")
	public ResponseEntity<String> generateBill(){
		ResponseEntity<String> fetchBillingInfo = client.fetchBillingInfo();
		
		String result=fetchBillingInfo.getBody();
		
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}

}
