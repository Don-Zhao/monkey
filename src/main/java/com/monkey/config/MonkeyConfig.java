package com.monkey.config;

import java.util.Arrays;

import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class MonkeyConfig {
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				String[] beans = context.getBeanDefinitionNames();
				Arrays.sort(beans);
				for (String bean : beans) {
					System.out.println(bean);
				}
			}
			
		};
	}
	
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize(DataSize.ofMegabytes(2L));
		factory.setMaxRequestSize(DataSize.ofMegabytes(10L));
		return factory.createMultipartConfig();
	}
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource druidDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		return dataSource;
	}
}
