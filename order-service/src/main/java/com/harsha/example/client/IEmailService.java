package com.harsha.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:8081/email",name="EmailCall")
public interface IEmailService {

	@RequestMapping(method = RequestMethod.GET)
	public String sendEmail();
}
