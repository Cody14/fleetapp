package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Client;
import com.codythegenius.fleetapp.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	//return List of all clients
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
	
	// save a new client
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	// find a client by id
	
	public Optional<Client> findById (Integer id) {
		return clientRepository.findById(id);

	}
	
	public void update(Client client) {
		clientRepository.save(client);
	}
	
	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}
}
