package com.sample.spring.basic;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String fortunes[] = {
			"Have a good day !!!",
			"All is well !!!",
			"May your wishes comes true !!!"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {	
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}
