package com.p1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/login")
	public String viewLoginPage() {
		return "login";
	}
	
	@RequestMapping("/billing")
	public String billing() {
		return "billing";
	}
	
}
