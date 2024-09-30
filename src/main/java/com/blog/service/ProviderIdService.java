package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderId;
import com.blog.entity.ProviderTraining;

@Service
public interface ProviderIdService {
	
	ProviderId saveProviderID(ProviderId providerId);
	
	ProviderId updateProviderId(Long id, ProviderId providerId);
	ProviderId getProviderIdById(Long id);  // New method to get a client by ID
    List<ProviderId> getAlProviderIds();


}
