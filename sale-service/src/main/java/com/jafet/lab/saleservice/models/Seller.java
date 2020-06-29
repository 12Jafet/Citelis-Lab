package com.jafet.lab.saleservice.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class Seller implements Serializable{
	@Id
	@GeneratedValue
	private int idSeller;
	private String description;
	
	@OneToMany(mappedBy =  "seller")
	private List<Process> process = new ArrayList<>();
	
	@OneToMany(mappedBy =  "seller")
	private List<Addresse> addresses = new ArrayList<>();
	
	
	
	public Seller() {
		super();
	}

	public Seller(int idSeller, String description, List<Addresse> addresses) {
		super();
		this.idSeller = idSeller;
		this.description = description;
		this.addresses = addresses;
	}
	
	public int getIdSeller() {
		return idSeller;
	}
	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Addresse> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Addresse> addresses) {
		this.addresses = addresses;
	}
	
	
}
