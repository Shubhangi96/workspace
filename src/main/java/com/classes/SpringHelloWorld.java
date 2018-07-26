package com.classes;

public class SpringHelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message="Hello";
		this.message+= message;
	}
	

	
	

	public String sayHello()
	{
		return getMessage();
	}


}
