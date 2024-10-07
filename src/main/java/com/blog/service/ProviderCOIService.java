package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderCOI;
import com.blog.entity.ProviderTraining;

@Service
public interface ProviderCOIService {

	
	ProviderCOI saveProvidercoi(ProviderCOI providerCOI);
	ProviderCOI getProviderCoiById(Long id);  // New method to get a client by ID
    List<ProviderCOI> getAllProviderCoi();
}
