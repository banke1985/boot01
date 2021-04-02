package com.zbk.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.zbk.springboot.mapper")
public class MonitorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorApiApplication.class, args);
	 
	}
	
	
	


}
