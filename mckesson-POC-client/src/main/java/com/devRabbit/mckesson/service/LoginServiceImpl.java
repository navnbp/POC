package com.devRabbit.mckesson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import com.devRabbit.mckesson.entity.Login;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private RestOperations restOperations;
	
	@Value("${service.url}")
	private String url;
	
	public Login validate() 
	{
		Login[] response =	restOperations.getForObject(url+"/login/all", Login[].class);
		System.out.println(response.length);
		
		return response[0];
	}
	
}
