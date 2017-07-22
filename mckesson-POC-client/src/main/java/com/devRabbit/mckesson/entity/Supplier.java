package com.devRabbit.mckesson.entity;

import java.io.Serializable;




public class Supplier implements Serializable {

	private long id;
	
	private String name;

	private Address address;

	private ContactDetail contactDetails;

	private Supplier leadSupplier;
	private Boolean isLeadSupplier = false;
	private Boolean isThirdParty = false;

	public Supplier() {
	}

	public Supplier(long id, String name, Address address, ContactDetail contactDetails, Supplier leadSupplier,
			Boolean isLeadSupplier, Boolean isThirdParty) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactDetails = contactDetails;
		this.leadSupplier = leadSupplier;
		this.isLeadSupplier = isLeadSupplier;
		this.isThirdParty = isThirdParty;
	}

	public Boolean getIsLeadSupplier() {
		return isLeadSupplier;
	}

	public void setIsLeadSupplier(Boolean isLeadSupplier) {
		this.isLeadSupplier = isLeadSupplier;
	}

	public Boolean getIsThirdParty() {
		return isThirdParty;
	}

	public void setIsThirdParty(Boolean isThirdParty) {
		this.isThirdParty = isThirdParty;
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

	public Supplier getLeadSupplier() {
		return leadSupplier;
	}

	public void setLeadSupplier(Supplier leadSupplier) {
		this.leadSupplier = leadSupplier;
	}


	public ContactDetail getContactDetails() {
		return this.contactDetails;
	}

	public void setContactDetails(ContactDetail contactDetails) {
		this.contactDetails = contactDetails;
	}

}
