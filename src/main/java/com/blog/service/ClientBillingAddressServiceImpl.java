package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ClientBillingAddress;
import com.blog.repository.ClientBillingAddressRepository;
import com.blog.repository.ClientRepository;

import ch.qos.logback.core.net.server.Client;

@Service
public class ClientBillingAddressServiceImpl implements ClientBillingAddressService{
	@Autowired
    private ClientRepository clientRepository;
	@Autowired
	private ClientBillingAddressRepository clientBillingAddressRepository;

//	@Override
////    public ClientBillingAddress createClientAddress(ClientBillingAddress clientBillingAddress) {
////        // Fetch the Client entity using client ID from the ClientBillingAddress
////        com.blog.entity.Client client = clientRepository.findById(clientBillingAddress.getClient().getId())
////                .orElseThrow(() -> new RuntimeException("Client not found"));
////
////        // Set the client in the ClientBillingAddress entity
////        clientBillingAddress.setClient(client);
////
////        // Save and return the ClientBillingAddress entity
////        return clientBillingAddressRepository.save(clientBillingAddress);
////    }

	@Override
	public ClientBillingAddress updateClientAddress(ClientBillingAddress client, int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientBillingAddress getUserByIdAddress(Integer clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientBillingAddress> getAllClientAddress() {
		// TODO Auto-generated method stub
		return clientBillingAddressRepository.findAll();
	}

	@Override
	public void deleteUserAddress(Integer clientid) {
		// TODO Auto-generated method stub
		clientBillingAddressRepository.deleteById(clientid);
	}

	@Override
	public ClientBillingAddress createClientAddress(ClientBillingAddress client) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
