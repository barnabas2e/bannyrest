package com.bannyrest.bannyrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bannyrest.bannyrest.domain.Client;
import com.bannyrest.bannyrest.mappers.ClientMapper;

@Service
public class ClientServiceImpl implements ClientService {

	private ClientMapper clientMapper;
	
	@Autowired
	public void setClientMapper(ClientMapper pCLientMapper) {
		this.clientMapper = pCLientMapper;
	}
	
	@Override
	public Client getClient(Integer id) {
		return clientMapper.selectOne(id);
	}

	@Override
	public List<Client> getClients() {
		return clientMapper.findAll();
	}

	@Override
	public void createClient(Client pClient) {
		clientMapper.insertClient(pClient);
	}

}
