package com.sample.spring.basic;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Day!!";
	}

}
