package com.harsha.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.example.service.OrderService;
import com.harsha.example.vo.OrderVO;

@RestController
@RequestMapping("/order")
public class OrderController {

	private static final String MESSAGE_QUEUE = "order_message_queue";
	
	@Autowired
	OrderService service;   //depdendency injection
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@PostMapping
	public void createOrder(@Valid @RequestBody OrderVO order) {
		service.saveOrder(order);
		System.out.println(order.getItem());
	}
	@GetMapping
	public List<OrderVO> getOrders() {
		return service.getOrders();
	}
	
	@GetMapping("/search")
	public void searchOrder() {
		// Get JMS template bean reference

		for (int i = 1; i <= 10; i++)
		{
			OrderVO order = new OrderVO();
			order.setEmail("test");
			order.setId(1);
			order.setItem("item");
			order.setPrice(12.1f);
			order.setQuantity(12);
			// Send a message
			System.out.println("Sending a order " + i);
			jmsTemplate.convertAndSend(MESSAGE_QUEUE, order);
		}
		System.out.println("searchOrder called");
	}
	
	@PutMapping
	public void updateOrder() {
		System.out.println("updateOrder called");
	}
	
	@DeleteMapping
	public void deleteOrder(){
		System.out.println("deleteOrder called");
	}
}
