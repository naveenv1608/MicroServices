package com.naveen.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/billing")
public class BillingGenerationController {

	@GetMapping("/generateBill")
	public ResponseEntity<String> generateBillAmount() {
		return new ResponseEntity<String>("total Bill = 90000", HttpStatus.OK);
	}

}
