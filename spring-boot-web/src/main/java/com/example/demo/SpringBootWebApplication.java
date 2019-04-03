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
		
		userRepository.save(new UserEntity("������", 60, UserRole.ADMIN));
		UserEntity user = userRepository.findByUserName("������");
		System.out.println("����:" + user.getAge() + "," + "�̸�:" + user.getUserName() + "," + "������:" + user.getCreatedAt());
	}

}
