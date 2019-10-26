package com.monkey.service;

import javax.jms.Destination;

public interface JmsService {
	
	public void sendMessage(Destination destination, final String message);
	
	public void sendMessage(final String message);
	
	public void publish(String message);
}
