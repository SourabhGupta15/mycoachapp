package com.sourabh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	
	// define our init method
//	@PostConstruct
//	public void doMyStartupStuff() {
//		System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
//	}
	
	// define our destroy method
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes:-)";
	}

}
