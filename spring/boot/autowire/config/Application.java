package com.acc.autowired.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String... args) {
		SpringApplication.run(Application.class);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("repo " + userRepository);
		System.out.println("serv " + userService);
	}
}
