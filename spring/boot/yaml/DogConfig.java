package com.acc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acc.service.DogRepository;
import com.acc.service.DogRepositoryImpl;

@Configuration
public class DogConfig {
	
    @Bean
    public DogRepository dogRepository() {
        return new DogRepositoryImpl();
    }
}