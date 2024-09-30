package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ProviderId;
import com.blog.service.ProviderIdService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ProviderIdController {
	
	@Autowired
	private ProviderIdService providerIdService;
	
	@PostMapping("/insertProviderID")
	public ResponseEntity<ProviderId> insertProviderID(@RequestBody ProviderId providerId){
		ProviderId saveProviderId=providerIdService.saveProviderID(providerId);
		return ResponseEntity.ok(saveProviderId);
		
	}
	
	  @PutMapping("/updateProviderID/{id}")
	    public ResponseEntity<ProviderId> updateProviderID(@PathVariable Long id, @RequestBody ProviderId providerId) {
	        ProviderId updatedProviderId = providerIdService.updateProviderId(id, providerId);
	        return ResponseEntity.ok(updatedProviderId);
	    }

}
