package com.sample.spring.mvc.forms;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sample.spring.mvc.validations.PinCode;

public class Student {
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String firstName;
	
	@NotNull(message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=10,message="must be grater than or equals to 10")
	@Max(value=18,message="must be less than or equals to 18")
	private Integer age;
	
	@PinCode(value= {"641","123"},message="must start with 641 or 123")
	private String pinCode;
	
	private LinkedHashMap<String,String> countries;
	
	private String country;
	
	private String favLanguages;
	
	private String[] operatingSystems;
	
	public Student() {
		countries = new LinkedHashMap<>();
		countries.put("India", "India");
		countries.put("Brazil", "Brazil");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLanguages() {
		return favLanguages;
	}

	public void setFavLanguages(String favLanguages) {
		this.favLanguages = favLanguages;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public void setCountries(LinkedHashMap<String, String> countries) {
		this.countries = countries;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	
}
