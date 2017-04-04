package com.acc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.runner.RunWith;

import com.acc.service.DogRepository;
import com.acc.service.DogService;

@RunWith(SpringRunner.class)
@ActiveProfiles("unit-test")
@SpringBootTest(classes = {TestConfig.class}) 
public class DogTest extends AbstractTestNGSpringContextTests {


    @Autowired
    DogService dogService;

    @Autowired
    DogRepository dogRepository;

	@Test
	public void testDogService() throws Exception {
		dogService.requireDog();
		assertFalse("Unit Test profile sets wow to 4, should have been false", false);
	}

    @Test
    public void testDogRepository() throws Exception {
    	TestDogRepository testDog = new TestDogRepository();
        Assert.assertEquals("Dog Repository Test:", dogRepository.getDogData(), testDog.getDogData());
    }
    


    	
}