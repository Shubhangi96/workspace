package com.bean;

public class Employee {


	private long eid;
	private String name;
	private String email;
	private Address a;
	private Department d;
	public Employee( String name, String email, Address a,Department d) {
		super();

		this.name = name;
		this.email = email;
		this.a = a;
		this.d=d;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public Employee() {
		super();
	}
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", a=" + a + ", d=" + d + "]";
	}




}
