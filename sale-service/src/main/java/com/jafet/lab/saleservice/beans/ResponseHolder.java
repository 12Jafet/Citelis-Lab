package com.jafet.lab.saleservice.beans;

import java.util.List;

public class ResponseHolder{
	int module;
	int process;
	String processType;
	String clientEmail;
	List<String> addresseEmails;
	
	public ResponseHolder(){
		
	}

	public ResponseHolder(int module, int process, String processType, String clientEmail,
			List<String> addresseEmails) {
		super();
		this.module = module;
		this.process = process;
		this.processType = processType;
		this.clientEmail = clientEmail;
		this.addresseEmails = addresseEmails;
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
	
	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public List<String> getAddresseEmails() {
		return addresseEmails;
	}

	public void setAddresseEmails(List<String> addresseEmails) {
		this.addresseEmails = addresseEmails;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

}
