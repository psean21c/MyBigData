package com.acc.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("./com/acc/autowired/spring.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
