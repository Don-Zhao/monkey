package com.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@ServletComponentScan
public class MonkeyApplication extends SpringBootServletInitializer{
	
    public static void main( String[] args ){
        SpringApplication.run(MonkeyApplication.class, args);
    }

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MonkeyApplication.class);
	}
}
