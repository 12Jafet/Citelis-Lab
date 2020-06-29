package com.jafet.lab.saleservice.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="addresse")
public class Addresse implements Serializable {
	@Id
	@GeneratedValue
	private int idAddresse;
	private String firstName;
	private String lastName;
	private String email;
	private String position;
	@ManyToOne
	private Seller seller;
	@ManyToOne
	private Process process;
	
	
	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Addresse() {
		super();
	}
	
	public Addresse(int idAddresse, String firstName, String lastName, String email, String position, Seller seller) {
		super();
		this.idAddresse = idAddresse;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.position = position;
		this.seller = seller;
	}
	
	public int getIdAddresse() {
		return idAddresse;
	}
	public void setIdAddresse(int idAddresse) {
		this.idAddresse = idAddresse;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
	
	
}
