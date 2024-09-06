package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/home")
	public String home(Model model) {
		//Sending data to view
		model.addAttribute("name","Substrings Technologies");
		model.addAttribute("youtubechannel","Sippets");
		model.addAttribute("githubRepository","https://github.com/Subash2622");
		return "home";
	}
	//About Page
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
	//Services Page 
	@RequestMapping("/services")
	public String servicesPage() {
		return "services";
	}
	//Contact Page
	@GetMapping("/contact")
	public String contact() {
		return new String("contact");
	}
	//Login Page
	@GetMapping("/login")
	public String login() {
		return new String("login");
	}
	//Signup Page
		@GetMapping("/register")
		public String register() {
			return new String("register");
		}

}
