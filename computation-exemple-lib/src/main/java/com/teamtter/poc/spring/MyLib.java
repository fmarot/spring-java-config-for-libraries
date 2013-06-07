package com.teamtter.poc.spring;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

/** Main lib entry point */
@Slf4j
public class MyLib {

	@Autowired
	private NumberGenerator numberGenerator1;
	@Autowired
	private NumberGenerator numberGenerator2;

	void doSomeJob() {
		int result1 = numberGenerator1.add2Numbers();
		int result2 = numberGenerator2.add2Numbers();
		log.info("result1= {}, result2= {}", result1, result2);
	}
}
