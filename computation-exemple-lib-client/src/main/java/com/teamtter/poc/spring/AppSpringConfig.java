package com.teamtter.poc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.teamtter.poc.spring.clientinterfaces.LibClientSpringConfig;
import com.teamtter.poc.spring.clientinterfaces.NumberProvider;

/**
 * Spring context of the client application. 2 important things to note:
 * <ul>
 * <el>we implement the interface provided by the lib in order to be sure we
 * provide everything it needs</el>
 * <el>we @import the library's spring context</el>
 * </ul>
 * ... and Spring's magic will automagically autowire everything
 */
@Configuration
@Import(MyLibSpringConfig.class)
public class AppSpringConfig implements LibClientSpringConfig {

	@Bean
	@Override
	public NumberProvider getNumberProvider() {
		return new NumberProviderImpl();
	}

}