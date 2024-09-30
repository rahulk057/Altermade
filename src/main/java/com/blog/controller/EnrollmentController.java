package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Enrollment;
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

}
