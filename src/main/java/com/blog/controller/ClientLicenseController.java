package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ClientLicense;
import com.blog.service.ClientLicenseService;

@RestController
@RequestMapping("/api")
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
}

