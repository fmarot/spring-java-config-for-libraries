package com.teamtter.poc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		MyApp myApp = new MyApp();
		myApp.start();
	}

	private void start() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppSpringConfig.class);
		MyLib theLib = context.getBean(MyLib.class);
		theLib.doSomeJob();
	}
}