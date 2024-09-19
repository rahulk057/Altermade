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

import com.blog.entity.Client;
import com.blog.entity.ClientBillingAddress;
import com.blog.entity.ClientContact;
import com.blog.entity.ClientMailingAddress;
import com.blog.entity.User;
import com.blog.payloads.CategoryDto;
import com.blog.payloads.ClientDto;
import com.blog.payloads.UserDto;
import com.blog.repository.ClientRepository;
import com.blog.service.ClientService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin("*")
@Validated
public class ClientController {

	@Autowired
	private ClientService clientService;
	@Autowired
	private ClientRepository clientRepository;
	
//	 @PostMapping("/addClient")
//	    public ResponseEntity<?> createUser( @RequestBody Client client) {
////	        List<User> userEmail = userRepository.getUserByEmail(userDto.getEmail());
////	        if (!userEmail.isEmpty()) {
////	            return new ResponseEntity<>("User already exists with this emailid", HttpStatus.CONFLICT);
////	        }
//
//		 Client addClient = clientService.createClient(client);
//	        return new ResponseEntity<>(addClient, HttpStatus.CREATED);
//	    }

	 
	 @PostMapping("/addClient")
	    public ResponseEntity<Client> createClient(@RequestBody Client client) {
	        Client savedClient =clientService.saveClient(client);
	        return ResponseEntity.ok(savedClient);
	    }

	
	 @GetMapping("/ClientNamesAndIds")
	    public ResponseEntity<List<ClientDto>> getClientNamesAndIds() {
	        List<ClientDto> clients = clientService.getAllClientNamesAndIds();
	        return new ResponseEntity<>(clients, HttpStatus.OK);
	    }
	 
	 @GetMapping("/getAllClient")
	    public ResponseEntity<List<Client>> getAllClient() {
	        List<Client> clients = clientService.getAllClient();
	        return new ResponseEntity<>(clients, HttpStatus.OK);
	    }
	 
	 @GetMapping("/getActiveClient")
	    public ResponseEntity<List<Client>> getActiveClients() {
	        List<Client> activeClients = clientService.getActiveClients();
	        return new ResponseEntity<>(activeClients, HttpStatus.OK);
	    }
	 
	 @GetMapping("/getInActiveClient")
	    public ResponseEntity<List<Client>> getInActiveClient() {
	        List<Client> activeClients = clientService.getInactiveClients();
	        return new ResponseEntity<>(activeClients, HttpStatus.OK);
	    }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<Client> getClientById(@PathVariable Integer id) {
	        Client client = clientService.getClientById(id);
	        if (client != null) {
	            return new ResponseEntity<>(client, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
}
	
