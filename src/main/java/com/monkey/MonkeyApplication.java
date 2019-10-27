package com.monkey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.monkey.mapper")
//@EnableScheduling   //开启定时任务
//@EnableAsync        //开启异步任务
//@EnableJms
public class MonkeyApplication extends SpringBootServletInitializer{
	
    public static void main( String[] args ){
        SpringApplication.run(MonkeyApplication.class, args);
    }

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MonkeyApplication.class);
	}
}
