package com.devRabbit.mckesson.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ContactDetail implements Serializable  {

	private String phone;
	private String emailId;
	
	public ContactDetail() {}
	public ContactDetail(String phone, String emailId) {
		super();
		this.phone = phone;
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}
