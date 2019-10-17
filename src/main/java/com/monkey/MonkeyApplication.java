package com.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class MonkeyApplication {
	
    public static void main( String[] args ){
        SpringApplication.run(MonkeyApplication.class, args);
    }
}
