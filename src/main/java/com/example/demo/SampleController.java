package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SampleController {
	
	
	@GetMapping("/do")
	public String stormBreaker() {
		return "Hello World";
	}

}
