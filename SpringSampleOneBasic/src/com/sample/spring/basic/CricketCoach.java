package com.sample.spring.basic;

public class CricketCoach implements Coach{

	private FortuneService theFortuneService;
	
	private String status;

	public CricketCoach() {
		status = "New";
	}
	
	/*
	public CricketCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}*/
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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
