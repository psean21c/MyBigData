package com.acc;

import com.acc.service.DogRepository;

public class TestDogRepository implements DogRepository {

    @Override
    public String getDogData() {
        return "Sheppard";
    }

	@Override
	public String drawDog() {
		return null;
	}

}

