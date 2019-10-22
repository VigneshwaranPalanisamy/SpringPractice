package com.sample.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

	
	@RequestMapping("/showForm")
	public String showMyForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processFormV3")
	public String processMyFormV3(@RequestParam("studentName") String name, Model model) {
		
		name = name.toUpperCase();
		
		model.addAttribute("message", "Yo! "+name);
		
		return "helloworldv2";
	}
	
	@RequestMapping("/processFormV2")
	public String processMyFormV2(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		model.addAttribute("message", "Yo !"+name);
		
		return "helloworldv2";
	}
	
	@RequestMapping("/processForm")
	public String processMyForm(HttpServletRequest request, Model model) {
		return "helloworld";
	}
}
