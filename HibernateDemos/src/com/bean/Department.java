package com.bean;

public class Department {

	
	private long deptid;
	private String name;
	public Department(String name) {
		super();
		
		this.name = name;
	}
	public Department() {
		super();
	}
	public long getDeptid() {
		return deptid;
	}
	public void setDeptid(long deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
