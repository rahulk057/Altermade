package com.blog.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Client;
import com.blog.entity.ClientBillingAddress;
import com.blog.entity.ClientContact;
import com.blog.entity.ClientMailingAddress;
import com.blog.payloads.ClientDto;
import com.blog.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService  {
	
	@Autowired
    private ClientRepository clientRepository;
	 
	
	
	
	

    @Override
    public Client createClient(Client client) {
        // Implementation code
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client, int clientid) {
        // Implementation code
        return null;
    }

    @Override
    public Client getUserById(Integer clientid) {
        // Implementation code
        return clientRepository.findById(clientid).orElse(null);
    }

    @Override
    public List<Client> getAllClient() {
        // Implementation code
        return clientRepository.findAll();
    }

    @Override
    public void deleteUser(Integer clientid) {
        // Implementation code
        clientRepository.deleteById(clientid);
    }
    
    public Client saveClient(Client client) {
        Client client1 = new Client();
        client1.setClientName(client.getClientName());
        client1.setDba(client.getDba());
        client1.setStatus(client.getStatus());
        client1.setStartDate(client.getStartDate());
        client1.setPrimaryEmail(client.getPrimaryEmail());
        client1.setSecondaryEmail(client.getSecondaryEmail());
        client1.setCaqhExpirables(client.getCaqhExpirables());
        client1.setReCredentialing(client.getReCredentialing());
        client1.setSpeciality(client.getSpeciality());
        client1.setBillingType(client.getBillingType());
        client1.setScopeOfWork(client.getScopeOfWork());

        // Set Billing Address
        ClientBillingAddress cliBillingAddress = new ClientBillingAddress();
        cliBillingAddress.setAddress1(client.getClientBillingAddress().getAddress1());
        cliBillingAddress.setAddress2(client.getClientBillingAddress().getAddress2());
        cliBillingAddress.setCity(client.getClientBillingAddress().getCity());
        cliBillingAddress.setState(client.getClientBillingAddress().getState());
        cliBillingAddress.setZipCode(client.getClientBillingAddress().getZipCode());
        cliBillingAddress.setCountry(client.getClientBillingAddress().getCountry());
        cliBillingAddress.setPhone(client.getClientBillingAddress().getPhone());
        cliBillingAddress.setFax(client.getClientBillingAddress().getFax());
        cliBillingAddress.setEmail(client.getClientBillingAddress().getEmail());

        cliBillingAddress.setClient(client1);
        client1.setClientBillingAddress(cliBillingAddress);

        // Set Mailing Address
        ClientMailingAddress clientMailingAddress = new ClientMailingAddress();
        clientMailingAddress.setAddress1(client.getClientMailingAddress().getAddress1());
        clientMailingAddress.setAddress2(client.getClientMailingAddress().getAddress2());
        clientMailingAddress.setCity(client.getClientMailingAddress().getCity());
        clientMailingAddress.setState(client.getClientMailingAddress().getState());
        clientMailingAddress.setZipCode(client.getClientMailingAddress().getZipCode());
        clientMailingAddress.setCountry(client.getClientMailingAddress().getCountry());
        clientMailingAddress.setPhone(client.getClientMailingAddress().getPhone());
        clientMailingAddress.setFax(client.getClientMailingAddress().getFax());
        clientMailingAddress.setEmail(client.getClientMailingAddress().getEmail());

        clientMailingAddress.setClient(client1);
        client1.setClientMailingAddress(clientMailingAddress);

        // Set Contact
        ClientContact clientContact = new ClientContact();
        clientContact.setFirstName(client.getClientContact().getFirstName());
        clientContact.setLastName(client.getClientContact().getLastName());
        clientContact.setDesignation(client.getClientContact().getDesignation());
        clientContact.setPrimaryEmail(client.getClientContact().getPrimaryEmail());
        clientContact.setPrimaryPhone(client.getClientContact().getPrimaryPhone());

        clientContact.setClient(client1);
        client1.setClientContact(clientContact);

        return clientRepository.save(client1);
    }
    
    @Override
    public List<ClientDto> getAllClientNamesAndIds() {
        return clientRepository.findAll().stream()
                .map(client -> new ClientDto(client.getId(), client.getClientName()))
                .collect(Collectors.toList());
    }
    @Override
    public List<Client> getActiveClients() {
        return clientRepository.findByStatus("Active");
    }
    
    @Override
    public List<Client> getInactiveClients() {
        return clientRepository.findByStatus("Inactive");
    }
    
    @Override
    public Client getClientById(Integer clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }
}
