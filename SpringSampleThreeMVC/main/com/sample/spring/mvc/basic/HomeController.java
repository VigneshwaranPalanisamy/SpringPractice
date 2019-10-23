package com.sample.spring.mvc.basic;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMainMenu() {
		return "main-menu";
	}
}
