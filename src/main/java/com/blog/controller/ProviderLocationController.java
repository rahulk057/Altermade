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

import com.blog.entity.ProviderLocation;
import com.blog.entity.ProviderTraining;
import com.blog.service.ProviderLocationservice;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ProviderLocationController {
	
	@Autowired
	private ProviderLocationservice providerLocationservice;
	
	@PostMapping("/insertProviderLocation")
	public ResponseEntity<ProviderLocation> insertProviderLocation(@RequestBody ProviderLocation providerLocation){
		ProviderLocation saveProviderLocation=providerLocationservice.saveProviderLocation(providerLocation);
		return ResponseEntity.ok(saveProviderLocation);
		
	}
	
	@PutMapping("/updateProviderLocation/{id}")
    public ResponseEntity<ProviderLocation> updateProviderLocation(
            @PathVariable Long id,
            @RequestBody ProviderLocation providerLocation) {
        
        ProviderLocation updatedProviderLocation = providerLocationservice.updateProviderLocation(id, providerLocation);
        return ResponseEntity.ok(updatedProviderLocation);
    }
	
	@GetMapping("/providerLocation/{id}")
    public ResponseEntity<ProviderLocation> getClientById(@PathVariable Long id) {
		ProviderLocation providerLocation = providerLocationservice.getProviderLocationById(id);
        if (providerLocation != null) {
            return new ResponseEntity<>(providerLocation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	
	@GetMapping("/getAllProviderLocation")
    public ResponseEntity<List<ProviderLocation>> getAllClient() {
        List<ProviderLocation> providerLocations = providerLocationservice.getAllProviderLocation();
        return new ResponseEntity<>(providerLocations, HttpStatus.OK);
    }

}
