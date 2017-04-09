package com.junit.chapter3;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
//import org.hamcrest.CoreMatchers;
//import org.hamcrest.Matcher;
//import org.hamcrest.Matchers;
//import static org.junit.Assert.assertThat;
//import static org.hamcrest.CoreMatchers.anyOf;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.JUnitMatchers.hasItem; // deprecated

public class HamcrestTest {

	private List<String> values;
	
	@Before
	public void setUpList() {
		values = new ArrayList<String>();
		values.add("x");
		values.add("y");
		values.add("z");
	}
	
	@Test
	public void testWithoutHamcrest(){
		assertTrue(values.contains("one")
				|| values.contains("two")
				|| values.contains("three"));
	}
	
	@Test
	public void testWithHamcrest() {
//		ArrayList<String> expected = hasItems(anyOf(equalTo("one"),equalTo("two"),equalTo("three")));
//		assertThat(actual, expected);
		
	}
	
/***
 * hasItems was deprecated @junit-4.12
    public static <T> void assertThat(T actual, Matcher<? super T> matcher) {
        assertThat("", actual, matcher);
    }
    	
 */
}
