package com.tokyo.olympics.service.test;

import org.junit.Assert;
import org.junit.Test;

import com.tokyo.olympics.service.GenerateRandomnNumbers;
import com.tokyo.olympics.service.impl.GenerateRandomnNumbersImpl;

public class GenerateRandomnNumbersTest {

	GenerateRandomnNumbers generateRandomnNumbers = new GenerateRandomnNumbersImpl();
		
	
	//Valid Testcase 
	@Test 
	public void testgenerateRandomnNumber () {
		try {
			
			//u put a debug point on the below line and check what value came and assert if it is less than 100
			Integer N = generateRandomnNumbers.getRandomnNumberLessthanNumber(100);
			Assert.assertTrue("The Integer " + N.toString() + " is not less than 100", N>100);
		} catch (Exception e) {
			//in case of assert failure throw exception
			e.printStackTrace();
		}
	}
	
	// Invalid testcase user inputs number greaterthan 100
	@Test
	public void testgenerateRandomnNumberWithNMorethan100 () {
		try {
			
			//u put a debug point on the below line and check what value came and assert if it is less than 100
			//passing N value 150 , but our randomn generator should generate only number lessthan 100. If it is morethan 100 it should fail.
			Integer N = generateRandomnNumbers.getRandomnNumberLessthanNumber(150);
			//observe the difference in assert statements 
			Assert.assertTrue("The Integer " + N.toString() + " is less than 100", N>100);
		} catch (Exception e) {
			//in case of assert failure throw exception
			e.printStackTrace();
		}
	}
	
}
