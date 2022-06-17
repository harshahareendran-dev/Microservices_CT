package com.harsha.notif.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

	@GetMapping
	public String getNotificMsg() {
		return "You Have a Message";
	}
}
