package com.example.demo.democontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	
	@GetMapping("/add")
	public int getSum(@RequestParam int a, @RequestParam int b) {
		
		int c = a+b;
		
		return c;
		
	}
}
