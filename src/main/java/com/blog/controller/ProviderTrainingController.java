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

import com.blog.entity.Client;
import com.blog.entity.ProviderTraining;
import com.blog.service.ProviderTrainingService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ProviderTrainingController {

	@Autowired
	ProviderTrainingService providerTrainingService;
	
	@PostMapping("/insertProviderTraining")
	public ResponseEntity<ProviderTraining> insertProviderTraining( @RequestBody ProviderTraining providerTraining){
		
		ProviderTraining saveProviderTraining=	providerTrainingService.savepProviderTraining(providerTraining);
		return ResponseEntity.ok(saveProviderTraining);
		
	}
	
	  // Update method
    @PutMapping("/updateProviderTraining/{id}")
    public ResponseEntity<ProviderTraining> updateProviderTraining(@PathVariable Long id, @RequestBody ProviderTraining providerTraining) {
        ProviderTraining updatedProviderTraining = providerTrainingService.updateProviderTraining(id, providerTraining);
        return ResponseEntity.ok(updatedProviderTraining);
    }
    
    @GetMapping("/providerTraining/{id}")
    public ResponseEntity<ProviderTraining> getClientById(@PathVariable Long id) {
    	ProviderTraining providerTraining = providerTrainingService.getProviderTrainingById(id);
        if (providerTraining != null) {
            return new ResponseEntity<>(providerTraining, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/getAllproviderTraining")
    public ResponseEntity<List<ProviderTraining>> getAllproviderTraining() {
        List<ProviderTraining> providerTrainings = providerTrainingService.getAllProviderTraining();
        return new ResponseEntity<>(providerTrainings, HttpStatus.OK);
    }
    
    
}
