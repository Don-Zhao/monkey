package com.monkey.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *  发布订阅模型
 * @author zhao.jiahong
 *
 */
@Component
public class MonkeySubscriber {

	@JmsListener(destination="monkey.topic", containerFactory="jmsListenerContainerTopic")
	public void consume1(String message) {
		System.out.println("consume1:" + message);
	}
	
	@JmsListener(destination="monkey.topic", containerFactory="jmsListenerContainerTopic")
	public void consume2(String message) {
		System.out.println("consume2:" + message);
	}
}
