package com.sample.spring.mvc.forms;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@InitBinder
	public void customInitBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm") 
	public String showForm(Model theModel) { 

	    // create a student object Student 
	    Student theStudent = new Student();
	 
	    // add student object to the model 
	    theModel.addAttribute("student", theStudent); 

	    // add the country options to the model 
	    theModel.addAttribute("theCountryOptions", countryOptions); 

	    return "student-form"; 
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "student-form";
		} else {
			return "student-confirmation";
		}
	}
	
}
