package com.sample.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	
	private FortuneService theFortuneService;
	
	@Autowired
	public void loadDependency(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		 System.out.println("Method injection");
		 this.theFortuneService = theFortuneService; 
	}
	
	/*
	 * public CricketCoach(FortuneService theFortuneService) {
	 * System.out.println("Inside parameterized constructor");
	 * this.theFortuneService = theFortuneService; }
	 */
	
	private String status;
	
	public CricketCoach() { 
		System.out.println("Inside default constructor");
		status = "New"; 
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//public void setTheFortuneService(FortuneService theFortuneService) {
	//	this.theFortuneService = theFortuneService;
	//}
	
	@Override
	public String getTrainingDetails() {
		return "Do a bowling practice today";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
		//return "All is well !!";
	}

}
