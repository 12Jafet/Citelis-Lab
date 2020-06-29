package com.jafet.lab.saleservice.beans;

public class QuotationHolder {
	int module;
	int process;
//	Client client;
	String firstName;
	String lastName;
	String email;
	String car;
	String bank;
	int period;
	int deposit;
	
	
	public QuotationHolder(int module, int process, String firstName, String lastName, String email, String car,
			String bank, int period, int deposit) {
		super();
		this.module = module;
		this.process = process;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.car = car;
		this.bank = bank;
		this.period = period;
		this.deposit = deposit;
	}

	public QuotationHolder() {
		
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

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

}
