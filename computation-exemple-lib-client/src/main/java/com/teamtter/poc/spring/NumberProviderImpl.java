package com.teamtter.poc.spring;

import com.teamtter.poc.spring.clientinterfaces.NumberProvider;

public class NumberProviderImpl implements NumberProvider {

	private int i = 0;

	@Override
	public int getANumber() {
		return ++i;
	}

}
