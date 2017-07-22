package com.devRabbit.mckesson.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.devRabbit.mckesson.config.RestServiceCall;
import com.devRabbit.mckesson.entity.Login;
import com.devRabbit.mckesson.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private RestServiceCall restServiceCall;
	
	
	
	public Login test() 
	{
	
		ResponseEntity<Login[]>response = restServiceCall.execute("/login/all", HttpMethod.GET, null, Login[].class);
	//	Login[] response =	restOperations.getForObject(url+"/login/all", Login[].class);
		System.out.println(response.getBody().length);
		
		return response.getBody()[0];
	}

	@Override
	public String validate(final Login login) {
		
		
		ResponseEntity<String> result= restServiceCall.execute("/login/validate", HttpMethod.POST,login,String.class);
		return result.getBody();
	}
	
}
