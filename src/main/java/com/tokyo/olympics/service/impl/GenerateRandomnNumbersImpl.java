package com.tokyo.olympics.service.impl;

import java.util.Random;

import com.tokyo.olympics.service.GenerateRandomnNumbers;

public class GenerateRandomnNumbersImpl implements GenerateRandomnNumbers {

	public Integer getRandomnNumberLessthanNumber(Integer n) {
		//TODO Use Randomn Utils to generate a number
		Random random = new Random();
		Integer randomInteger = random.nextInt(n);
		return randomInteger;
	}

}
