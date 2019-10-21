package com.sample.spring.basic;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String mobile;
	private float experience;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	@Override
	public String getDailyWorkoutDetails() {
		return "Track coach instructions";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach : " + fortuneService.getFortune();
	}
	
	

}
