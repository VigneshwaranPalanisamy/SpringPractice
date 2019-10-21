package com.sample.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// load the spring config using java configurations (No -XML)
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(SpringAnnotationConfig.class);
		
		// retrieve bean from spring container
		CricketCoach theCoach = context2.getBean("cricketCoach", CricketCoach.class);
		
		/*  System.out.println("1-> "+theCoach.getStatus()); 
		  theCoach.setStatus("Change - 1");
		  System.out.println("1-> "+theCoach.getStatus()); 
		  theCoach.setStatus("Change - 2");
		  System.out.println("1-> " +theCoach.getStatus());
		  
		  CricketCoach theCoach2 = context.getBean("cricketCoach", CricketCoach.class);
		  System.out.println("2-> "+theCoach2.getStatus()); 
		  theCoach2.setStatus("Change - 3");
		  System.out.println("2-> "+theCoach2.getStatus());
		  System.out.println("1-> "+theCoach.getStatus()); 
		  theCoach.setStatus("Change - 1");
		  System.out.println("1-> "+theCoach.getStatus());
		  System.out.println("2-> "+theCoach2.getStatus());
		*/
		// call methods on the bean
		System.out.println(theCoach.getTrainingDetails());
		
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context2.close();
	}

}
