package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientBillingAddress;
import com.blog.entity.ClientMailingAddress;

@Service
public interface ClientMailingAddressService {
	
	ClientMailingAddress createClientMaillingAddress(ClientMailingAddress client);
	ClientMailingAddress updateClientMaillingAddress(ClientMailingAddress client, int clientid);
	ClientMailingAddress getUserClientMaillingAddress(Integer clientid);
    List<ClientMailingAddress> getAllClientClientMaillingAddress();
    void deleteUserClientMaillingAddress(Integer clientid);

}
