package com.devRabbit.mckesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestOperations;
import org.springframework.web.servlet.ModelAndView;

import com.devRabbit.mckesson.entity.Login;
import com.devRabbit.mckesson.service.LoginService;

@Controller()

@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	
	
	@GetMapping
	public String login(Model model) 
	{	
		model.addAttribute("login", new Login());
		
//		Login login= loginService.test();
		return "login/login";

	}
	
	
	@PostMapping
	@ResponseBody
	public String validate(@ModelAttribute Login login) 
	{
		
		return loginService.validate(login);
		
	}

}
