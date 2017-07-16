package com.devRabbit.mckesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestOperations;

import com.devRabbit.mckesson.entity.Login;
import com.devRabbit.mckesson.service.LoginService;

@Controller(value="/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	
	
	@GetMapping()
	public String login() 
	{
	String a;
	a="hi";
	System.out.println("fill");
		Login login= loginService.validate();
		return "login";
		
	}
	
	
	@PostMapping
	public String validate() 
	{
		
		return "login";
		
	}

}
