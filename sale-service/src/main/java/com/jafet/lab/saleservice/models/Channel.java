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
@Table(name="channel")
public class Channel implements Serializable {
	
	@Id
	@GeneratedValue
	private int idChannel;
	private String description;
	private String host;
	private int port;
	private String username;
	private String password;
	private String mainEmail;

	@OneToMany(mappedBy =  "channel")
	private List<Process> process = new ArrayList<>();
	
	public Channel() {
		
	}

	public Channel(String description, String host, int port, String username, String password, String mainEmail,
			List<Process> process) {
		super();
		this.description = description;
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
		this.mainEmail = mainEmail;
		this.process = process;
	}


	public int getIdChannel() {
		return idChannel;
	}

	public void setIdChannel(int idChannel) {
		this.idChannel = idChannel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMainEmail() {
		return mainEmail;
	}

	public void setMainEmail(String mainEmail) {
		this.mainEmail = mainEmail;
	}

	public List<Process> getProcess() {
		return process;
	}

	public void addProcess(Process process) {
		this.process.add(process);
	}

	
	
}
