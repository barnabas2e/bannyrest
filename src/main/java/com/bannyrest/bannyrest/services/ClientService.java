package com.bannyrest.bannyrest.services;

import java.util.List;

import com.bannyrest.bannyrest.domain.Client;

public interface ClientService {
 
	Client getClient(final Integer id);
	
	List<Client> getClients();
	
	void createClient(final Client client);
	
}
