package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.Enrollment;

@Service
public interface EnrollmentService {
	
	Enrollment saveEnrollment (Enrollment enrollment);
	Enrollment getEnrollmentById (Long id);
    List<Enrollment>getEnrollment();
}
