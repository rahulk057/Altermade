package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ProviderCOI;
import com.blog.service.ProviderCOIService;

@RestController
@RequestMapping("/api")
public class ProviderCOIController {

	@Autowired
	ProviderCOIService providerCOIService;
	
	@PostMapping("/saveproviderCOI")
	public ResponseEntity<ProviderCOI> insertproviderCOI(@RequestBody ProviderCOI providerCOI){
		ProviderCOI saveProviderCOI =providerCOIService.saveProvidercoi(providerCOI);
		return ResponseEntity.ok(saveProviderCOI);
		
	}
	
}
