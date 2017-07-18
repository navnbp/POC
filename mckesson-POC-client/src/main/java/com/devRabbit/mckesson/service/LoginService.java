package com.devRabbit.mckesson.service;

import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.entity.Login;

@Service
public interface LoginService {

	public Login test() ;
	public String validate(Login login ) ;
	
}
