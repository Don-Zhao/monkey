package com.monkey.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *  点对点模型
 * @author zhao.jiahong
 *
 */
@Component
public class MonkeyJmsListener {
	
	@JmsListener(destination="monkey.queue")
	public void consume(String message) {
		System.out.println(message);
	}
}
