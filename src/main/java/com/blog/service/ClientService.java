package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.Client;
import com.blog.payloads.ClientDto;
import com.blog.payloads.UserDto;

@Service
public interface ClientService {
	
	  Client createClient(Client client);
	    Client updateClient(Client client, int clientid);
	    Client getUserById(Integer clientid);
	    List<Client> getAllClient();
	    void deleteUser(Integer clientid);
		Client saveClient(Client client);	
		List<ClientDto> getAllClientNamesAndIds();
	    
		List<Client> getActiveClients();
		List<Client> getInactiveClients();
	    Client getClientById(Integer clientId);  // New method to get a client by ID


}
