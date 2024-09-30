package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderEnrollment;

@Service
public interface ProviderEnrollmentService {
	
	ProviderEnrollment saveProviderEnrollment(ProviderEnrollment providerEnrollment);
    ProviderEnrollment updateProviderEnrollment(Long id, ProviderEnrollment providerEnrollment); // Add this method
    ProviderEnrollment getProviderEnrollmentById(Long id);
    List<ProviderEnrollment> getAllProviderEnrollments();


}
