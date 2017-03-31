package com.acc.autowired.sample2;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

//@Service
public class UserRepository {

//	@PostConstruct
	public void init() {
		System.out.println("repo from @service");
	}
}