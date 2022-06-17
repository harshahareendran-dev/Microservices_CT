package com.harsha.email.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.harsha.email.vo.OrderVO;


@Component
public class OrderReceiver {
	private static final String MESSAGE_QUEUE = "order_message_queue";

	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(OrderVO order) {
		System.out.println("Received " + order);
		//throwexception(order);
	}
}
