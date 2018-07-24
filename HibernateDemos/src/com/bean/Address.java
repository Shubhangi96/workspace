package com.bean;

public class Address {

	private long aid;
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	private Employee e; //without foreign key one to one 
	public Address(String addressLine1, String city, String state, String country, Employee e) {
		super();
		this.aid = aid;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.e = e;
	}
	public Address() {
		super();
	}
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	
	
}
