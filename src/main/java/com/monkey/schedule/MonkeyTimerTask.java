package com.monkey.schedule;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MonkeyTimerTask {
	
	//@Scheduled(fixedRate=2000) // 间隔两秒运行一次
//	@Scheduled(fixedDelay=2000)
	//@Scheduled(cron="*/2 * * * * MON-FRI")
	@Scheduled(fixedDelayString="3000")
	public void execute() {
		System.out.println("time : " + LocalDateTime.now());
	}
}
