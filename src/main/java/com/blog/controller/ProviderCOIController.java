package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ProviderCOI;
import com.blog.entity.ProviderTraining;
import com.blog.service.ProviderCOIService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ProviderCOIController {

	@Autowired
	ProviderCOIService providerCOIService;
	
	@PostMapping("/saveproviderCOI")
	public ResponseEntity<ProviderCOI> insertproviderCOI(@RequestBody ProviderCOI providerCOI){
		ProviderCOI saveProviderCOI =providerCOIService.saveProvidercoi(providerCOI);
		return ResponseEntity.ok(saveProviderCOI);
		
	}
	
	   @GetMapping("/providerCoi/{id}")
	    public ResponseEntity<ProviderCOI> getClientById(@PathVariable Long id) {
		   ProviderCOI providerCoi = providerCOIService.getProviderCoiById(id);
	        if (providerCoi != null) {
	            return new ResponseEntity<>(providerCoi, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @GetMapping("/getAllproviderCoi")
	    public ResponseEntity<List<ProviderCOI>> getAllproviderTraining() {
	        List<ProviderCOI> providerTrainings = providerCOIService.getAllProviderCoi();
	        return new ResponseEntity<>(providerTrainings, HttpStatus.OK);
	    }
	    
	    
	
	
}
