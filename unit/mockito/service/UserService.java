package com.acc.mockito;

public class UserService {

	private UserManager manager;
	
	public UserService(){}

	public UserService(UserManager manager) {
		this.manager = manager;
	}
	
	public void save(String name){
		manager.save(name);
	}
	
	public int getUserCount(){
		try{
			return manager.getUserCount();
		} catch(Exception e){
			return -1;
		}

	}
}
