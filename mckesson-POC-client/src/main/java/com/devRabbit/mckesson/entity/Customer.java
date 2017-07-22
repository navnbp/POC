package com.devRabbit.mckesson.entity;

import java.io.Serializable;



public class Customer implements Serializable {
	
	private long id;
	
	private String name;
	
	private Address address;
	
	private ContactDetail ContactDetails;

	public Customer() {
	}

	public Customer(long id, String name, Address address, ContactDetail contactDetails) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		ContactDetails = contactDetails;
	}

	public ContactDetail getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(ContactDetail contactDetails) {
		ContactDetails = contactDetails;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
