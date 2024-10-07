package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ClientMailingAddress;
import com.blog.entity.Enrollment;
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
	
	 @GetMapping("/getClientMailingAddress/{id}")
	    public ResponseEntity<ClientMailingAddress> getenrollmentById(@PathVariable Integer id) {
		 ClientMailingAddress clientMailingAddress = clientMailingAddressService.getUserClientMaillingAddress(id);
	        if (clientMailingAddress != null) {
	            return new ResponseEntity<>(clientMailingAddress, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @GetMapping("/getClientMailingAddress")
	    public ResponseEntity<List<ClientMailingAddress>> getAllproviderTraining() {
	        List<ClientMailingAddress> clientMailingAddresses = clientMailingAddressService.getAllClientClientMaillingAddress();
	        return new ResponseEntity<>(clientMailingAddresses, HttpStatus.OK);
	    }
}
