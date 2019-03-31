package com.sample.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	public String fortunes[] = new String[3];
	
	public void doInit() {
		System.out.println("Inside Init Method - RandomFortuneService Class");
		fortunes[0] = "Have a good day !!!";
		fortunes[1] = "All is well !!!";
		fortunes[2] = "May your wishes comes true !!!";
	}
	
	private void doDestroy() {
		System.out.println("Inside Destroy Method - RandomFortuneService Class");
	}
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {	
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}
