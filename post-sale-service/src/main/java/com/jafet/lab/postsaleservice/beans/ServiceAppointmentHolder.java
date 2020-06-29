package com.jafet.lab.postsaleservice.beans;

public class ServiceAppointmentHolder {
	int module;
	int process;
//	Client client;
	String firstName;
	String lastName;
	String email;
	String car;
	String date;
	String time;

	public ServiceAppointmentHolder() {
		
	}

	public ServiceAppointmentHolder(int module, int process, String firstName, String lastName, String email, String car,
			String date, String time) {
		super();
		this.module = module;
		this.process = process;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.car = car;
		this.date = date;
		this.time = time;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
