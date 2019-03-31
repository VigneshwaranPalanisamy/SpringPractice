package com.sample.spring.basic;

public class TrainingPlan {

	public static void main(String[] args) {
		Coach myCoach = new FootballCoach();
		System.out.println(myCoach.getTrainingDetails());
	}

}
