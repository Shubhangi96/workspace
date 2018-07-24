package com.bean;

import java.sql.Date;

public class Complaint {

	private long compId;
	private String cDesc;
	private Customer customer;
	private Date dateOfComp;
	private String status;
	public Complaint() {
		super();
	}
	public Complaint(String cDesc, Customer customer, Date dateOfComp,String status) {
		super();
		this.cDesc = cDesc;
		this.customer = customer;
		this.dateOfComp = dateOfComp;
		this.setStatus(status);
	}
	@Override
	public String toString() {
		return "Complaint [compId=" + compId + ", cDesc=" + cDesc + ", customer=" + customer + ", dateOfComp="
				+ dateOfComp + "]";
	}
	public long getCompId() {
		return compId;
	}
	public void setCompId(long compId) {
		this.compId = compId;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getDateOfComp() {
		return dateOfComp;
	}
	public void setDateOfComp(Date dateOfComp) {
		this.dateOfComp = dateOfComp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
