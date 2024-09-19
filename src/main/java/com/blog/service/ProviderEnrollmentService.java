package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderEnrollment;

@Service
public interface ProviderEnrollmentService {
	
	ProviderEnrollment saveProviderEnrollment(ProviderEnrollment providerEnrollment);
    ProviderEnrollment updateProviderEnrollment(Long id, ProviderEnrollment providerEnrollment); // Add this method

}
