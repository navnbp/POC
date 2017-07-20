package com.devRabbit.mckesson.service.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.entity.Login;
import com.devRabbit.mckesson.repository.LoginRepository;
import com.devRabbit.mckesson.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public String validateUser(String userName, String password)  {

		Optional<Login> loginDetails = loginRepository.findByUserName(userName);

		if (loginDetails.isPresent()) {
			if (loginDetails.get().getPassword().equals(password))
				return "SUCCESS";
			else
				return "Wrong Password";
		} else {
				return "User Not Present";
			
		}

	}

	@Override
	public void addLogin(Login login) {
		loginRepository.save(login);

	}
	
	@Override
	public void delete() 
	{
		loginRepository.deleteAll();
		
	}

	@Override
	public List<Login> findAll() {
		return loginRepository.findAll();

	}

	@Override
	public Optional<Login> findByUserName(String userName) {
	
		return loginRepository.findByUserName(userName);
	}

}
