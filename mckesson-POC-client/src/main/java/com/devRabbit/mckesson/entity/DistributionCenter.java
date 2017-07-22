package com.devRabbit.mckesson.entity;

import java.io.Serializable;
import java.math.BigDecimal;




public class DistributionCenter implements Serializable {

	private long dcId;

	private String name;

	private Address address;
	

	private ContactDetail ContactDetails;
	private String deaNumber;
	private String ervMin;
	private BigDecimal writeOff;
	
	
	public DistributionCenter() {}



	public DistributionCenter(long dcId, String name, Address address, ContactDetail contactDetails, String deaNumber,
			String ervMin, BigDecimal writeOff) {
		super();
		this.dcId = dcId;
		this.name = name;
		this.address = address;
		ContactDetails = contactDetails;
		this.deaNumber = deaNumber;
		this.ervMin = ervMin;
		this.writeOff = writeOff;
	}

	public ContactDetail getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(ContactDetail contactDetails) {
		ContactDetails = contactDetails;
	}

	public long getDcId() {
		return dcId;
	}

	public void setDcId(long dcId) {
		this.dcId = dcId;
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

	public String getDeaNumber() {
		return deaNumber;
	}

	public void setDeaNumber(String deaNumber) {
		this.deaNumber = deaNumber;
	}

	public String getErvMin() {
		return ervMin;
	}

	public void setErvMin(String ervMin) {
		this.ervMin = ervMin;
	}

	public BigDecimal getWriteOff() {
		return writeOff;
	}

	public void setWriteOff(BigDecimal writeOff) {
		this.writeOff = writeOff;
	}

}
