package com.bannyrest.bannyrest.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.bannyrest.bannyrest.domain.Client;
import com.bannyrest.bannyrest.services.ClientService;

public class ClientBootStrap implements CommandLineRunner {

	private ClientService clientService;
	
	@Autowired
	public void setClientService(ClientService pClientService) {
		this.clientService = pClientService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Client client1 = new Client();
		client1.setFirstName("James");
		client1.setLastName("Fred");		
		clientService.createClient(client1);
		
		System.out.println("Save client 1 record.....");
		
		Client client2 = new Client();
		client2.setFirstName("Nelson");
		client2.setLastName("Kinsley");		
		clientService.createClient(client2);
		
		System.out.println("Save client 2 record.....");
	}
}
