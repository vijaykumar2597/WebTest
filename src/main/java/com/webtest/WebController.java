package com.webtest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
	
	@RequestMapping(path="/msg")
	public String getMessage() {
		return "Hello World";
	}

	@RequestMapping(path="/name")
	public String getName() {
		return "VijayKuma";
	}
	
	@RequestMapping(path="/wel/{name}")
	public String getWel(@PathVariable String name) {
		return "Welcome"+name;
	}
	
	@GetMapping(path="/getAge/{year}")
	public int getAge(@PathVariable("year") int y) {
		return 2023-y;
	}
	
	@GetMapping(path="/getNum/{num}")
	public String getNumber(@PathVariable int num) {
		 if(num%2==0) {
			return "Even";
		 }
		 else {
			 return "Odd";
		}
	}
		 
	     @GetMapping(path="/add/{a}/{b}")
		 public int add(@PathVariable int a, @PathVariable int b) {
			 return a+b;
		 }
		 
		 
	     @GetMapping(path="/check")
	 public String check(@RequestParam("userName") String name1,@RequestParam("password") String password) {
			 if(name1.equalsIgnoreCase("VijayKumar") && password.equalsIgnoreCase("1234")) {
				 return "Authorizied person";
			 }
			 else {
				 return "Unauthorized Person";
		 }
	 }
	     
	     @GetMapping(path="/getPen")
	     public Pen getPen(@RequestBody Pen pen) {
	    	 return pen;
	     }
	     
	     @GetMapping(path="/getPens")
	     public List<Pen> getPens(@RequestBody List<Pen> pens) {
	    	 return pens;
	     }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
