package com.jafet.lab.saleservice.beans;

import java.util.Map;

public class Holder {
	int module;
	int process;
	Map<String, String> values;
	String email;
	
	public Holder() {
		
	}
	
	public Holder(int module, int process, Map<String, String> values, String email) {
		super();
		this.module = module;
		this.process = process;
		this.values = values;
		this.email = email;
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
	public Map<String, String> getValues() {
		return values;
	}
	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
