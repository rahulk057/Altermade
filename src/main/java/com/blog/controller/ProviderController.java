package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Client;
import com.blog.entity.Provider;
import com.blog.payloads.ProviderDto;
import com.blog.repository.ProviderRepository;
import com.blog.service.ProviderService;

@RestController
@RequestMapping("/api/provider")
@CrossOrigin("*")
@Validated
public class ProviderController {

	@Autowired
    private ProviderRepository providerRepository;
	
	@Autowired
	private ProviderService providerService;
	
	
	
	 @PostMapping("/addProvider")
	    public ResponseEntity<Provider> createClient(@RequestBody Provider provider) {
	        Provider savedClient =providerService.saveProviderDetails(provider);
	        return ResponseEntity.ok(savedClient);
	    }
	 
//	 @GetMapping("/getAllProvider")
//	    public ResponseEntity<List<Provider>> getAllprovider() {
//	        List<Provider> provider = providerService.getAllProvider();
//	        return new ResponseEntity<>(provider, HttpStatus.OK);
//	    }
	 
	 @GetMapping("/getAllProvider")
	 public ResponseEntity<List<ProviderDto>> getAllProviders() {
	     List<ProviderDto> providerDTOs = providerService.getAllProvider();
	     return new ResponseEntity<>(providerDTOs, HttpStatus.OK);
	 }
	 
	 
	 @GetMapping("/getActiveProvider")
	    public ResponseEntity<List<Provider>> getActiveClients() {
	        List<Provider> activeProvider = providerService.getActiveProvider();
	        return new ResponseEntity<>(activeProvider, HttpStatus.OK);
	    }
	 
	 @GetMapping("/getInActiveProvider")
	    public ResponseEntity<List<Provider>> getInActiveClient() {
	        List<Provider> InActiveProvider = providerService.getInactiveProvider();
	        return new ResponseEntity<>(InActiveProvider, HttpStatus.OK);
	    }

}
