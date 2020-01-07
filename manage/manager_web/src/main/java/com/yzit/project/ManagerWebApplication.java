package com.yzit.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzit.project.dao")
public class ManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerWebApplication.class, args);
	}

}
