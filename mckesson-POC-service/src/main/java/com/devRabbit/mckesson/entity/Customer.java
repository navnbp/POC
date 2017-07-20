package com.devRabbit.mckesson.entity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String name;
	
	@Embedded
	private Address address;
	
	@Embedded
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
