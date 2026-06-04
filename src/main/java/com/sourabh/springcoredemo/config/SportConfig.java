package com.sourabh.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sourabh.springcoredemo.common.Coach;
import com.sourabh.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
