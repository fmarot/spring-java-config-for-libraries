package com.teamtter.poc.spring;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamtter.poc.spring.clientinterfaces.NumberProvider;

public class NumberGeneratorExempleImplAutowired implements NumberGenerator {

	@Autowired
	private NumberProvider libClientNumberProvider;

	@Override
	public int add2Numbers() {
		int number1 = libClientNumberProvider.getANumber();
		int number2 = libClientNumberProvider.getANumber();
		int result = number1 + number2;
		return result;
	}

}
