package com.harsha.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmailService {

	@Autowired
	RestTemplate restTemplate;
	
	public String getEmailMessage() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://NOTIFICATION/notify",String.class);
		return response.getBody();
	}
}
