package com.sourabh.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourabh.springcoredemo.common.Coach;

@RestController
public class DemoController {

	// define a private field for dependency
	private Coach myCoach;
	
//	private Coach anotherCoach;

	// define a constructor for dependency injection
	@Autowired
	public DemoController(@Qualifier("aquatic") Coach theCoach) {
		System.out.println("In constructor: " + getClass().getSimpleName());
		myCoach = theCoach;
//		anotherCoach = theAnotherCoach;
	}
	
	// define a setter method for dependency injection
//	@Autowired
//	public void setCoach(@Qualifier("tennisCoach") Coach theCoach) {
//		myCoach = theCoach;
//	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWork() {
		return myCoach.getDailyWorkout();
	}
	
//	@GetMapping("/check")
//	public String check() {
//		return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
//	}
}
