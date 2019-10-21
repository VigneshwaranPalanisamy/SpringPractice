package com.sample.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TrackCoach coach = context.getBean("myCoach",TrackCoach.class);
		
		System.out.println(coach.getDailyWorkoutDetails());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmail());
		
		System.out.println(coach.getMobile());
		
		System.out.println(coach.getExperience());
		
		/*Coach coach1 = context.getBean("myCricketCoach",Coach.class);
		
		System.out.println(coach1.getDailyWorkoutDetails());
		
		System.out.println(coach1.getDailyFortune());*/
		
		context.close();
	}
}
