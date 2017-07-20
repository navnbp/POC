package com.devRabbit.mckesson.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class DebitMemo implements Serializable  {
	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	private Supplier supplier;
	
	@OneToOne
	private Customer customer;
	
	@OneToOne
	private Supplier thirdParty;
	
	@OneToOne
	private DistributionCenter distributionCenter;

	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Temporal(TemporalType.DATE)
	private Date loadDate;
	
	@Temporal(TemporalType.DATE)
	private Date debitMemoDate;
	
	private BigDecimal totalExtendedAmount;
	
	private BigDecimal totalExpectedAmount;
	
	@Enumerated(EnumType.STRING)
	private Recall recall;

	
	public DebitMemo() {}
	
	public DebitMemo(long id, Supplier supplier, Customer customer, Supplier thirdParty,
			DistributionCenter distributionCenter, Status status, Date loadDate, Date debitMemoDate,
			BigDecimal totalExtendedAmount, BigDecimal totalExpectedAmount, Recall recall) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.customer = customer;
		this.thirdParty = thirdParty;
		this.distributionCenter = distributionCenter;
		this.status = status;
		this.loadDate = loadDate;
		this.debitMemoDate = debitMemoDate;
		this.totalExtendedAmount = totalExtendedAmount;
		this.totalExpectedAmount = totalExpectedAmount;
		this.recall = recall;
	}

	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	public Recall getRecall() {
		return recall;
	}

//	public Recall getRecall(String recall) {
//
//		return recall.equalsIgnoreCase(Recall.YES.toString()) ? Recall.YES : Recall.NO;
//	}

	public void setRecall(Recall recall) {
		this.recall = recall;
	}

//	public void setRecall(String recall) {
//		this.recall = recall.equalsIgnoreCase(Recall.YES.toString()) ? Recall.YES : Recall.NO;
//
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Supplier getThirdParty() {
		return thirdParty;
	}

	public void setThirdParty(Supplier thirdParty) {
		this.thirdParty = thirdParty;
	}

	public DistributionCenter getDistributionCenter() {
		return distributionCenter;
	}

	public void setDistributionCenter(DistributionCenter distributionCenter) {
		this.distributionCenter = distributionCenter;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

//	public Status getStatus(String status) {
//		return status.equalsIgnoreCase(Status.OPEN.toString()) ? Status.OPEN : Status.CLOSED;
//
//	}

//	public void setStatus(String status) {
//		this.status = status.equalsIgnoreCase(Status.OPEN.toString()) ? Status.OPEN : Status.CLOSED;
//
//	}

	public Date getLoadDate() {
		return loadDate ;
	}

	// public void setLoadDate(Date loadDate) {
	// this.loadDate = loadDate;
	// }

	public Date getDebitMemoDate() {
		return debitMemoDate;
	}

	public void setDebitMemoDate(Date debitMemoDate) {
		this.debitMemoDate = debitMemoDate;
	}

	public BigDecimal getTotalExtendedAmount() {
		return totalExtendedAmount;
	}

	public void setTotalExtendedAmount(BigDecimal totalExtendedAmount) {
		this.totalExtendedAmount = totalExtendedAmount;
	}

	public BigDecimal getTotalExpectedAmount() {
		return totalExpectedAmount;
	}

	public void setTotalExpectedAmount(BigDecimal totalExpectedAmount) {
		this.totalExpectedAmount = totalExpectedAmount;
	}

}

enum Status {
	OPEN, CLOSED

}

enum Recall {
	YES, NO

}
