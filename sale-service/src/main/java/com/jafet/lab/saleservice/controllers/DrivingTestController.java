package com.jafet.lab.saleservice.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jafet.lab.saleservice.beans.DrivingTestHolder;
import com.jafet.lab.saleservice.beans.ResponseHolder;
import com.jafet.lab.saleservice.models.Addresse;
import com.jafet.lab.saleservice.models.Channel;
import com.jafet.lab.saleservice.models.Client;
import com.jafet.lab.saleservice.models.Process;
import com.jafet.lab.saleservice.repository.AddresseRepository;
import com.jafet.lab.saleservice.repository.ClientRepository;
import com.jafet.lab.saleservice.repository.ProcessRepository;

@RestController
public class DrivingTestController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private JavaMailSenderImpl mailConfig;
	
	@Autowired
	private ClientRepository  clientRepository;

	@Autowired
	private ProcessRepository  processRepository;
	
	@Autowired
	private AddresseRepository  addresseRepository;
		
	
	@PostMapping("sale/drivingTest")
	public ResponseHolder drivingTest(@RequestBody DrivingTestHolder holder){
		
		Client client = new Client(holder.getFirstName(),holder.getLastName(),holder.getEmail());
		Optional<Process> process = this.processRepository.findById(holder.getProcess());
		Channel channel = process.get().getChannel();
		
//save client and client-process

		client.addProcess(process.get());
		process.get().addClient(client);
		
		this.clientRepository.save(client);
		this.processRepository.save(process.get());
		
// Email config
		
		mailConfig.setHost(channel.getHost());
		mailConfig.setPort(channel.getPort());
		mailConfig.setUsername(channel.getUsername());
		mailConfig.setPassword(channel.getPassword());
		
// send email to client
		
        String messageCli = String.format(
        		"Que tal %s %s\nHemos recibido su cita para una prueba de manejo,"
        		+ " el %s a las %s con el auto %s",
        		client.getFirstName(), 
        		client.getLastName(),
        		holder.getDate(),
        		holder.getTime(),
        		holder.getCar() 
        		);
        
        SimpleMailMessage mailCli = new SimpleMailMessage();
        
		mailCli.setFrom(channel.getMainEmail());
		mailCli.setTo(client.getEmail());
		mailCli.setSubject(process.get().getType());
		mailCli.setText(messageCli);
		
		javaMailSender.send(mailCli);
		
		
//send email to addressee
		
		List<Addresse> addresse = this.addresseRepository.findBySellerAndProcess(
				process.get().getSeller(),
				process.get()
				);
		List<String> addresseEmails = new ArrayList<>();
		String messageAddr;
		
        SimpleMailMessage mailAdr = new SimpleMailMessage();
		
		for(Addresse addr : addresse) {
			
	        messageAddr = String.format(
	        		"Que tal %s %s %s\nEl cliente %s %s ha agendado una prueba de manejo,"
	        		+ "el %s a las %s, con el auto %s",
	        		addr.getFirstName(), 
	        		addr.getLastName(), 
	        		addr.getPosition(),
	        		client.getFirstName(), 
	        		client.getLastName(),
	        		holder.getDate(),
	        		holder.getTime(),
	        		holder.getCar() 
	        		);
			
			mailAdr.setFrom(channel.getMainEmail());
			mailAdr.setTo(addr.getEmail());
			mailAdr.setSubject(process.get().getType());
			mailAdr.setText(messageAddr);
			
			javaMailSender.send(mailAdr);
			
			addresseEmails.add(addr.getEmail());
		}
		
		ResponseHolder res = new ResponseHolder(
				holder.getModule(),
				holder.getProcess(),
				process.get().getType(),
				client.getEmail(),
				addresseEmails
				);
		
		return res;
	}
	
}
