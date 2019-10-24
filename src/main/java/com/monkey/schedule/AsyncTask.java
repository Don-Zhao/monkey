package com.monkey.schedule;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
//@Async
public class AsyncTask {
	
	public void task1() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("task1 time = " + (end - start));
	}
	
	public void task2() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(2000);
		long end = System.currentTimeMillis();
		System.out.println("task2 time = " + (end - start));
	}
	
	public void task3() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);
		long end = System.currentTimeMillis();
		System.out.println("task3 time = " + (end - start));
	}
	
	public Future<String> task4() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("task4 time = " + (end - start));
		return new AsyncResult<String>("task4");
	}
	
	public Future<String> task5() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(2000);
		long end = System.currentTimeMillis();
		System.out.println("task5 time = " + (end - start));
		return new AsyncResult<String>("task5");
	}
	
	public Future<String> task6() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);
		long end = System.currentTimeMillis();
		System.out.println("task6 time = " + (end - start));
		return new AsyncResult<String>("task6");
	}
}
