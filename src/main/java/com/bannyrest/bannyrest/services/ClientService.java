package com.bannyrest.bannyrest.services;

import java.util.List;

import com.bannyrest.bannyrest.domain.Client;

public interface ClientService {
 
	Client findClientById(final Integer id);
	
	List<Client> findAllClients();
	
	void createClient(final Client client);
	
}
