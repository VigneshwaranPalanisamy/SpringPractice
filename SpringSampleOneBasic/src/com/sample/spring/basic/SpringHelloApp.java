package com.sample.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);

		/*
		 * System.out.println(theCoach.getStatus()); theCoach.setStatus("Change - 1");
		 * System.out.println(theCoach.getStatus()); theCoach.setStatus("Change - 2");
		 * 
		 * CricketCoach theCoach2 = context.getBean("myCoach", CricketCoach.class);
		 * System.out.println(theCoach2.getStatus()); theCoach2.setStatus("Change - 3");
		 * System.out.println(theCoach2.getStatus());
		 * System.out.println(theCoach.getStatus()); theCoach.setStatus("Change - 1");
		 * System.out.println(theCoach.getStatus());
		 */
		
		// call methods on the bean
		System.out.println(theCoach.getTrainingDetails());
		
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
