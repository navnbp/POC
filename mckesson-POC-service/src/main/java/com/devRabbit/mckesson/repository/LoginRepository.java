package com.devRabbit.mckesson.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.devRabbit.mckesson.entity.Login;


@Component
public interface LoginRepository extends JpaRepository<Login,Long> {
	
	public Optional<Login> findByUserName(String login);
}
