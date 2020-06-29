package com.jafet.lab.saleservice.beans;

public class ContactHolder {
	int module;
	int process;
//	Client client;
	String firstName;
	String lastName;
	String email;
	String message;

	public ContactHolder() {
		
	}
	
	public ContactHolder(int module, int process, String firstName, String lastName, String email, String message) {
		super();
		this.module = module;
		this.process = process;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.message = message;
	}

	public int getModule() {
		return module;
	}

	public void setModule(int module) {
		this.module = module;
	}

	public int getProcess() {
		return process;
	}

	public void setProcess(int process) {
		this.process = process;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
