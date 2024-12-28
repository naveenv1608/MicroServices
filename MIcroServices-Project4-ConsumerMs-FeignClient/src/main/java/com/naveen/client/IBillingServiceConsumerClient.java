package com.naveen.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Biling-Service")
public interface IBillingServiceConsumerClient {
	
	@GetMapping("/api/billing/generateBill")
	public ResponseEntity<String>  fetchBillingInfo();

}
