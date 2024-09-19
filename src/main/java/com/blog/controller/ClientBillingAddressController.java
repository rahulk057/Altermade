package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Client;
import com.blog.entity.ClientBillingAddress;
import com.blog.service.ClientBillingAddressService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin("*")
@Validated
public class ClientBillingAddressController {
	
	@Autowired
	private ClientBillingAddressService clientBillingAddressService;
	
	 @PostMapping("/addClientBillingAddress")
	    public ResponseEntity<?> createClientBillingAddress( @RequestBody ClientBillingAddress  clientBillingAddress) {
		 ClientBillingAddress addClient = clientBillingAddressService.createClientAddress(clientBillingAddress);
	        return new ResponseEntity<>(addClient, HttpStatus.CREATED);
	    }
	

}
