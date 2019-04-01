package com.sample.spring.annotations;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	@Value("${fortunes}")
	public String fortunes;
	
	public String fortunesList[] = new String[3];
	
	@PostConstruct
	public void doInit() {
		System.out.println("Inside PostConstruct Method - RandomFortuneService Class");
		fortunesList[0] = "Have a good day !!!";
		fortunesList[1] = "All is well !!!";
		fortunesList[2] = "May your wishes comes true !!!";
	}
	
	@SuppressWarnings("unused")
	private void doDestroy() {
		System.out.println("Inside Destroy Method - RandomFortuneService Class");
	}
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//System.out.println("Fortunes loaded from property file are:\n"+fortunes);
		//fortunesList = fortunes.split(",");
		int index = myRandom.nextInt(fortunesList.length);
		return fortunesList[index];
	}

}
