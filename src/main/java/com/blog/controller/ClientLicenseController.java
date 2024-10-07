package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ClientLicense;
import com.blog.entity.ClientMailingAddress;
import com.blog.service.ClientLicenseService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ClientLicenseController {
  
	@Autowired
	private ClientLicenseService clientLicenseService;
	
	@PostMapping("/saveClientLicense")
	public ResponseEntity<ClientLicense> addClientLicense(@RequestBody ClientLicense clientLicense){
		
		ClientLicense saveClientLicense=clientLicenseService.saveClientLicense(clientLicense);
		return ResponseEntity.ok(saveClientLicense);
		
	}
	
	@PutMapping("/updateClientLicense/{id}")
    public ResponseEntity<ClientLicense> updateClientLicense(
            @PathVariable Long id,
            @RequestBody ClientLicense clientLicense) {

        ClientLicense updatedClientLicense = clientLicenseService.updateClientLicense(id, clientLicense);
        return ResponseEntity.ok(updatedClientLicense);
    }
	
	
	@GetMapping("/getClientLicense/{id}")
    public ResponseEntity<ClientLicense> getenrollmentById(@PathVariable Long id) {
		ClientLicense clientLicense = clientLicenseService.getClientLicenseByID(id);
        if (clientLicense != null) {
            return new ResponseEntity<>(clientLicense, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/getClientLicense")
    public ResponseEntity<List<ClientLicense>> getAllproviderTraining() {
        List<ClientLicense> clientLicenses = clientLicenseService.getAllClientLicenses();
        return new ResponseEntity<>(clientLicenses, HttpStatus.OK);
    }
}

