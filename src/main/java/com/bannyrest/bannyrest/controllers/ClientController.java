package com.bannyrest.bannyrest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.bannyrest.bannyrest.domain.Client;
import com.bannyrest.bannyrest.exceptions.ClientNotFoundException;
import com.bannyrest.bannyrest.services.ClientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "This is Client Controller" )
@RestController
public class ClientController {
 
	private ClientService clientService;
	
	@Autowired
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@GetMapping("/clients/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Client findClientById(@PathVariable final Integer id) {
		try {
			return clientService.findClientById(id);			
			//return clientService.getClient(pId)
				  //    .orElseThrow(() -> new ClientNotFoundException(pId));
		} catch (Exception ex) {
			throw new ClientNotFoundException(id);
		}					
	}
	
	@ApiOperation(value = "findAllClients: This is expected to return a list of clients", 
				  notes = "Some notes about this operation")
	@GetMapping("/clients")
	@ResponseStatus(HttpStatus.OK)
	public List<Client> findAllClients() {
		
		return clientService.findAllClients();
	}
	
	@PostMapping("/clients")
	@ResponseStatus(HttpStatus.CREATED)
	public void newClient(@RequestBody final Client client) {
		clientService.createClient(client);
	}
}
