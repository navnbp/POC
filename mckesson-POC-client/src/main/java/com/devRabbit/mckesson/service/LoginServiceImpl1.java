//package com.devRabbit.mckesson.service;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestOperations;
//
//import com.devRabbit.mckesson.config.RestServiceCall;
//import com.devRabbit.mckesson.entity.Login;
//
//@Service
//public class LoginServiceImpl1 implements LoginService {
//
//	@Autowired
//	private RestServiceCall restServiceCall;
//	
//	
//	
//	public Login test() 
//	{
//	
//		ResponseEntity<Login[]>response = restServiceCall.execute("/login/all", HttpMethod.GET, null, Login[].class);
//	//	Login[] response =	restOperations.getForObject(url+"/login/all", Login[].class);
//		System.out.println(response.getBody().length);
//		
//		return response.getBody()[0];
//	}
//
//	@Override
//	public String validate(final Login login) {
//		
//		
//		ResponseEntity<String> result= restServiceCall.execute("/login/validate", HttpMethod.POST,login,String.class);
//		return result.getBody();
//	}
//	
//}
