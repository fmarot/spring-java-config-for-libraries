package com.teamtter.poc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teamtter.poc.spring.clientinterfaces.LibClientSpringConfig;

@Configuration
public class MyLibSpringConfig {

	/**
	 * This is the interesting part: we require the client to provide some beans
	 * but we help him by providing the interface he has to comply to
	 */
	@Autowired
	private LibClientSpringConfig clientConfig;

	@Bean
	public MyLib getMyLib() {
		return new MyLib();
	}

	@Bean(name = "numberGenerator1")
	public NumberGenerator getNumberGenerator1() {
		return new NumberGeneratorExempleImplConstructor(clientConfig.getNumberProvider());
	}

	@Bean(name = "numberGenerator2")
	public NumberGenerator getNumberGenerator2() {
		return new NumberGeneratorExempleImplConstructor(clientConfig.getNumberProvider());
	}

}