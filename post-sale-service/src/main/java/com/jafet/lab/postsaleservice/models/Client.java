package com.jafet.lab.postsaleservice.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//import org.springframework.data.mongodb.core.mapping.Document;

@Entity
//@Document(collection="client")
@Table(name="client") 
public class Client implements Serializable {

	@Id
//	@org.springframework.data.annotation.Id
	@GeneratedValue
	private int idClient;
	private String firstName;
	private String lastName;
	private String email;
	
	@ManyToMany(mappedBy = "clients")
	private List <Process> process = new ArrayList<>();
	
	public Client() {
	}

	public Client(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}



	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
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

	public List<Process> getProcess() {
		return process;
	}

	public void addProcess(Process process) {
		this.process.add(process);
	}
	
	
}
