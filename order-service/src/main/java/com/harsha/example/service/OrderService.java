package com.harsha.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.harsha.example.client.IEmailService;
import com.harsha.example.repository.OrderRepositroy;
import com.harsha.example.vo.OrderVO;

@Service       //Bean
public class OrderService {
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	OrderRepositroy orderRepositroy;
	@Autowired
	IEmailService emailService;
	
	public void saveOrder(OrderVO order) {
		orderRepositroy.save(order);
		//RestTemplate
		//ResponseEntity<String> response =  restTemplate.getForEntity("http://EMAIL-SERVICE/email", String.class);
		//Feign Client
		String response = emailService.sendEmail();
		//System.out.println("Reseponse from rest call"+response.getBody()); 
		System.out.println("Reseponse from Feign call>>"+response);
		System.out.println("in service");
	}
	public List<OrderVO> getOrders() {
		return orderRepositroy.findAll();
	}
}
