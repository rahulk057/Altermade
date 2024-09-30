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

import com.blog.entity.ProviderEnrollment;
import com.blog.service.ProviderEnrollmentService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ProviderEnrollmentController {

	@Autowired
	ProviderEnrollmentService providerEnrollmentService;
	
	@PostMapping("/insertproviderEnrollment")
	public ResponseEntity<ProviderEnrollment> insertproviderEnrollment(@RequestBody ProviderEnrollment providerEnrollment){
		ProviderEnrollment saveEnrollment=providerEnrollmentService.saveProviderEnrollment(providerEnrollment);
		return ResponseEntity.ok(saveEnrollment);
	}
	
	
	@PutMapping("/updateProviderEnrollment/{id}")
    public ResponseEntity<ProviderEnrollment> updateProviderEnrollment(
            @PathVariable Long id, 
            @RequestBody ProviderEnrollment providerEnrollment) {
        
        ProviderEnrollment updatedEnrollment = providerEnrollmentService.updateProviderEnrollment(id, providerEnrollment);
        return ResponseEntity.ok(updatedEnrollment);
    }
}
