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

import com.blog.entity.ClientMailingAddress;
import com.blog.service.ClientMailingAddressService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin("*")
@Validated

public class ClientMailingAddressController {
	@Autowired
      ClientMailingAddressService clientMailingAddressService;	
	
	 @PostMapping("/addClientMailingAddress")
	    public ResponseEntity<?> createClientMailingAddress( @RequestBody ClientMailingAddress  clientMailingAddress) {
		 ClientMailingAddress addClient = clientMailingAddressService.createClientMaillingAddress(clientMailingAddress);
	        return new ResponseEntity<>(addClient, HttpStatus.CREATED);
	    }
	

}
