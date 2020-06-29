package com.jafet.lab.postsaleservice.beans;

public class SparePartsHolder {
	int module;
	int process;
//	Client client;
	String firstName;
	String lastName;
	String email;
	String car;
	String part;
	float price;

	public SparePartsHolder() {
		
	}

	public SparePartsHolder(int module, int process, String firstName, String lastName, String email, String car,
			String part, float price) {
		super();
		this.module = module;
		this.process = process;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.car = car;
		this.part = part;
		this.price = price;
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

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
