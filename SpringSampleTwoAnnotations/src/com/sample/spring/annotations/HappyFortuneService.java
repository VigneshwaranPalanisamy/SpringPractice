package com.sample.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Fortune: Have a good day !!!";
	}

}
