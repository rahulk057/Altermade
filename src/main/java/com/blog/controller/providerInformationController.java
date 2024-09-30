package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ProviderId;
import com.blog.entity.ProviderInformation;
import com.blog.service.ProviderInformationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class providerInformationController {

	@Autowired
	ProviderInformationService providerInformationService;
	
	@PostMapping("/insertproviderInformation")
	public ResponseEntity<ProviderInformation> insertproviderInformation(@RequestBody ProviderInformation providerInformation){
		ProviderInformation saveProviderInformation=providerInformationService.saveProviderInformation(providerInformation);
		return ResponseEntity.ok(saveProviderInformation);
	}
	
	  @PutMapping("/updateproviderInformation/{id}")
	    public ResponseEntity<ProviderInformation> updateProviderInformation(@PathVariable Long id, @RequestBody ProviderInformation providerInformation) {
	        ProviderInformation updatedProviderInformation = providerInformationService.updateProviderInformation(id, providerInformation);
	        return ResponseEntity.ok(updatedProviderInformation);
	    }
	
	  @GetMapping("/getAllproviderInformation")
	    public ResponseEntity<List<ProviderInformation>> getAllProviderInformation() {
	        List<ProviderInformation> providerInformations = providerInformationService.getInformations();
	        return new ResponseEntity<>(providerInformations, HttpStatus.OK);
	    }
}
