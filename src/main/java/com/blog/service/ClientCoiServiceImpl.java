package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ClientCOI;
import com.blog.repository.ClientCoiRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ClientCoiServiceImpl implements ClientCoiService {
	
	@Autowired
	private ClientCoiRepository clientCoiRepository;

	@Override
	public ClientCOI createClientCoi(ClientCOI clientCOI) {
		// TODO Auto-generated method stub
		return clientCoiRepository.save(clientCOI);
	}

	@Override
	public ClientCOI updateClientClientCoi(Long id, ClientCOI clientCOI) {
		 // Fetch the existing entity by ID
        Optional<ClientCOI> existingClientCoi = clientCoiRepository.findById(id);

        if (existingClientCoi.isPresent()) {
            ClientCOI updatedClientCoi = existingClientCoi.get();
            
            // Update fields with the new data from clientCOI
            updatedClientCoi.setClientName(clientCOI.getClientName());
            updatedClientCoi.setEffectiveDate(clientCOI.getEffectiveDate());
            updatedClientCoi.setExpirationDate(clientCOI.getExpirationDate());
            updatedClientCoi.setRetroDate(clientCOI.getRetroDate());
            updatedClientCoi.setCarrierName(clientCOI.getCarrierName());
            updatedClientCoi.setPolicyNumber(clientCOI.getPolicyNumber());
            updatedClientCoi.setExpiryMonitor(clientCOI.getExpiryMonitor());
            updatedClientCoi.setOccurrenceLimit(clientCOI.getOccurrenceLimit());
            updatedClientCoi.setAggregateLimit(clientCOI.getAggregateLimit());
            updatedClientCoi.setAddress(clientCOI.getAddress());
            updatedClientCoi.setAddress2(clientCOI.getAddress2());
            updatedClientCoi.setCity(clientCOI.getCity());
            updatedClientCoi.setState(clientCOI.getState());
            updatedClientCoi.setZipCode(clientCOI.getZipCode());
            updatedClientCoi.setCountry(clientCOI.getCountry());
            updatedClientCoi.setNotes(clientCOI.getNotes());

            // Save and return the updated entity
            return clientCoiRepository.save(updatedClientCoi);
        } else {
           
	        throw new RuntimeException("Client Coi not found with ID: " + id);
        }
    
	}

	@Override
	public ClientCOI getClientClientCoiById(Long id) {
		// TODO Auto-generated method stub
		return clientCoiRepository.getById(id);
	}

	@Override
	public List<ClientCOI> getClientCOIs() {
		// TODO Auto-generated method stub
		return clientCoiRepository.findAll();
	}

}
