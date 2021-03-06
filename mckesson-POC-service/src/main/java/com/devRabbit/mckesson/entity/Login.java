package com.devRabbit.mckesson.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Login implements Serializable  {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String userName;
	private String password;
	private Boolean isActive=true;
	private int wrongPasswordAttempt=0;
	private Boolean isLocked=false;
	
	
	public Login() {}
	
	public Login(String username,String pwd) 
	{
		this.userName=username;
		this.password=pwd;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public int getWrongPasswordAttempt() {
		return wrongPasswordAttempt;
	}


	public void setWrongPasswordAttempt(int wrongPasswordAttempt) {
		this.wrongPasswordAttempt = wrongPasswordAttempt;
	}


	public Boolean getIsLocked() {
		return isLocked;
	}


	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}
	
	
	

}
