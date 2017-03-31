package com.acc.autowired.sample2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public UserRepository userRepository() {
		System.out.println("repo from bean");
		return new UserRepository();
	}

	@Bean
	public UserService userService() {
		System.out.println("ser from bean");
		return new UserService();
	}
}