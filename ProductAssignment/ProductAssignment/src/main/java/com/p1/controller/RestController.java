package com.p1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RestController {

		@GetMapping("/")
		public String home() {
			return "This is home page";
		}
		
		
}
