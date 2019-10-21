package com.sample.spring.basic;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
		
	public void setfortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkoutDetails() {
		return "Do fast bowling practice";
	}

	@Override
	public String getDailyFortune() {
		return "All is well ! " + fortuneService.getFortune();
	}

}
