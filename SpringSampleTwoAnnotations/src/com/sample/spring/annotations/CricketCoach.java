package com.sample.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class CricketCoach implements Coach{
	
	private FortuneService theHappyFortuneService;
	
	@Autowired
	  public void loadDependency1(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
	  System.out.println("Dependency (Method) injection : "+theFortuneService.
	  getClass()); theHappyFortuneService = theFortuneService; }
	 
	
	private FortuneService otherFortuneService;
	
	@Autowired
	public void loadDependency2(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		 System.out.println("Dependency (Method) injection : "+theFortuneService.getClass());
		 otherFortuneService = theFortuneService; 
	}
	
	/*
	 * public CricketCoach(FortuneService theFortuneService) {
	 * System.out.println("Inside parameterized constructor");
	 * this.theFortuneService = theFortuneService; }
	 */
	
	private String status;
	
	public CricketCoach() { 
		System.out.println("Inside default constructor - - CricketCoach Class");
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
		return "--->> "+theHappyFortuneService.getFortune()+"\n--->> "+otherFortuneService.getFortune();
		//return "All is well !!";
	}

	@PostConstruct
	public void doInit() {
		System.out.println("Inside Init Method - CricketCoach Class");
	}
	@PreDestroy
	private void doDestroy() {
		System.out.println("Inside Destroy Method - CricketCoach Class");
	}
}
