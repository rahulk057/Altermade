package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Enrollment;
import com.blog.entity.Location;
import com.blog.service.EnrollmentService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class EnrollmentController {
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	@PostMapping("/saveEnrollment")
	public ResponseEntity<Enrollment> saveEnrollment(@RequestBody Enrollment enrollment){
		Enrollment saveEnrollment=enrollmentService.saveEnrollment(enrollment);
		return ResponseEntity.ok(saveEnrollment);
		
	}
	
	 @GetMapping("/getEnrollment/{id}")
	    public ResponseEntity<Enrollment> getenrollmentById(@PathVariable Long id) {
		 Enrollment enrollment = enrollmentService.getEnrollmentById(id);
	        if (enrollment != null) {
	            return new ResponseEntity<>(enrollment, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @GetMapping("/getEnrollment")
	    public ResponseEntity<List<Enrollment>> getAllproviderTraining() {
	        List<Enrollment> enrollments = enrollmentService.getEnrollment();
	        return new ResponseEntity<>(enrollments, HttpStatus.OK);
	    }
	    

}
