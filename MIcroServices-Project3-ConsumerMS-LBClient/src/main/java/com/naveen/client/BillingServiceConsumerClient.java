package com.naveen.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String fetchBillingAmount() {
		
		//Fetch the eureka client which is having less Load factor
		ServiceInstance instance = client.choose("Billing-Service");
		
		//get instance URI
		URI uri = instance.getUri();
		
		//prepare Instance related complete url path 
		String url=uri.toString()+"/api/billing/getBill";
		
		RestTemplate restTemplate= new RestTemplate();
		
		//calling the billing service
		ResponseEntity<String> response=restTemplate.getForEntity(url, String.class);
		
		String responseBody=response.getBody();
		
		return responseBody;
		
		
		
	}

}
