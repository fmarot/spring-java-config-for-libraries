package com.teamtter.poc.spring;
import com.teamtter.poc.spring.clientinterfaces.NumberProvider;


public class NumberGeneratorExempleImplConstructor implements NumberGenerator {

	private final NumberProvider libClientNumberProvider;

	public NumberGeneratorExempleImplConstructor(NumberProvider libClientNumberProvider) {
		this.libClientNumberProvider = libClientNumberProvider;
	}

	@Override
	public int add2Numbers() {
		int number1 = libClientNumberProvider.getANumber();
		int number2 = libClientNumberProvider.getANumber();
		int result = number1 + number2;
		return result;
	}

}
