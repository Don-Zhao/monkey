package com.monkey.service.impl;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import com.monkey.service.JmsService;

@Service
public class JmsServiceImpl implements JmsService {

	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private Topic topic;
	
	@Override
	public void sendMessage(Destination destination, String message) {
		jmsTemplate.convertAndSend(destination, message);
	}

	@Override
	public void sendMessage(String message) {
		jmsTemplate.convertAndSend(this.queue, message);
	}
	
	@Override
	public void publish(String message) {
		jmsTemplate.convertAndSend(this.topic, message);
	}

}
