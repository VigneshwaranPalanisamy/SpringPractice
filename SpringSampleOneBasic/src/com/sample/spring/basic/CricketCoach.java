package com.sample.spring.basic;

public class CricketCoach implements Coach{

	private FortuneService theFortuneService;
	
	/*
	public CricketCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}*/
	
	public void setTheFortuneService(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
	
	@Override
	public String getTrainingDetails() {
		return "Do a bowling practice today";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
