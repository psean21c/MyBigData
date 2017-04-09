package com.junit.chapter2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class) // 1)
public class ParameterizedTest {
	
	// 2)
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters  // 3) Signature : 
	// @Parameters public static java.util.Collection : w/o any parameters
	public static Collection<Integer[]> getTestParameters(){
		return Arrays.asList(new Integer[][] {
			{2,1,1},
			{3,2,1},
			{4,3,1}
		});
	}
	
	
	// 4)
	public ParameterizedTest(double expected, double valueOne, double valueTwo) {
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

//	public ParameterizedTest(double expected, double valueOne) {
//		this.expected = expected;
//		this.valueOne = valueOne;
//		
//	}

	@Test
	public void sum() { // 5)
		Calculator calc = new Calculator();   // 6)
		assertEquals(expected, calc.add(valueOne, valueTwo), 0); //7)
	}
	
}
