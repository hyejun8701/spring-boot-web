package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.SchoolService;

@SpringBootApplication
public class ManyToOneRun {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ManyToOneRun.class, args);
		
		SchoolService schoolService = context.getBean(SchoolService.class);
		schoolService.findStudentInfo();
	}

}
