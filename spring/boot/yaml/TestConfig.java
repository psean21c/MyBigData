package com.acc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.acc.service.DogRepository;

@Profile("unit-test")
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class TestConfig {

    @Bean
    public DogRepository dogRepository() {
        return new TestDogRepository();
    }
}