package com.sample.spring.basic;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkoutDetails() {
		return "Baseball coach instructions";
	}

	@Override
	public String getDailyFortune() {
		return "Have a good day!" + fortuneService.getFortune();
	}

}
