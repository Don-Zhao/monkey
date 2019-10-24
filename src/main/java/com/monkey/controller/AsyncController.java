package com.monkey.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.schedule.AsyncTask;

@RestController
@RequestMapping("/async")
public class AsyncController {

	@Autowired
	private AsyncTask asyncTask;
	
	@RequestMapping("/no_result")
	public String execute1() throws InterruptedException {
		long start = System.currentTimeMillis();
		asyncTask.task1();
		asyncTask.task2();
		asyncTask.task3();
		long end = System.currentTimeMillis();
		System.out.println("execute1 time = " + (end - start));
		return "OK";
	}
	
	@RequestMapping("/result")
	public String execute2() throws InterruptedException {
		long start = System.currentTimeMillis();
		Future<String> task4 = asyncTask.task4();
		Future<String> task5 = asyncTask.task5();
		Future<String> task6 = asyncTask.task6();
		
		while (true) {
			if (task4.isDone() && task5.isDone() && task6.isDone()) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("execute1 time = " + (end - start));
		return "OK";
	}
}
