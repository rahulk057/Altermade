package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientBillingAddress;

@Service
public interface ClientBillingAddressService {

	ClientBillingAddress createClientAddress(ClientBillingAddress client);
	ClientBillingAddress updateClientAddress(ClientBillingAddress client, int clientid);
	ClientBillingAddress getUserByIdAddress(Integer clientid);
    List<ClientBillingAddress> getAllClientAddress();
    void deleteUserAddress(Integer clientid);	
}
