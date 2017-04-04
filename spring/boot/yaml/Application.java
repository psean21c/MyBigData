package com.acc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acc.service.DogService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private DogService dogService;

	@Override
	public void run(String... args) {
		System.out.println("AutoConfiguration should have wired up our stuff");
        System.out.println("Let's see if we are dog-worthy...");
        if (dogService.requireDog()) {
            System.out.println(dogService.getDog());
            System.out.println(dogService.doDog());
        } else {
            System.out.println("No Dog for us :(");
        }
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}