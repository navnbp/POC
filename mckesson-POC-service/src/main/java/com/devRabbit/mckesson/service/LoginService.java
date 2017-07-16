package com.devRabbit.mckesson.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.entity.Login;

@Service
public interface LoginService {

	String validateUser(String userName, String password);

	void save(Login login);

	List<Login> findAll();

	Optional<Login> findByUserName(String userName);
	
	void delete();
	

}
