package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.UserEntity;
import com.example.demo.model.UserRole;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootWebApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootWebApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		userRepository.save(new UserEntity("윤사장", 60, UserRole.ADMIN));
		UserEntity user = userRepository.findByUserName("윤사장");
		System.out.println("나이:" + user.getAge() + "," + "이름:" + user.getUserName() + "," + "생성일:" + user.getCreatedAt());
	}

}
