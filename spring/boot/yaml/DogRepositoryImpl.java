package com.acc.service;

public class DogRepositoryImpl implements DogRepository {

	@Override
	public String drawDog() {
        StringBuffer dog = new StringBuffer();
        dog.append("==========================").append("\n");
       
        dog.append("░░░░░░░░░▄░░░░░░░░░░░░░░▄").append("\n");
        dog.append("░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌").append("\n");
        dog.append("░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐").append("\n");
        dog.append("░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐").append("\n");
        dog.append("░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐").append("\n");
        dog.append("░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌").append("\n");
        dog.append("░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌").append("\n");
        dog.append("░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐").append("\n");
        dog.append("░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌").append("\n");
        dog.append("░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌").append("\n");
        dog.append("▌▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐").append("\n");
        dog.append("▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌").append("\n");
        dog.append("▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐").append("\n");
        dog.append("░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌").append("\n");
        dog.append("░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐").append("\n");
        dog.append("░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌").append("\n");
        dog.append("░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀").append("\n");
        dog.append("░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀").append("\n");
        dog.append("░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀");
       
        return dog.toString();
		
	}

	@Override
	public String getDogData() {
		return "Sheppard";
	}

}
