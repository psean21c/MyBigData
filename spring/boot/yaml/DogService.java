package com.acc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.config.DogSettings;

@Service
public class DogService {

    @Autowired
    private DogSettings dogSettings;

    @Autowired
    private DogRepository dogRepository;

    public boolean requireDog() {
        if (dogSettings.getWow() > 5 && dogSettings.isHappy() == true) {
            return true;
        }
        return false;
    }

    public String getDog() {
        return dogRepository.getDogData();
    }
    
    public String doDog() {
    	return dogRepository.drawDog();
    }
}