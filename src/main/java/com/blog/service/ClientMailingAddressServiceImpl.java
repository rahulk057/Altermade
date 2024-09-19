package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ClientMailingAddress;
import com.blog.repository.ClientMailingAddressRepository;
import com.blog.repository.ClientRepository;

@Service
public class ClientMailingAddressServiceImpl implements ClientMailingAddressService {

	 @Autowired
	    private ClientRepository clientRepository;

	    @Autowired
	    private ClientMailingAddressRepository clientMailingAddressRepository;
//
//	 @Override
//	    public ClientMailingAddress createClientMaillingAddress(ClientMailingAddress clientMailingAddress) {
//	        // Fetch the Client entity using client ID from the ClientMailingAddress
//	        com.blog.entity.Client client = clientRepository.findById(clientMailingAddress.getClient().getId())
//	                .orElseThrow(() -> new RuntimeException("Client not found"));
//
//	        // Set the client in the ClientMailingAddress entity
//	        clientMailingAddress.setClient(client);
//
//	        // Save and return the ClientMailingAddress entity
//	        return clientMailingAddressRepository.save(clientMailingAddress);
//	    }

	    @Override
	    public ClientMailingAddress updateClientMaillingAddress(ClientMailingAddress client, int clientid) {
	        // TODO Auto-generated method stub
	        return null;
	    }

	    @Override
	    public ClientMailingAddress getUserClientMaillingAddress(Integer clientid) {
	        // TODO Auto-generated method stub
	        return null;
	    }

	    @Override
	    public List<ClientMailingAddress> getAllClientClientMaillingAddress() {
	        // TODO Auto-generated method stub
	        return null;
	    }

	    @Override
	    public void deleteUserClientMaillingAddress(Integer clientid) {
	        // TODO Auto-generated method stub
	        
	    }

		@Override
		public ClientMailingAddress createClientMaillingAddress(ClientMailingAddress client) {
			// TODO Auto-generated method stub
			return null;
		}
}
