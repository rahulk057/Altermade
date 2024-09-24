package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ProviderTraining;
import com.blog.service.ProviderTrainingService;

@RestController
@RequestMapping("/api")
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
}
