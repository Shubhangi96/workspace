package com.bean;

import java.util.List;

public class Customer {
	
	private List<Complaint> cList;
	private String username;
	private String email;
	public Customer(String username, String email) {
		super();
		
		this.username = username;
		this.email = email;
	}
	public Customer() {
		super();
	}
	public List<Complaint> getcList() {
		return cList;
	}
	public void setcList(List<Complaint> cList) {
		this.cList = cList;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
