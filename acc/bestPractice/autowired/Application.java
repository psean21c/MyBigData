package com.ccc;

import javax.inject.Inject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ccc.rabbitmq.DocumanConsumer;


@SpringBootApplication // = @Configuration + @EnableAutoConfiguration + @ComponentScan
@EnableScheduling
public class Application {

    @Inject
    DocumanConsumer documanConsumer;
    
    @Bean
    Inovatec buildApplication() {
    	documanConsumer.methodWrite();
        return new Inovatec("app01");
    }
     
    public static void main(String[] args) throws InterruptedException {
    	SpringApplication.run(Application.class, args);
    }

}
