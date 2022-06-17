package com.harsha.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.email.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	EmailService emailService;

	@GetMapping
	public String sendEmail() {
		String msg = emailService.getEmailMessage();
		System.out.println("Email Sent: "+msg);
		return "Email Sent : "+msg;
	}
}
