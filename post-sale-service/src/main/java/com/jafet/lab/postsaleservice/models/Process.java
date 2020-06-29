package com.jafet.lab.postsaleservice.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="process")
public class Process implements Serializable{
	@Id
	@GeneratedValue
	private int idProcess;
	private String type;
	
	@ManyToOne
	private Seller seller;
	
	@ManyToMany
	private List <Client> clients = new ArrayList<>();
	
	@OneToMany(mappedBy =  "process")
	private List<Addresse> addresses = new ArrayList<>();
	
	@ManyToOne
	private Channel channel;

	public Process() {
		super();
	}

	public Process(String type) {
		super();
		this.type = type;
	}

	public int getIdProcess() {
		return idProcess;
	}

	public void setIdProcess(int idProcess) {
		this.idProcess = idProcess;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void addClient(Client client) {
		this.clients.add(client);
	}

	
	public List<Addresse> getAddresses() {
		return addresses;
	}

	public void addAddresse(Addresse addresses) {
		this.addresses.add(addresses);
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
}
