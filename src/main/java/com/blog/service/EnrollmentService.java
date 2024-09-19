package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.Enrollment;

@Service
public interface EnrollmentService {
	
	Enrollment saveEnrollment (Enrollment enrollment);

}
