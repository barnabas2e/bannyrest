package com.bannyrest.bannyrest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bannyrest.bannyrest.domain.Client;
import com.bannyrest.bannyrest.exceptions.ClientNotFoundException;
import com.bannyrest.bannyrest.services.ClientService;

@RestController
public class ClientController {
 
	private ClientService clientService;
	
	@Autowired
	public void setClientService(ClientService pClientService) {
		clientService = pClientService;
	}
	
	@GetMapping("/clients/{id}")
	public Client getClient(@PathVariable final Integer id) {
		try {
			return clientService.getClient(id);			
			//return clientService.getClient(pId)
				  //    .orElseThrow(() -> new ClientNotFoundException(pId));
		} catch (ClientNotFoundException ex) {
			throw ex;
		}					
	}
	
	@GetMapping("/clients")
	public List<Client> getClients() {
		
		return clientService.getClients();
	}
	
	@PostMapping("/clients")
	public void createClient(@RequestBody final Client pClient) {
		clientService.createClient(pClient);
		
	}
}
