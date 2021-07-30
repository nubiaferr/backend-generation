package com.helloworld.springTest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "<h1 style='text-align: center; font-size: 150px; color: #f542b6; margin-top: 8%;'>Hello World!</h1>"+
				"<p style='margin: 0 auto; width: 500px; text-align: center; font-size: 50px;'>Today I learned about growth mindset and attention to details.</p>";
	}
	
}

/*
 * public class HelloController {
	@GetMapping
	public String hello() {
		return "<h1 style='text-align: center; font-size: 150px; color: #f542b6; margin-top: 8%;'>Hello World!</h1>";
	}
	
	@GetMapping (value="/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String text(){
		return "<p style='margin: 0 auto; width: 500px; text-align: center; font-size: 50px;'>Today I learned about growth mindset and attention to details.</p>";
	}
	
}

 */
